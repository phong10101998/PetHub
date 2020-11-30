package com.example.haivaiapp.Home


import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.haivaiapp.R
import com.uits.baseproject.base.BaseFragment
import com.uits.baseproject.widget.recycleView.SimpleDividerItemDecoration
import kotlinx.android.synthetic.main.fragment_home.*

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
        mHomeAdapter = HomeAdapter(requireContext())
        mRecycleView.adapter = mHomeAdapter
    }

    override fun onViewCreated(view: View) {
    }
}