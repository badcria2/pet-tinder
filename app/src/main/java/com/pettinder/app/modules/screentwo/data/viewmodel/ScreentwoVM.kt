package com.pettinder.app.modules.screentwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pettinder.app.modules.screentwo.`data`.model.ScreentwoModel
import com.pettinder.app.modules.screentwo.`data`.model.ScreentwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScreentwoVM : ViewModel(), KoinComponent {
  val screentwoModel: MutableLiveData<ScreentwoModel> = MutableLiveData(ScreentwoModel())

  var navArguments: Bundle? = null

  val screentwoList: MutableLiveData<MutableList<ScreentwoRowModel>> =
      MutableLiveData(mutableListOf())
}
