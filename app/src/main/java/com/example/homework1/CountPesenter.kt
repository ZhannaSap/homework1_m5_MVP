package com.example.homework1

class CountPesenter(val counterView: CounterView) {

    var model = Injector.getModel()

    fun increment() {
        model.increment()
        counterView.showChangeCount(model.count)
    }

    fun showToast() {
        if (model.count == 10) {
            counterView.showToast()
        }
    }

    fun changeTextColor() {
        if (model.count == 15) {
            counterView.chaneTextColor()
        } else {
            counterView.chaneTextColorBack()
        }
    }

    fun decrement() {
        model.decrement()
        counterView.showChangeCount(model.count)
    }

}