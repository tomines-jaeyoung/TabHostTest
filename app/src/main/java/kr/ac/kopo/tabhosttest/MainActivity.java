package kr.ac.kopo.tabhosttest;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        TabHost tabHost = getTabHost();
        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("Dog").setIndicator("강아지");
        tabSpecDog.setContent(R.id.tabDog);
        tabHost.addTab(tabSpecDog);

        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("Cat").setIndicator("고양이");
        tabSpecCat.setContent(R.id.tabArCat);
        tabHost.addTab(tabSpecCat);

        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("Horse").setIndicator("말");
        tabSpecHorse.setContent(R.id.tabAlHorse);
        tabHost.addTab(tabSpecHorse);

        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("Rabbit").setIndicator("토끼");
        tabSpecRabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(tabSpecRabbit);


    }
}