package com.raywenderlich.android.lab1.screens

@Composable
fun ColumnScreen(){
    MyColumn()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }

}
@Composable
fun  MyColumn(){

}