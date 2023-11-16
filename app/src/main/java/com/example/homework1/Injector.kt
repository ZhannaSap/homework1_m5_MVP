package com.example.homework1

class Injector {
    companion object {

        fun getModel(): CountModel {
            return CountModel()
        }

        fun getPresenter(view: CounterView): CountPesenter{
            return CountPesenter(view)
        }
    }
}