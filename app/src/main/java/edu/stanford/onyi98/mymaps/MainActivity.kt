package edu.stanford.onyi98.mymaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import edu.stanford.onyi98.mymaps.models.UserMap
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set layout manager on the recycler view
        rvMaps.layoutManager = LinearLayoutManager(this)
        //set adapter on the recycler view
        rvMaps.adapter = MapsAdapter(this, emptyList<UserMap>())
    }
}