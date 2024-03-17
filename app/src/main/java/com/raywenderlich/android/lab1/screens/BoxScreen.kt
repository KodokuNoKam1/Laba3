package com.raywenderlich.android.lab1.screens

@Composable
fun BoxScreen(){
    MyBox()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun  MyBox(modifier: Modifier = Modifier){

}