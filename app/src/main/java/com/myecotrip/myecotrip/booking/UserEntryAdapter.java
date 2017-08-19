package com.myecotrip.myecotrip.booking;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.myecotrip.myecotrip.R;
import com.myecotrip.myecotrip.booking.rowData.BookingReuest;

import java.util.List;

/**
 * Created by Gopal kumar on 18-08-2017.
 */

public class UserEntryAdapter extends RecyclerView.Adapter<UserEntryAdapter.UserEntryHolder> {

    private int count;
    private Context context;
    private List<BookingReuest.DetailBean> list;

    public UserEntryAdapter(List<BookingReuest.DetailBean> list, Context context){
        this.context=context;
        this.list=list;
    }
    @Override
    public UserEntryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_user_form,parent,false);
        return new UserEntryHolder(view);
    }

    @Override
    public void onBindViewHolder(UserEntryHolder holder, int position) {

        BookingReuest.DetailBean detailBean=list.get(position);
        if(!TextUtils.isEmpty(detailBean.getName())){

            holder.etName.setText(detailBean.getName());
        }
        else{

        }
        if(!TextUtils.isEmpty(detailBean.getAge())){

            holder.etAge.setText(detailBean.getAge());
        }
        else{

        }
        if(!TextUtils.isEmpty(detailBean.getSex())){

            if(detailBean.getSex().equalsIgnoreCase("M")){
                holder.checkBoxMale.setChecked(true);
            }
            else
            {
                holder.checkBoxFemale.setChecked(true);
            }
        }
        else {

        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserEntryHolder extends RecyclerView.ViewHolder {
        private EditText etName;
        private EditText etAge;
        private CheckBox checkBoxMale;
        private CheckBox checkBoxFemale;
        public UserEntryHolder(View itemView) {
            super(itemView);
            etName= (EditText) itemView.findViewById(R.id.etName);
            etAge= (EditText) itemView.findViewById(R.id.etAge);
            checkBoxMale= (CheckBox) itemView.findViewById(R.id.male);
            checkBoxFemale= (CheckBox) itemView.findViewById(R.id.feamale);
            etName.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                    final BookingReuest.DetailBean detailBean=list.get(getAdapterPosition());

                    detailBean.setName(s.toString());
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
            etAge.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                    final BookingReuest.DetailBean detailBean=list.get(getAdapterPosition());

                    detailBean.setAge(s.toString());
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });

            checkBoxMale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        checkBoxFemale.setChecked(false);
                        final BookingReuest.DetailBean detailBean=list.get(getAdapterPosition());

                        detailBean.setSex("M");
                    }
                }
            });
            checkBoxFemale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(isChecked){
                        checkBoxMale.setChecked(false);
                        final BookingReuest.DetailBean detailBean=list.get(getAdapterPosition());

                        detailBean.setSex("F");
                    }
                }
            });
        }
    }
    private void addTextWatcher(EditText editText, BookingReuest.DetailBean detailBean){

    }
}
