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
		if("吴新超".equals(name)){
			
			tv.setTextSize(23);
			tv.setText(name+"的人品为100分!此人是世间百年难遇的奇才啊!!");
		}else if("李敏柳".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为0分!估计小时候上厕所的时候脑袋被驴踢了...但是2015年之后貌似就要转运了!!因为有个百年难遇的奇才帮她提升RP了!");
		}else if("吴良飞".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为100分!此人也是个人才啊!!听说他有个兄弟叫吴良才!");
		}else if("周超群".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为100分!一看名字就必定是个超群的精英啊!聚测算此人的另一半名中带飞!必定一飞冲天啊!");
		}else if("赵喆".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为50分!本来是可以100分的,众人都以为吉吉合在一起是吉上加吉,其实喆的本意通哲,古意为孙子的意思...所以你懂的!");
		}else if("徐吴斌".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为100分!口能文,天武是早期改变日本的一位文武双全的天皇名,双人有余,能文擅武,人中之龙也");
		}else if("王月燕".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为85分!月为中,五格中为晚婚大吉,王姓与燕尾代表天生聪慧的人需要一番拼搏至中年方能成就一番大事业");
		}else if("胡陆云".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为86分!古月有云,古月有云,中陆一般为母姓,即有事业潜力,但往往缺乏坚持,命里需要与强势的人结伴才能克制,早期需要勤俭低调,后起才能勃发.");
		}else if("李伟鸿".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为95分!吃苦耐劳,兢兢业业,早年需要一些心机和野心方能成就一番大业,如果踏踏实实,则容易多劳,五行温水养木,五格为大大吉.");
		}else if("杜艳群".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为79分!五行多金,天格分析为:意志如铁石，富于进取的气概。排除万难达到目而名实两得，忍耐克己，逐成大功。但其他运配合不善者，可能有遭难的厄患。");
		}else if("王蕾".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为88分!一看名字就是个女汉子啊!!此人名字太难分析...只能按照三才五格分析姑且给个75分");
		}else if("王璐".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为93分!双王开路,有福,命里最重要的是寻找伯乐!如遇对人,前途不可限量.");
		}else if("王稀云".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为83分!一路平顺,中年需克制一下自己的情绪...某个时刻到时,需要克制!");
		}else if("陈洁".equals(name)){
			tv.setTextSize(23);
			tv.setText(name+"的人品为91分!三才分析:性情多好静，富于理智。温厚中带有华丽气质具有不屈不挠的精神。表面看来似非大活动家，其内部蕴含着相当实力，必取得相当的成功。其人生虽属渐进型，但终能为人首领。还可获得家庭的幸福，但其人含有嫉妒心，大都好财利。五格分析中,一般都能绕过很多灾难,属于大吉之人");
		}
		else{
			tv.setTextSize(23);
			tv.setText(name+"...(努力测算中,天朝数据库资源缺乏!)");
		}
		
		
	}

}
