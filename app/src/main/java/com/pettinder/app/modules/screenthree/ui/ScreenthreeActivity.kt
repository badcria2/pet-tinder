package com.pettinder.app.modules.screenthree.ui

import androidx.activity.viewModels
import com.pettinder.app.R
import com.pettinder.app.appcomponents.base.BaseActivity
import com.pettinder.app.databinding.ActivityScreenthreeBinding
import com.pettinder.app.modules.screenthree.`data`.viewmodel.ScreenthreeVM
import kotlin.String
import kotlin.Unit

class ScreenthreeActivity : BaseActivity<ActivityScreenthreeBinding>(R.layout.activity_screenthree)
    {
  private val viewModel: ScreenthreeVM by viewModels<ScreenthreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenthreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCREENTHREE_ACTIVITY"

  }
}
