package com.pettinder.app.modules.screentwo.`data`.model

import com.pettinder.app.R
import com.pettinder.app.appcomponents.di.MyApp
import kotlin.String

data class ScreentwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMocha: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_mocha_catch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewfeed: String? = MyApp.getInstance().resources.getString(R.string.lbl_nearby)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnnalisarose: String? = MyApp.getInstance().resources.getString(R.string.lbl_rosi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMatchjulytwenty: String? = MyApp.getInstance().resources.getString(R.string.lbl_bucharest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupsix: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)

)
