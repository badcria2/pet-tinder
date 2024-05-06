package com.pettinder.app.modules.screentwo.ui

import android.view.View
import androidx.activity.viewModels
import com.pettinder.app.R
import com.pettinder.app.appcomponents.base.BaseActivity
import com.pettinder.app.databinding.ActivityScreentwoBinding
import com.pettinder.app.modules.screentwo.`data`.model.ScreentwoRowModel
import com.pettinder.app.modules.screentwo.`data`.viewmodel.ScreentwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScreentwoActivity : BaseActivity<ActivityScreentwoBinding>(R.layout.activity_screentwo) {
  private val viewModel: ScreentwoVM by viewModels<ScreentwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val screentwoAdapter = ScreentwoAdapter(viewModel.screentwoList.value?:mutableListOf())
    binding.recyclerScreentwo.adapter = screentwoAdapter
    screentwoAdapter.setOnItemClickListener(
    object : ScreentwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ScreentwoRowModel) {
        onClickRecyclerScreentwo(view, position, item)
      }
    }
    )
    viewModel.screentwoList.observe(this) {
      screentwoAdapter.updateData(it)
    }
    binding.screentwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerScreentwo(
    view: View,
    position: Int,
    item: ScreentwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SCREENTWO_ACTIVITY"

  }
}
