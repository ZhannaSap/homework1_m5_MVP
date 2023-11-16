package com.example.homework1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import com.example.homework1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    val presenter = Injector.getPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnPlus.setOnClickListener {
                presenter.increment()
                presenter.showToast()
                presenter.changeTextColor()
            }
            btnMinus.setOnClickListener {
                presenter.decrement()
                presenter.showToast()
                presenter.changeTextColor()
            }
        }
    }

    override fun showChangeCount(count: Int) {
        binding.tvCount.text = count.toString()
    }

    override fun showToast() {
        Toast.makeText(this, getString(R.string.congrats), Toast.LENGTH_SHORT).show()
    }

    override fun chaneTextColor() {
        binding.tvCount.setTextColor(Color.GREEN)
    }

    override fun chaneTextColorBack() {
        binding.tvCount.setTextColor(Color.BLACK)
    }
}