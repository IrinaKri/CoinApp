package example.irina.coinapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

private const val LAST_ROLLED_IMAGE = "image"

class CoinRollFragment : Fragment() {

    lateinit var coinImageView: ImageView
    lateinit var rollButton: Button

    private val coinImageList: List<Int> = listOf(
        R.drawable.coin_head,
        R.drawable.coin_tail
    )
    var lastRolledImageRes = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_coin_roll, container, false)

        coinImageView = view.findViewById(R.id.coin_image_view)
        rollButton = view.findViewById(R.id.roll_button)
        if (savedInstanceState != null)
            coinImageView.setImageResource(savedInstanceState.getInt(LAST_ROLLED_IMAGE))

        rollButton.setOnClickListener {
            lastRolledImageRes = coinImageList.random()
            coinImageView.setImageResource(lastRolledImageRes)
        }

        return view
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(LAST_ROLLED_IMAGE, lastRolledImageRes)
    }


}