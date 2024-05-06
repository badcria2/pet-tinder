package com.pettinder.app.modules.screenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pettinder.app.modules.screenone.`data`.model.ScreenoneModel
import org.koin.core.KoinComponent

class ScreenoneVM : ViewModel(), KoinComponent {
  val screenoneModel: MutableLiveData<ScreenoneModel> = MutableLiveData(ScreenoneModel())

  var navArguments: Bundle? = null
}
