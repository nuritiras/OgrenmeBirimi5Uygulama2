package tr.com.nuritiras.ogrenmebirimi5uygulama2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            val toplam=topla()
            Toast.makeText(this, "Toplam: $toplam", Toast.LENGTH_SHORT).show()
        }
    }
    private fun topla(): Int {
        val sayi1 = findViewById<EditText>(R.id.editText1).text.toString().toInt()
        val sayi2 = findViewById<EditText>(R.id.editText2).text.toString().toInt()
        return sayi1 + sayi2
    }
}