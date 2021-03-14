package com.example.jetpackpro.navigation;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jetpackpro.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    Button jumpBtn;
    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);;
        jumpBtn  = view.findViewById(R.id.jumpBtn);
        jump1();
        return view;
    }

    private void jump1(){
        jumpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Bundle bundle = new Bundle();
//                bundle.putString("name","水怪");
//                bundle.putInt("age",20);
//                Navigation.findNavController(v).navigate(R.id.action_mainFragment2_to_secondFragment,bundle);

//                Bundle bundle = new MainFragmentArgs.Builder().setName("水怪").setAge(20).build().toBundle();
//                Navigation.findNavController(v).navigate(R.id.action_mainFragment2_to_secondFragment,bundle);

                sendNotification();
            }
        });
    }


    private void sendNotification(){
        if(getActivity() == null){
            return;
        }
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("channel_id","channelName",importance);
            channel.setDescription("description");
            NotificationManager notificationManager = getActivity().getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
        NotificationCompat.Builder builder = new NotificationCompat
                .Builder(getActivity(),"channel_id")
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("这是通知标题")
                .setContentText("这是通知内容")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                .setContentIntent(getPendingIntent())
                .setAutoCancel(true);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(getActivity());
        notificationManagerCompat.notify(1,builder.build());
    }

    private PendingIntent getPendingIntent(){
        if(getActivity() != null){
            Bundle bundle = new Bundle();
            bundle.putString("params","this is the params");
            return Navigation.findNavController(getActivity(),R.id.jumpBtn)
                    .createDeepLink()
                    .setGraph(R.navigation.nav_graph)
                    .setDestination(R.id.secondFragment)
                    .setArguments(bundle)
                    .createPendingIntent();
        }
        return null;
    }

}
