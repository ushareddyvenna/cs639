import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class  AppCompatActivity() {

    private lateinit var litersEditText: EditText
    private lateinit var convertButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var developerTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        litersEditText = findViewById(R.id.liters_edit_text)
        convertButton = findViewById(R.id.convert_button)
        resultTextView = findViewById(R.id.result_text_view)
        developerTextView = findViewById(R.id.developer_text_view)

        convertButton.setOnClickListener {
            convertLitersToCups()
        }

        developerTextView.text = "This app was developed by usha reddy venna"
    }

    private fun convertLitersToCups() {
        val liters = litersEditText.text.toString().toDoubleOrNull()
        if (liters != null && liters >= 0) {
            val cups = liters * 4.22
            resultTextView.text = "%.2f liters is equal to %.2f cups.".format(liters, cups)
        } else {
            resultTextView.text = "Please enter a valid non-negative number for liters."
        }
    }
}
