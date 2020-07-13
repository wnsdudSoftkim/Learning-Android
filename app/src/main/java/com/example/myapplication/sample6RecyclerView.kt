package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_sample6_recycler_view.*

class sample6RecyclerView : AppCompatActivity() {
    //뷰모델을 가져옴
    val viewModel : MyViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample6_recycler_view)
        //여기서 viewModel 의 mydata를 가져온 이유는 이 데이터를
        // 가져와야지만 RecyclerView 안에 데이터가 들어가니까 맨 위에 선언해줌.

        viewModel.mydata()
        //1부터 10까지 들어있는 데이터 를 만들어줌.
//        for (i in 0 until 10) {
//            val sampledata = sample6data("" + i, "" + i)
//            data.add(sampledata)
        //adapter 로 데이터와 Recylcer뷰를 연동시켜줌
        val adapter = RecyclerAdapter(viewModel.data, LayoutInflater.from(this))
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
        viewModel.Livedata.observe(this, Observer {
            //여기에 수시로 업데이트 할 데이터 넣어줌
        })
    }
}
class RecycleAdapter(

):RecyclerView.Adapter<RecycleAdapter.ViewHolder>(){
    inner class ViewHolder(view:View) :RecyclerView.ViewHolder(view){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecycleAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}

class RecyclerAdapter(
    val itemList: ArrayList<sample6data>,
    val inflater: LayoutInflater
    //반환하는건 ViewHolder 객체라고 알고있자.
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    //여기서 viewHolder는 필수 구현요소임.
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        //여기엔 아이템 객체가 들어있음 !
        val title =view.findViewById<TextView>(R.id.text_title)
        val description = view.findViewById<TextView>(R.id.text_description)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //여기서 아이템 뷰를 불러와서 뷰 홀더에 넣어줌.
        return ViewHolder(inflater.inflate(R.layout.sample6item, parent, false))

    }

    override fun getItemCount(): Int {
        //총 아이템 크기
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //아이템 하나에 대한 접근
        holder.title.setText(itemList[position].title)
        holder.description.setText(itemList[position].description)
    }
}
