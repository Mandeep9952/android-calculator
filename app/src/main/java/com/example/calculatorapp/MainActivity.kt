package com.example.calculatorapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    var number1: Float = 0.0f
    var isPlus: Boolean = false
    var isMinus: Boolean = false
    var isDivide: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.number_edit_text)
    }
    private fun numberClicked(numberClicked : Int){

        var number = editText.text.toString() + numberClicked.toString()
        editText.setText(number)
    }
    private fun dotClicked(){

        var number = editText.text.toString() + "."
        editText.setText(number)
    }
    private fun plusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isPlus = true
    }
    private fun minusClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isMinus = true
    }
    private fun divideClicked(){
        number1 = editText.text.toString().toFloat()
        editText.setText("")
        isDivide = true
    }
    private fun equalClicked(){
        val number2 = editText.text.toString().toFloat()
        val result = when {
            isPlus -> number1 + number2
            isMinus -> number1 - number2
            isDivide -> number1 / number2
            else -> throw Throwable("Wrong operation")
        }
        editText.setText(result.toString())
        isPlus = false
    }


    fun operationFunction(view: View) {

        when (view.id) {
            R.id.button_one -> {
                numberClicked(1)
            }
            R.id.button_two -> {
                numberClicked(2)
            }
            R.id.button_three -> {
                numberClicked(3)
            }
            R.id.button_four -> {
                numberClicked(4)
            }
            R.id.button_five -> {
                numberClicked(5)
            }
            R.id.button_six -> {
                numberClicked(6)
            }
            R.id.button_seven -> {
                numberClicked(7)
            }
            R.id.button_eight -> {
                numberClicked(8)
            }
            R.id.button_nine -> {
                numberClicked(9)
            }
            R.id.button_zero -> {
                numberClicked(0)
            }
            R.id.button_dot -> {
                dotClicked()
            }
            R.id.button_clear -> {
                editText.setText("")
            }
            R.id.button_plus -> {
                plusClicked()
            }
            R.id.button_minus -> {
                minusClicked()
            }
            R.id.button_divide -> {
                divideClicked()
            }
            R.id.button_equal -> {
                equalClicked()
            }

        }
    }

}