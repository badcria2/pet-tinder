package com.pettinder.app.modules.screenfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pettinder.app.modules.screenfour.`data`.model.ScreenfourModel
import org.koin.core.KoinComponent

class ScreenfourVM : ViewModel(), KoinComponent {
  val screenfourModel: MutableLiveData<ScreenfourModel> = MutableLiveData(ScreenfourModel())

  var navArguments: Bundle? = null
}
