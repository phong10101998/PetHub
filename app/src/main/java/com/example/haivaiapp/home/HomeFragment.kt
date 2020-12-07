package com.example.haivaiapp.home


import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.haivaiapp.R
//import com.example.haivaiapp.addFragment
import com.uits.baseproject.base.BaseFragment
import com.uits.baseproject.widget.recycleView.SimpleDividerItemDecoration
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.viewholder_item_home.*

class HomeFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        return R.layout.fragment_home
    }


    private lateinit var mHomeAdapter: HomeAdapter

    override fun onInit() {
        super.onInit()
        mRecycleView.layoutManager = LinearLayoutManager(
            requireContext(),
            LinearLayoutManager.VERTICAL, false
        )
        mRecycleView.addItemDecoration(SimpleDividerItemDecoration(requireContext()))
        mHomeAdapter = HomeAdapter(requireContext()){
            Toast.makeText(context,it,Toast.LENGTH_SHORT).show()
//            (activity as AppCompatActivity).addFragment(OpenImageFragment(),R.id.frame)
        }
        mRecycleView.adapter = mHomeAdapter

    }

    override fun onViewCreated(view: View) {
    }

}