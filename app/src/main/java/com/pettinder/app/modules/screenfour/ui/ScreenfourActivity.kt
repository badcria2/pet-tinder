package com.pettinder.app.modules.screenfour.ui

import androidx.activity.viewModels
import com.pettinder.app.R
import com.pettinder.app.appcomponents.base.BaseActivity
import com.pettinder.app.databinding.ActivityScreenfourBinding
import com.pettinder.app.modules.screenfour.`data`.viewmodel.ScreenfourVM
import kotlin.String
import kotlin.Unit

class ScreenfourActivity : BaseActivity<ActivityScreenfourBinding>(R.layout.activity_screenfour) {
  private val viewModel: ScreenfourVM by viewModels<ScreenfourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenfourVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCREENFOUR_ACTIVITY"

  }
}
