package com.nutegg.rptest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RpActivity extends Activity {
	
	private TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rp);
		tv = (TextView)this.findViewById(R.id.tv);

		String name = getIntent().getStringExtra("name");
		if("���³�".equals(name)){
			
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ100��!���������������������Ű�!!");
		}else if("������".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ0��!����Сʱ���ϲ�����ʱ���Դ���¿����...����2015��֮��ò�ƾ�Ҫת����!!��Ϊ�и�������������Ű�������RP��!");
		}else if("������".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ100��!����Ҳ�Ǹ��˲Ű�!!��˵���и��ֵܽ�������!");
		}else if("�ܳ�Ⱥ".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ100��!һ�����־ͱض��Ǹ���Ⱥ�ľ�Ӣ��!�۲�����˵���һ�����д���!�ض�һ�ɳ��찡!");
		}else if("�Ԇ�".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ50��!�����ǿ���100�ֵ�,���˶���Ϊ��������һ���Ǽ��ϼӼ�,��ʵ���ı���ͨ��,����Ϊ���ӵ���˼...�����㶮��!");
		}else if("�����".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ100��!������,���������ڸı��ձ���һλ����˫ȫ�������,˫������,��������,����֮��Ҳ");
		}else if("������".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ85��!��Ϊ��,�����Ϊ����,��������β���������ϻ۵�����Ҫһ��ƴ�������귽�ܳɾ�һ������ҵ");
		}else if("��½��".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ86��!��������,��������,��½һ��Ϊĸ��,������ҵǱ��,������ȱ�����,������Ҫ��ǿ�Ƶ��˽����ܿ���,������Ҫ�ڼ�͵�,������ܲ���.");
		}else if("��ΰ��".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ95��!�Կ�����,����ҵҵ,������ҪһЩ�Ļ���Ұ�ķ��ܳɾ�һ����ҵ,���̤̤ʵʵ,�����׶���,������ˮ��ľ,���Ϊ���.");
		}else if("����Ⱥ".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ79��!���ж��,������Ϊ:��־����ʯ�����ڽ�ȡ�����š��ų����ѴﵽĿ����ʵ���ã����Ϳ˼�����ɴ󹦡�����������ϲ����ߣ����������ѵĶ򻼡�");
		}else if("����".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ88��!һ�����־��Ǹ�Ů���Ӱ�!!��������̫�ѷ���...ֻ�ܰ����������������Ҹ���75��");
		}else if("���".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ93��!˫����·,�и�,��������Ҫ����Ѱ�Ҳ���!��������,ǰ;��������.");
		}else if("��ϡ��".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ83��!һ·ƽ˳,���������һ���Լ�������...ĳ��ʱ�̵�ʱ,��Ҫ����!");
		}else if("�½�".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"����ƷΪ91��!���ŷ���:�����þ����������ǡ��º��д��л������ʾ��в������ӵľ��񡣱��濴���ƷǴ��ң����ڲ��̺����൱ʵ������ȡ���൱�ĳɹ������������������ͣ�������Ϊ�����졣���ɻ�ü�ͥ���Ҹ��������˺��м����ģ��󶼺ò�������������,һ�㶼���ƹ��ܶ�����,���ڴ�֮��");
		}
		else{
			tv.setTextSize(23);
			tv.setText(name+"...(Ŭ��������,�쳯���ݿ���Դȱ��!)");
		}
		
		
	}

}
