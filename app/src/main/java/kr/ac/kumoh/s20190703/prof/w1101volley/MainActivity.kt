package kr.ac.kumoh.s20190703.prof.w1101volley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kr.ac.kumoh.s20190703.prof.w1101volley.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var queue: RequestQueue
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        queue = Volley.newRequestQueue(application)

        binding.btnConnect.setOnClickListener{
            val url = "https://yts.torrentbay.to/api/v2/list_movies.json?sort=rating&limit=30"
            val request = JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                {
                    Toast.makeText(application,
                        it.toString(), Toast.LENGTH_LONG).show()
                },
                {
                    Toast.makeText(application,
                        it.toString(), Toast.LENGTH_LONG).show()
                }

            )
            queue.add(request)

        }
    }

}