package com.nutegg.rptest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	private EditText et;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et = (EditText)this.findViewById(R.id.editText1);
	}

	public void TestRp(View view){
		String name = et.getText().toString().trim();
		if(TextUtils.isEmpty(name)){
			Toast.makeText(this, "请输入姓名后再进行测试！", Toast.LENGTH_SHORT).show();
		}else{
			Intent intent = new Intent();
//			intent.setClassName("com.nutegg.rptest", "com.nutegg.rptest.RpActivity");
			intent.addCategory("android.intent.category.DEFAULT");
			intent.setAction("com.nutegg.rp");
			intent.setData(Uri.parse("rpname:XXX"));
			intent.putExtra("name", name);
			startActivity(intent);
		}
	}
}
