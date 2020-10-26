package com.example.lab_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  val animalList =ArrayList<Animal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initAnimals()
        val adapter =AnimalAdapter(this,R.layout.animal_item,animalList)
        listView.adapter =adapter
        listView.setOnItemClickListener{ parent,view,position,id ->
            val animal = animalList[position]
            Toast.makeText(this,animal.name,Toast.LENGTH_SHORT).show()
        }
    }

    private fun initAnimals(){
        animalList.add(Animal("Lion",R.drawable.lion))
        animalList.add(Animal("monkey",R.drawable.monkey))
        animalList.add(Animal("cat",R.drawable.cat))
        animalList.add(Animal("dog",R.drawable.dog))
        animalList.add(Animal("elephant",R.drawable.elephant))
        animalList.add(Animal("owl",R.drawable.owl))
        animalList.add(Animal("alpaca",R.drawable.alpaca))
        animalList.add(Animal("panda",R.drawable.panda))
        animalList.add(Animal("sheep",R.drawable.sheep))
    }
}