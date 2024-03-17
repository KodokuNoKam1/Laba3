package com.raywenderlich.android.lab1.screens

@Composable
fun SurfaceScreen(modifier: Modifier = Modifier){

    Box(modifier = modifier.fillMaxSize()) {
        MySurface(modifier = modifier.align(Alignment.Center))
    }

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MySurface(modifier: Modifier){

}