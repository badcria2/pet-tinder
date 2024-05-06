package com.pettinder.app.modules.screenone.ui

import androidx.activity.viewModels
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.pettinder.app.R
import com.pettinder.app.appcomponents.base.BaseActivity
import com.pettinder.app.databinding.ActivityScreenoneBinding
import com.pettinder.app.modules.screenone.`data`.viewmodel.ScreenoneVM
import kotlin.String
import kotlin.Unit

class ScreenoneActivity : BaseActivity<ActivityScreenoneBinding>(R.layout.activity_screenone),
    OnMapReadyCallback {
  private val viewModel: ScreenoneVM by viewModels<ScreenoneVM>()

  private var mMap: GoogleMap? = null


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.screenoneVM = viewModel
    val mapFragment = supportFragmentManager.findFragmentById(R.id.mapMap) as?
    SupportMapFragment
    mapFragment?.getMapAsync(this)
  }

  override fun onMapReady(p0: GoogleMap): Unit {
    mMap = p0
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SCREENONE_ACTIVITY"

  }
}
