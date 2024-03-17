package com.raywenderlich.android.lab1.screens

@Composable
fun ScaffoldScreen(){
    MyScaffold()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyScaffold(){

}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState){

}

@Composable
fun MyBottomAppBar(){

}