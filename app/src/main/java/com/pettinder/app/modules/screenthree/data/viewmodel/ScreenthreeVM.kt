package com.pettinder.app.modules.screenthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pettinder.app.modules.screenthree.`data`.model.ScreenthreeModel
import org.koin.core.KoinComponent

class ScreenthreeVM : ViewModel(), KoinComponent {
  val screenthreeModel: MutableLiveData<ScreenthreeModel> = MutableLiveData(ScreenthreeModel())

  var navArguments: Bundle? = null
}
