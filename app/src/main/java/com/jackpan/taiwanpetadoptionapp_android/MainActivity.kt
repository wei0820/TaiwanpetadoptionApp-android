package com.jackpan.taiwanpetadoptionapp_android

import android.content.Context
import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jackpan.taiwanpetadoptionapp_android.data.Book
import com.jackpan.taiwanpetadoptionapp_android.data.PetData
import com.jackpan.taiwanpetadoptionapp_android.databinding.ActivityMainBinding
import com.jackpan.taiwanpetadoptionapp_android.viewmodel.MyViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myViewModelFactory: MyViewModelFactory
    val  viewModel : MyViewModel by lazy {
        ViewModelProvider(this,myViewModelFactory).get(MyViewModel::class.java)
    }
    lateinit var adapter: ArrayAdapter<PetData>
    var array = ArrayList<PetData>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        myViewModelFactory = MyViewModelFactory(1111)

        viewModel.getData().observe(this, Observer {
            Log.d("jack","Ma:"+it)
        })
        viewModel.getPet().observe(this , Observer {
            adapter = ArrayAdapter(this,
                android.R.layout.simple_list_item_1,
                it)
            binding.list.adapter = adapter

            adapter.notifyDataSetChanged()

        })



        Book().apply {
            name = ""
            pirce = 100

        }.let {

        }
        Book().apply {  }.takeIf { it.pirce >=100 }.let {  }
        Book().run {
            name = ""
            pirce = 100
            pirce
        }.let { it }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }


}