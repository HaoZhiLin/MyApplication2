package max.jy.hzl.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.request.RequestOptions

class RlvAdapter(var mList: List<Result>, var mContext: Context) : RecyclerView.Adapter<RlvAdapter.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RlvAdapter.ViewHolder {
        val inflater = View.inflate(mContext, R.layout.rlv_item, null);
        return ViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(p0: RlvAdapter.ViewHolder, p1: Int) {
        Glide.with(mContext).load(mList.get(p1).url).apply(RequestOptions().circleCrop()).into(p0.iv);
        p0.desc.text=mList.get(p1).desc

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var desc : TextView
        lateinit var iv : ImageView
        init {
            desc=itemView!!.findViewById(R.id.desc);
            iv=itemView!!.findViewById(R.id.iv);
        }


    }

}