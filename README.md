# Learning Android
안드로이드 공부 
개발 이란 무엇일까?
1. 서버개발자
2.클라이언트 개발자(프런트)
	-안드로이드
	-IOS
	-웹
	-통합 개발자
	3. 게임 개발자
	4. 머신 러닝 개발자
	5. 임베ㅡ 개발자
	6. 보안 개발자
	
	
	
	개발 프로세스
	다양한 인풋 => 기획 => 디자인 => 개발(서버)=>개발(클라이언트) =>검수
	
Slack이란?
카톡 업그레이드 버전이라고 생각

안드로이드 스튜디오 설치하기 SDK 경로 설정!
코틀린이란 ? 2017 안드로이드 공식지원언어로 채택
자바와 100% 호환이 된다.
-------------------------------------------------------------------------------------
 res layout activity_main 파일 들어가보면 안드로이드 레이아웃 화면이 있음
핸드폰 마다 화면 크기가 다른데 어떻게 화면을 그려야 할지? -> 픽셀,dpi dp단위
= 픽셀 => 핸드폰 화면에서 빛이 나오는 전구 -> 가장 작은 단위
-dpi => dot per inch  ex) ldpi -> 120
					Mdpi => 160
					Hdpi => 240
					Xhdpi =-> 320
-dp -> density independent pixel -픽셀 독립적인 단위
우리가 동일한 화면을  보여주기 위해선 dp 단위를 써야함./
안드로이드에서 화면을 그릴땐 2가지 방법이 있음
	1.xml을 직접 타이핑 하는 방법
	2.drag and drop 
Java 디렉 안에 MainActivity 가 있는데  레이아웃 보여주는 곳이 여기임
setContentView(R.layout.activity_main)
   
Drag and drop 방식으로 화면을 보여주는 것은 굉장히 어려움.

Activity_main 맨 위에서 <LinearLayout>
Layout_width
Layout_height
Textview 의 속성으론 크기 색상 등이 있지만 위치를 바꿀순 없음.
즉 부모컴포넌트 들로 배치를 해야함 <div>처럼
LinearLayout - orientation ="verticle"--수직나열 위에서 아래로
					"horizontal" ==---왼 에서 우로 나열
LinearLayout 이 부모 뷰로 있으면 TextView 에 생기는 속성은
Android:layout_grayvity=center or right or left
이건 justify-content 속성이랑 똑같음 
LinearLayout 에 gravity 속성이 있음. 이거랑 위에랑 합쳐서 하면
원하는 레이아웃 가능할듯.
Layoutgravity-부모클래스 기준
Gravity - 내 기준
android:gravity="right|center"----- 오른쪽중앙정렬
ㅁ
ㅁ

match_parent 는 부모에 딱 맞추겠다는 의미
Wrap_content 는 나의 내용물만큼을 사이즈로 하겠다.

Layout_weight -비율 설정
부모에 weightSum을 5로 주고
자식에 weight를 1 3 1 로 주면 1:3:1 비율로 설정됨
<RelativeLayout>--기준이 있고 그 기준에따라 상대적으로 치하는 것. 따라서 연산이 많이 필요함
	(RElativeLayout의 자식 속성이 생김)
	<Textview> -centerinParent=""(가운데)
				 -alignParentBottom=""(왼쪽아래)
만약 가운데 아래로 하고싶다면 둘다 쓰면됨.
이런거 하나도 안외워도 댐 쓸때마다 자동완성으로 확인해서 사용하시오.
각각 은className처럼 id가 있음 
Android:id="@+id/아이디이름
Toleftof torightof toaboveof 등등 잘 활용해서 레이아웃하기
<FrameLayout> , <RelativeLayout>
자식들을 겹쳐서 레이아웃을 하고 싶을때
먼저 적은것부터 쌓이는 느낌. 먼저 적은게 밑에가있음
둘중에 뭘 써야 하냐?  => FrameLayout
왜냐면 FrameLayout이 목적에 맞게 설계된 것 이기 때문,
Relative는 연산량도 많t다.
<ScrollView> 스크롤 해주기위한 컴포넌트
Scrollview의 특징 - 오직 하나의 자식만 가질 수 있다
<Scrollview>
	<Linear> 이런식으로 하면 스크롤 됨.
속성 - height 를 주면 그 height에서만 스크롤 됨
	  -scrollbars 를 주면 스크롤바 없어짐.
	  -fillViewport="true"를 항상 줘야함
<ImageView>
속성 - src-경로를 나타냄 -"@drawable/파일이름"
------------------Android-------------------------------
app하위manifests/AndroidManifest.xml 은 앱의 지도역활을 함
패키지 이름은 고유해야함
package="com.example.myapplication">

<application
android:allowBackup="true"       --앱을 삭제하더라도 일정부분은백업되있음
android:icon="@mipmap/ic_launcher" -@는 경로를 의미하고 이 태그는 핸드폰 아이콘을 의미함
android:label="@string/app_name"-앱 이름

android:roundIcon="@mipmap/ic_launcher_round"- 앱의 아이콘을 동그랗게 그려줌(여기서 미니맵은 res하위 인데 앱의 아이콘이 저장되어 있다고 보면됨)
android:supportsRtl="true"-다른지역 언어는 오른쪽 ->왼
android:theme="@style/AppTheme">-지금 안드로이드 스튜디오 앱을 키면 위에 my application 녹색부분이 이 태그 때문에 나오는 것.
	<activityandroid:name=".MainActivity">- 액티비티는 화면임 즉. 여기는 mainActivity 화면 하나만 가지고 있는 것.

		<intent-filter>
		<actionandroid:name="android.intent.action.MAIN"/>
		
		<categoryandroid:name="android.intent.category.LAUNCHER"/>- 이 속성은 이 액티비티를 런처 액티비티로 만듬 앱을 켰을때 최초로 나오는 화면.
		</intent-filter>
	</activity>
</application>

Activity 개념
-앱의 한 화면이다!
-Life Cycle (수명주기) activity 클스는 6가지 콜백(A가 어떤 특정한 동작이 발생하면 B에게 알려주는것)으로 구성된 핵심세트(onCreate() onStart() onResume() onPause() onStop() onDestroy())를 제공
https://developer.android.com/guide/components/activities/activity-lifecycle#java

	어떤 일이 있어도 onCreate는 다시 불릴 수 없음 앱이 crash  났을때 빼고
	onCreate ->activity가 만들어질때 단 한번만 호출
				->activity를 만들때  단 한번만 하면 되는 작업들을 여기서 해준다
	onStart ->
	onResume->다시 앱으로 돌아올때 무조건 호출된다
				->activity가 다시 호출될 때 하면 되는 작업들을 여기에서 해준다
	onPause=>화면 일부가 가려졌을때
	onStop=>화면 전부가 보이지 않을때
			->사용자가 했던 작업들을  저장  여기서 해주면 좋을듯.
	onDestroy->
	MainActivity.kt
	packagecom.example.myapplication
	
	importandroidx.appcompat.app.AppCompatActivity
	importandroid.os.Bundle
	
	classMainActivity:AppCompatActivity(){
	
	overridefunonCreate(savedInstanceState:Bundle?){
	super.onCreate(savedInstanceState)
	setContentView(R.layout.activity_main). 이 레이아웃으로 화면을 그리겠다
	}
	}
	
	Bundle 이란?
	mainActivity보면 import android.os.Bundle 있음
	Bundle 은 여러가지 타입의 값을 저장하는 map클래스이다
	Ex) string 값을 bundle 클스에 mapping(대응,변환) 하는것
	Serializable(객체직렬화)는 객체를 바이트로 저장하는 자바의 인터페이스 이고 Parcelable은 안드로이드 에서 만든것.
	Android 에서는 activity 간에 데이터를 주고받을때 bundle 클래스를 사용하여 데이터를 전송한다.
	bundle의 다른 용도는
	아래와 같이 activity 를 생성할 때 overridefunonCreate(savedInstanceState:Bundle?){ 
	Bundle savedinstanceState 객체를 가지고와서 액티비티를 중단할 때 saveinstancestate 메서드를 호출하여 임시적으로 데이터를 저장한다. 즉 전에 저장된 데이터가 있으면 그 데이터를 가지고 activity를 다시 생성한다
	즉 !! Bundle은 아무거나 포장할 수 있는 상자를 의미하고 이 박스를 이용하여 이리저리 인텐트도 오고갈 수 있고 다양한 데이터 통신에 이용 할 수 있다.
	Override fun onCreate(savedInstanceState:Bundle ?) {
		Super.oncreate(savedinstacestate)
		setContentView(R.layout.파일이름)
		//여기 activity가 생성될때  단 한번만 하는 작업
		(마우스 오른쪽 generate - > override)
	}
	classMainActivity:AppCompatActivity(){
	
		Override funonCreate(savedInstanceState:Bundle?){
			super.onCreate(savedInstanceState)
			setContentView(R.layout.activity_main)
			
		}
		
		Override funonStart(){
			super.onStart()
		}
		
		Override funonResume(){
			super.onResume()
		}
		
		Override funonPause(){
			super.onPause()
		}
		
		Override funonStop(){
			super.onStop()
		}
		
		Override funonDestroy(){
			super.onDestroy()
		}
	}
	Log.d() 로그를 남겨주는것 
	실행 후 logcat 에서 lifecycle을 검색해보면
	최초 실행시 create ,start, resume이 실행댐
	--------------------------------------------------------------
	Xml 에 적어놓은 textview나 imageview를 클릭했을때
	원하는 동작을 하게끔 만들고 싶음.
	-> xml에 적어놓은 view를 activity 로 가져와야함
	Com.exemple 에서 오른쪽클릭 하면 activity 를 만들 수 있음  activity 를 추가한다는 건 한 화면을 추가한다는 것
	자동으로 res layout에도 activity가 생김
	,자동으로 manifests/androidmanifest 에도 activity가생김
	///익명함수- 이름이 없는 함수-한번만 사용한다
	Xml 에 있는 view 를 가져오는 방법은 2가지가 있음
	1.
	Val textView:TextView=findViewById(R.id.hello)

	overridefunonCreate(savedInstanceState:Bundle?){
	
	super.onCreate(savedInstanceState)
	
		setContentView(R.layout.activity_linstener)
		valtextView:TextView=findViewById(R.id.hello)
		textView.setOnClickListener{
		
			Log.d("Click","Click")
		}
	}
	이렇게 한뒤 androidmanifest 에서 mainactivity에 있는 부분을 listner 로 옮기면 그부분이 화면에나타남
	그리고 화면을 클릭했을때 로그에 click 이 찍힘
	작동원리 = setonClickListener
	onClick + Listener 
	클릭시 view를 이 메소드 안으로 넘겨줌 그 view가 it 으로 들어가 있음
	그리고 만약 접속자 수 이런걸 따고 싶어서 number"을 1 씩 증가하게 하고 create에 넣고 log.d("number",number) 로 하면 안됨
	스트링을 넣어줘야 하므로 log.d("number",""+number) 이렇게 하면 명시적으로 string으로 변환됨
	많이 사용되는 메소드
	-setText - 텍스트를 바꾸어줌
	-setImageResource(///image.setImageResource(R.drawable.//파일이름)
	 정적인 뷰를 만들때는 xml에서 그리고 동적으로 변환하고 싶을땐 이처럼 activity에서 뷰를 가져와서 이벤트를 등록해준다
	과제 ) 계산기 만들기
	Intent - 요구 , 의사전달 , 요청
	 요청 관계 -
	1. activity  activity 가 intent를 통해서 
	주고 받음, 
	2.android system 과 내 app (전화,메시지 등등) , 
	3.다른 app 과 내 app (결제 등등) ->상호합의 필요
	요청의 종류 -
	1,전달만 하는 요청 startActivity
	2. 리턴을 받는 요청 startActivityForResult
	---------------Intent 실습 -----------------------
	전달 만 하는 요청
	Activity 를 두개 만들어줌 (intent1 , intent2)
	Intent 1 activity 가 intent2 에 요청을 하는 것
	화면전환
	change_activity.setOnClickListener{
		Val a=Intent(this@intent,intent2::class.java)
		a.putExtra("number1",1)
		a.putExtra("number2",2)
		startActivity(a)
	}
	Val intent2=Intent(this@intent,intent2::class.java)
	intent2.apply{  -apply를 활용해서 하면 나중에 유지보수 할때 좋음.
		this.putExtra('asdasd',1)
	
	
	}
	startActivity(intent2)
	
	putExtra 란 key,value 방식으로 쌍으로 만들어서
	넘겨주는 것 보내줬으니까 이제 intent2 로 가서 받은 걸 꺼내줘야함
	//intent2.kt
	setContentView(R.layout.activity_intent2)
	valnumber1=intent.getIntExtra("number1",0)
	valnumber2=intent.getIntExtra("number2",0)
	Log.d("number",""+number1)
	여기서 intent 는 변수가 아닌 함수임
	Intent 에서 a 변수가 보내준 putExtra를 intent2 파일에서 intent 함수.getIntExtra 를 통해 받은것
	리턴을 받는 요청 startActivityForResult
	//intent2.kt
	result.setOnClickListener{
	valnumber1=intent.getIntExtra("number",1)
	valresultInt=Intent()
	resultInt.putExtra("result",number1)
	setResult(Activity.RESULT_OK,resultInt)
	finish()//activity종료
	//intent1.kt
	startActivityForResult(intent2,200)
	overridefunonActivityResult(requestCode:Int,resultCode:Int,data:Intent?){
	if(requestCode==200){
		Log.d("number",""+requestCode)
		Log.d("number",""+resultCode)
		data?.getIntExtra("result",0)
		Log.d("number",""+resultInt)
		
	}
	super.onActivityResult(requestCode,resultCode,data)
	}
	여기서 resultCode는 intent2에서 보낸 RESULT_OK
	Data는 resultint 가 되는것
	인텐트의 종류 
	- 명시적 인텐트 -위에서 했던 보내고 받는 인텐트들
	- 암시적 인텐트 - naver로 이동시켜줌  ex) 배달앱에서 전화 버튼을 누르면 전화 페이지로 이동시켜주는 등
	change_activity.setOnClickListener{
	Val intent2=Intent(Intent.ACTION_VIEW,Uri.parse("http://m.naver.com"))
	startActivity(intent2)
	}
	Task- activity가 아래에서 위로 쌓이는 것  
	켜지는 방법을 자체 속성으로 가지고 잇는 경우
	-> launchMode
	켜지는 방법을 지시하는 경우
	->IntentFlag
	LaunchMode                   다중허용
		-standard                       0
		-singleTop                      조건부 ->열려고 하는 엑티비티가 현재 엑티비티라면 onNewIntent 를 호출한다
		----------------------------------------------------------
		-singleTask                       x
		-SingleInstance                 x
	인텐트 플래그
		-FLAG_ACTIVITY_NEW_TASK
		-FLAG_ACTIVITY_SINGLE_TOP
		-FLAG_ACTIVITY_CLEAR_TOP
	런치모드나 인텐트 플레그를 정확히 알지 모른채 사용하면 스택이 꼬여버리므로 그냥 나두는게 낫다
	open.setOnClickListener{
		valaddress=address_edit_text.text.toString()
		valintent=Intent(Intent.ACTION_VIEW,Uri.parse(address))
		startActivity(intent)
	}
	//여기서 open 이랑 address_edit_text 는 id이름
	원하는 text를 입력했을때 동작하게 할 수 있고
	원하지 않는 text를 입력했을때도 사용가능
	address_edit_text.addTextChangedListener(object:TextWatcher{
		overridefunafterTextChanged(s:Editable?){
			TODO("Notyetimplemented")
			Log.d("aa",""+s) //s 는 입력값
		}
	
		overridefunbeforeTextChanged(s:CharSequence?,start:Int,count:Int,after:Int){
			TODO("Notyetimplemented")
		}
		
		overridefunonTextChanged(s:CharSequence?,start:Int,before:Int,count:Int){
			TODO("Notyetimplemented")
		}
	})
		
	Fragment - 
		- Activity -> 앱에 보이는 한 화면의 단위
		- Activity  하나가 엄청 길때 파트 1,2,3,4,5,6, 이런 식으로 나눈다고 햇을때 너무 복잡해짐 ->관리포인트가 많아진다.
		- 안드로이드 디바이스가 너무 다양하다
		- 안드로이드에는 핸드폰만 있는게 아니다!->태블릿이 있다.
	사용처 - 엑티비티의 파트를 나누어서 책임진다
	-라이프 사이클이 존재한다
	-엑티비티 종속적이다.
	-------- Fragment 실습 -----------------
	일단 개념적으로 layout 하나가 있다고 하면 그 하나에 여러개의 fragment 가 있다는 뜻.
	즉 Home.kt  와 activity_home.xml 안에 Section.kt와 activity_Section.xml 이 필요함
	Activity_home.xml 안에  fragment 태그를 씀
	<fragment
	android:id="@+id/section"
	android:name="com.example.myapplication.section"
	android:layout_width="match_parent"
	android:layout_height="300dp"/>
	
	여기서 name 이랑 id는 필수 값임.
	Activity_section.xml 에서는 레이아웃 잡아주고
	Section.kt 에서
	overridefunonCreateView(//이친구가뷰를그리는친구
		inflater:LayoutInflater,
		container:ViewGroup?,
		savedInstanceState:Bundle?
	):View?{
	//프라그먼트가인터페이스를처음으로그릴때호출된다.
	//inflater=>뷰를그려주는역활
	//container=>부모뷰
		returninflater.inflate(R.layout.Section,container,false)
	
	}
	전체 LifeCycle 그려보면
	
	
	 
	Class section:Home(){ //home을 상속
	Overridefun onAttach(context:Context?){
	Log.d("lifecycle","onAttach")
	super.onAttach(context)
	}
	
	Overridefun onCreate(savedInstanceState:Bundle?){
	Log.d("lifecycle","onCreate")
	super.onCreate(savedInstanceState)
	}
	
	Overridefun onCreateView(//이친구가뷰를그리는친구
	inflater:LayoutInflater,
	container:ViewGroup?,
	savedInstanceState:Bundle?
	):View?{
	//프라그먼트가인터페이스를처음으로그릴때호출된다.
	//inflater=>뷰를그려주는역활
	//container=>부모뷰
	returninflater.inflate(R.layout.section,container,false)
	
	}
	
	Overridefun onViewCreated(view:View,savedInstanceState:Bundle?){
	Log.d("lifecycle","onViewCreated")
	super.onViewCreated(view,savedInstanceState)
	}
	
	Overridefun onActivityCreated(savedInstanceState:Bundle?){
	Log.d("lifecycle","onActivityCreated")
	super.onActivityCreated(savedInstanceState)
	}
	
	Overridefun onStart(){
	Log.d("lifecycle","onStart")
	super.onStart()
	}
	
	Overridefun onResume(){
	Log.d("lifecycle","onResume")
	super.onResume()
	}
	
	Overridefun onPause(){
	Log.d("lifecycle","onPause")
	super.onPause()
	}
	
	Overridefun onStop(){
	Log.d("lifecycle","onStop")
	super.onStop()
	}
	
	-
	Overridefun onDestroyView(){
	Log.d("lifecycle","onDestroyView")
	super.onDestroyView()
	}
	
	Overridefun onDetach(){
	Log.d("lifecycle","onDetach")
	super.onDetach()
	}
	}
	Fragment 동적으로 만드는법 !@!
	
	 
	overridefunonCreate(savedInstanceState:Bundle?){
	super.onCreate(savedInstanceState)
	setContentView(R.layout.activity_fragment)
	valfragmentOne:FragmentOne=FragmentOne()
	//프라그먼트에data를넣어주는방법번들을만들어서그번들에끼어넣어줘야함
	valbundle:Bundle=Bundle()
	bundle.putString("hello","hello")
	- fragmentOne.arguments=bundle //FragmentOne.kt파일에 onActivitycreated 메소드에서  작업해준다
	보면//FragmentOne.kt
	Override fun onActivityCreated(savedInstanceState:Bundle ?) {
		Val data = argument?.getString("hello")
		Log.d("data",data)
	}
	
	button.setOnClickListener{
		//프라그먼트를동적으로작동하는방법
		버튼을 누르면 프라그먼트가 replace
		
		valfragmentManager:FragmentManager=supportFragmentManager
		//transaction
		//작업의단위=>시작과끝이있다
		valfragmentTransaction=fragmentManager.beginTransaction()//시작
		fragmentTransaction.replace(R.id.container,fragmentOne)//할일적어주고
		//끝을내는방법은commit과commitnow가있음
		//commit->시간될때커밋해(좀더안정적)
		//commitnow=>지금당장해
		fragmentTransaction.commit()
		
		}
		button2.setOnClickListener{
		//프라그먼트remove/detach하는방법
		valfragmentManager=supportFragmentManager
		valfragmentTransition=fragmentManager.beginTransaction()
		fragmentTransition.detach(fragmentOne)
		fragmentTransition.commit()
	}
	}
	NullPointException - 굉장히 자주나는 에러
    현재상황 - <Linear>
						<fragment> --- fragmentOne
						<Linear>-----fragment 에서 만들어줌
	즉, 우리는 bundle  통해 Linear 밑에 부분에서 fragment를 만들 때 데이터를 fragmentOne으로 넘겨줬는데 막상 앱을 시작할때는 fragment 가 먼저 실행되므로 data가 null이 됨 결론은 onActivityCreated 는 button을 누를때 실행 되게끔 만들었는데 현재 fragment 가 만들어질때도 실행된다는 뜻. 
	데이터 전달 방법
	인텐트는 activity  끼리 데이터 공유하고 onActivityResult 콜백함수로 데이터를 받았지만  여기선 보내는 건 bundle 과 argument 를 이용하지만 돌아오는거는 자체구현해야함
		-activity -> Fragment 는 argument와 bundle 이용
		- Fragment -> activity 는 자체구현해야함(리스너 구현)
		- //FragmentOne.kt
		classFragmentOne:Fragment(){
		//데이터를activity를보낼때사용하는interface
		interfaceOnDataPassListener{//리스너만들때는인터페이스(생성자없음)
			funonDataPass(data:String?)//스트링타입으로가상함수하나만들어줌
		}
		lateinitvardataPassListener:OnDataPassListener//인터페이스타입인변수선언
		//lateinit이란나중에초기화하겠다는의미var일때만가능하다.
		overridefunonAttach(context:Context?){
		Log.d("lifecycle","onAttach")
		super.onAttach(context)
		dataPassListener=contextasOnDataPassListener//형변환을해줌
		}
		
		overridefunonCreate(savedInstanceState:Bundle?){
		Log.d("lifecycle","onCreate")
		super.onCreate(savedInstanceState)
		}
		//정적으로뷰를그릴때사용
		overridefunonCreateView(//이친구가뷰를그리는친구
		inflater:LayoutInflater,
		container:ViewGroup?,
		savedInstanceState:Bundle?
		):View?{
		//프라그먼트가인터페이스를처음으로그릴때호출된다.
		//inflater=>뷰를그려주는역활
		//container=>부모뷰
		returninflater.inflate(R.layout.fragment_one,container,false)
		
		}
		//interface함수로데이터를activity로보내주는로직
		overridefunonViewCreated(view:View,savedInstanceState:Bundle?){
		Log.d("lifecycle","onViewCreated")
		super.onViewCreated(view,savedInstanceState)
		//activity의onCreate에서했던작업을fragment는여기에서한다.
		//fragment를통해서하고싶은작업을이곳에위치시켜줘야함
		pass.setOnClickListener{//리스터로데이터를보냄그럼다시리스너가데이터를받아줘야함
		//어디?activity에서받아줘야함
		dataPassListener.onDataPass("goodbye")
		}
		}
		//bundle을통해데이터를받았을땐여기서받는것
		overridefunonActivityCreated(savedInstanceState:Bundle?){
		Log.d("lifecycle","onActivityCreated")
		valdata=arguments?.getString("hello")
		Log.d("data",data)
		super.onActivityCreated(savedInstanceState)
		}
		
		overridefunonStart(){
		Log.d("lifecycle","onStart")
		super.onStart()
		}
		
		overridefunonResume(){
		Log.d("lifecycle","onResume")
		super.onResume()
		}
		
		overridefunonPause(){
		Log.d("lifecycle","onPause")
		super.onPause()
		}
		
		overridefunonStop(){
		Log.d("lifecycle","onStop")
		super.onStop()
		}
		
		
		overridefunonDestroyView(){
		Log.d("lifecycle","onDestroyView")
		super.onDestroyView()
		}
		
		overridefunonDetach(){
		Log.d("lifecycle","onDetach")
		super.onDetach()
		}
		}
		//Fragment
		
		classFragmentActivity:AppCompatActivity(),FragmentOne.OnDataPassListener{
		overridefunonDataPass(data:String?){//오버라이드해줌
		Log.d("pass",""+data)
		}
		
		overridefunonCreate(savedInstanceState:Bundle?){
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_fragment)
		valfragmentOne:FragmentOne=FragmentOne()
		//프라그먼트에data를넣어주는방법번들을만들어서그번들에끼어넣어줘야함
		valbundle:Bundle=Bundle()
		bundle.putString("hello","hello")
		fragmentOne.arguments=bundle
		button.setOnClickListener{
		//프라그먼트를동적으로작동하는방법
		
		valfragmentManager:FragmentManager=supportFragmentManager
		//transaction
		//작업의단위=>시작과끝이있다
		valfragmentTransaction=fragmentManager.beginTransaction()//시작
		fragmentTransaction.replace(R.id.container,fragmentOne)//할일적어주고
		//끝을내는방법은commit과commitnow가있음
		//commit->시간될때커밋해(좀더안정적)
		//commitnow=>지금당장해
		fragmentTransaction.commit()
		
		}
		button2.setOnClickListener{
		//프라그먼트remove/detach하는방법
		valfragmentManager=supportFragmentManager
		valfragmentTransition=fragmentManager.beginTransaction()
		fragmentTransition.detach(fragmentOne)
		fragmentTransition.commit()
		}
		}
		
	
		6/01
		Null Safety -> null에대해서 안전하다 = 코틀린특징
		코틀린이  nullSafety 하기 위해서 사용하는 문법
		-> ?
		->!!
		Number?.~~~~~~ = 앞에있는게 널이아니라면 뒤에있는걸 실행하겠다
		Number!!.~~~~~~~~ = 이건 확실히 널이 아님을 개발자가 보장하는 것 !(최대한 사용 x)
		삼항연산자 -> 엘비스 연산자
		Val number2 = number1 ?:10   = number1이 널이아니면 number1 이 들어가고 널이면 10이 들어감
		Lateinit ->초기값을 나중에 세팅해주겠다
			-> 초기값이 세팅 되지 않았을때 호출하면 에러
		res/Resource
		Colors.xml -> 여기서 색상 설정 하면 편함
		Strings.xml => 여기서 반복되는 글자 설정하면 편함
		Styles.xml -> 어플 테마정해줌
		<item name="windowNoTitle">true</itme> ->  ㅣ틀 없어짐
		Resource라는 엑티비티 만들어줌
		<resource에 있는 string값을 코틀린으로 넘겨줄것>
				//1번방법
				valment=resources.getString(R.string.hello)
				//2번방법
				valment2=getString(R.string.hello)
				}
		<color 값도 똑같이 하면 됨>
		valcolor=getColor(R.color.colorAccent) 
		<엑티비티 background 컬러 바꾸는법>
		button.setBackgroundColor(getColor(R.color.colorPrimaryDark))
		Context
		역할 -> ActivityManagerService(개발하기 편하도록 미리 구현 해놓은 기능)에 접근 하도록 해주는 역할	
		안드로이드는 이미 많은부분들이 만들어져 있다->이런 것들을 사용하기 위해서는 Context가 필요한 경우가 많다.
		classResource:AppCompatActivity()
		여기appconpatactivity 에서 많은것들을 상속받아 쓰고있음.
		종류 -> 
		 activity의 context , -> Activity 의 주변정보
		 application 의 context -> Application의 주변정보
		ApplicationContext > ActivityContext 
		
		Thread(쓰레드)
		-작업 흐름
		안드로이드의 쓰레드
		->MainThread (중심이 되는 Thread)
		------------------------------>
			->launcher Activity
							-> Activity B
								->기타 등등
		ㅡMainThread 만 있는경우
		---------------------------------------------->
		->더하기->빼기 -> 곱하기 -> 나누기
		다른쓰레드가 있는 경우 = 여러가지 일을 한번에 할 수 있음
		----------------------------------------------->
			->빼기
				------------>곱하기
					->더하기
			->나누기
		특징
		-UI  Thread  
			-사용자의 input을 받는 쓰레드
		-절대 정지시킬수 없다 !!!!(하면 안됨)
			-왜냐면 사용자의  input을 받을 수 없기 때문
		 
		//쓰레드에서하고싶은일이있기때문에만듬
		//하고싶은일을runnable이라는친구를만들어서thread를runaalbe에넣어줌
		valrunnable:Runnable=object:Runnable{//인터페이스를구현할때object씀
			overridefunrun(){
				Log.d("aaa","Threadgood")
			}
		}
		valthread:Thread=Thread(runnable)
		button.setOnClickListener{//버튼을누르면thread가시작되게끔함
			thread.start()//이부분을작성해야시작이됨.
		
		}
		쓰레드는 만들자 마자 실행하는 경우가 많음 ----
		Thread(object:Runnable{
			overridefunrun(){
				TODO("Notyetimplemented")
				Thread.sleep(2000) //2초 쉼
			}
		
		}).start()
		쓰레드를 만들 일은 없다
		
		Framework
		-안드로이드 스튜디오
		-개발을 하기위해 지켜야하는 
		
		Library(외부의 도움)
		-개발을 하기 위해 필요한 도구들이 미리 구현되어 있음
		-함수나, 클래스로 구현이 되어있음
		라이브러리 실습------
		Glide 설치 - 이미지 사용 용이하게 해줌.
		Build.gradle 에서 repositories 에 라이브러리 넣어줌
		실행시켜보니 오류 남 -> missing INTERNET permission
		인터넷 사용 권한이 없다는 뜻.
		해결 -> manifests 에서 application   위에
		<uses-permission android:name="android.permission.INTERNET"/>
		에 
		리스트 뷰
		-유사하게 반복되는 뷰를 그리기 위한 도구
		그리는 방법
		1. Addview
			i. -> 실제로 잘 사용되지 않음
			ii. ->Item을 담을 xml을 만들어줌
			iii. ->그 xml에 내용을 채워준다
			iv. -> container view에 더해준다
			v. -> 반복한다.
		2. Listview 
			i. -> 예전에 많이 사용
		3. RecycleView -> 최근에 많이 사용되고있고 효율이 높음
		ㅁ
		Addview 실습
		액티비티 하나 만들고 
	ID 가져오는 법
	Val ~~~  = findViewById<LinearLayout등등>(R.id.아디이름)
	2, 다른 레이아웃에 있는 Id 를 가져오는 법
	Var inflater = LayoutInflater.from(this@부모레이아웃이름) // @ 레이아웃이름 으로부터 Layout을 가져옴
	
	 val itemView = inflater.inflate(R.layout.레이아웃이름,null) //이 레이아웃을 inflater에 가져옴 
	itemView.findViewById<~~~>(R.Id.~~~)
	요약
	val inflater = LayoutInflater.from(context)
	...
	val view = inflater.inflate(R.layout.my_view, parent, false)
	parent.addView(view)
	...
	inflater.inflate(R.layout.my_view, parent, true)
	...
	View.inflate(context, R.layout.my_view, parent)
		• XML레이아웃 파일에서 뷰를 생성할때는 LayoutInflater를 이용해야 한다.
	
	출처: <https://medium.com/vingle-tech-blog/android-layoutinflater-b6e44c265408> 
	
	
	
	
	classAddViewActivity:AppCompatActivity(){
	
	overridefunonCreate(savedInstanceState:Bundle?){
	super.onCreate(savedInstanceState)
	setContentView(R.layout.activity_add_view)
	//아이템리스트준비
	valcarList=ArrayList<CarforList>()
	for(iin0until10){//반복될레이아웃을셋팅해줌.
		carList.add(CarforList(""+i+"번째자동차"))
	}
	valcontainer=findViewById<LinearLayout>(R.id.addViewContainer)
	valinflater=LayoutInflater.from(this@AddViewActivity)
	for(iin0untilcarList.size){//이레이아웃이만들어지면서반복됨.
		valitemView=inflater.inflate(R.layout.item_view,container)
		valcarNameView=itemView.findViewById<TextView>(R.id.car_name)
		carNameView.setText(carList.get(i).name)
		container.addView(itemView)
	}
	}
	
	}
	classCarforList(valname:String,valengine:String){
	
	}
6/01
	classPhoneCall:AppCompatActivity(){
	
	overridefunonCreate(savedInstanceState:Bundle?){
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_phone_call)
		valphonebook=createFakePhoneBook()
		createPhoneBookList(phonebook)
	
	}
		funcreateFakePhoneBook(fakeNumber:Int=10,phonebook:PhoneBook=PhoneBook()):PhoneBook{//phonebook을인자로받는데
		//넣어주지않으면기본값으로생성하겠다라는의미,fakeNumber도기본값10명
		//뒤에:PhoneBook은PhoneBook을리턴시키겠다는의미
		for(iin0untilfakeNumber){
			phonebook.addPerson(
				Person(
					name=""+i+"번째사람",
					number=""+i+"번째사람의전화번호"
			)
		)
		}
		returnphonebook
	}
	funcreatePhoneBookList(phonebook:PhoneBook){
		vallayoutInflater=LayoutInflater.from(this@PhoneCall)
		valcontainer=findViewById<LinearLayout>(R.id.PhoneContainer)
		for(iin0untilphonebook.personList.size){
			valview=layoutInflater.inflate(R.layout.phonename_view)
			valviewOne=view.findViewById(R.id.number)
			viewOne.setText(phonebook.personList.get(i).name)
			container.addView(viewOne)//컨테이너에뷰하나를입힘
		}
	
	}
	
	
	classPhoneBook(){
	//전화번호부
		valpersonList=ArrayList<Person>()
		funaddPerson(person:Person){
			personList.add(person)
	}
	
	}
	classPerson(valname:String,varnumber:String){
	
	}
	
	여기서 버튼을 통해 전화번호부 상세페이지로 넘어가도록 한다.
	Val intent = Intent(this@~~~,~~~::class.java)
	Intent.putExtra(~~~~~~~~)
	startActivity(intent)
	
	Addview
1.리스트로 만들고 싶은 아이템의 리스트를 준비한다
2.인플레이터를 준비한다
3.인플레이터로 아이템 하나에 해당하는 뷰를 만들어 준다
4.위에서 만든 뷰를 컨테이너 뷰에 붙여준다.
	ListView
1.리스트로 만들고 싶은 아이템의 리스트를 준비한다.
2.adapter를 이용한다
    RecycleView
	-장점
		리스트 뷰의 개선판(ViewHolder 포함)
		유연하다
	사용법
	1.앱 모듈의 build.gradle 파일 열기
	dependencies 섹션에 지원 라이브러리 추가
	    dependencies {
	        implementation 'com.android.support:recyclerview-v7:28.0.0'
	    }
	    
	
	출처: <https://developer.android.com/guide/topics/ui/layout/recyclerview> 
	
	classRecycleViewActivity:AppCompatActivity(){
	
	overridefunonCreate(savedInstanceState:Bundle?){
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_recycle_view)
		valcarList=ArrayList<CarforList>()
		for(iin0until50){
			carList.add(CarforList(""+i+"번째자동차",""))
		}
		valadapter=RecyclerViewAdapter(carList,LayoutInflater.from(this@RecycleViewActivity))
		recycler_view.adapter=adapter
		recycler_view.layoutManager=LinearLayoutManager(this@RecycleViewActivity)
	}
	}
	classRecyclerViewAdapter(
		valitemList:ArrayList<CarforList>,
		valinflater:LayoutInflater
	):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){
		classViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){//생성자에받은아이템을
			//넘겨줌
			valcarName:TextView
			valcarEngine:TextView
			init{
				carName=itemView.findViewById(R.id.car_name)
				carEngine=itemView.findViewById(R.id.car_engine)
				itemView.setOnClickListener{
					valposition:Int=adapterPosition // 포지션을 가져와줌
					valenginename=itemList.get(position).engine
				
				}
				
				
			}
		}
		
			overridefunonCreateViewHolder(parent:ViewGroup,viewType:Int):ViewHolder{//뷰를만듬
			valview=inflater.inflate(R.layout.item_view,parent,false)
			returnViewHolder(view)
		}
		
		overridefungetItemCount():Int{
			returnitemList.size
		}
		
		overridefunonBindViewHolder(holder:ViewHolder,position:Int){//뷰를그려주는부분
			holder.carName.setText(itemList.get(position).name)//holder는우리가위에서만든ViewHolder
		}
	}
	이제 해당하는 포지션을 누르면 그 정보를 들어갈 수 있게 끔 만들고 싶음. 
	뷰 홀더 init 안에 이렇게 적어줌
	itemView.setOnClickListener{
		valposition:Int=adapterPosition // 포지션을 가져와줌
		valenginename=itemList.get(position).engine
	
	}
	여기서 itemList는 클래스 외부 변수 이므로 viewHolder 를이너 함수로 만들어줌 inner  키워드를 클래스 앞에 붙여줌
	
	
	ViewHolder 에 
	LayoutManager
	1. LinearLayoutManager
	recycler_view.layoutManager=LinearLayoutManager(this@RecycleViewActivity)
	2. GridLayoutManager
	recycler_view.layoutManager=GridLayoutManager(this@RecycleViewActivity,2)

     Tablayout,Pager 
	- 앱을 보면 탭들이 있는데 클릭하게되면 화면이 전환되는 그런 탭들.
		Pager
	- 메인화면을 종이넘기듯이 넘겨주는 역할	
		• Tablayout
	- Tab을 담당하는 역할	
		• Adapter
	- Tablayout과 pager 을연결해주는 역할	
	
	<androidx.viewpager.widget.ViewPager
	Tablayout 인터넷에서 가져와줌
	implementation'com.google.android.material:material:1.0.0'
    6/04
	Tab 은 화면이 오른쪽에 있는데 우리가 못보는 걸 보여주는       것
	Fragment 1 , 2, 3 을 만든 다음
	TabPagerActivity로 넘긴다음에 그 TabPaging 할꺼임
	Fragment 에는 기본적인 onCreateView 들어있다.
	classFragment2:Fragment(){
		overridefunonCreateView(
			container:ViewGroup?,
			inflater:LayoutInflater,
			savedInstanceState:Bundle?
		):View?{
			returninflater.inflate(R.id.fragment_one,container,false)
		}
	}
	-데이터 베이스
	1. 데이터를 저장하기 위함
	-데이터 저장방식
	- RDB(Relational DataBase)-관계형 데이터베이스
		-엑셀처럼 생겼다
	- Key-value
		• 쌍으로 저장하는 방식(키,벨류)
	- RDBMS(Relational Database Management system)
		• RDB를 관리하기 위한 툴
		• MySQL 
		• Oracle
		• PostgreSQL
	- SQL
		• RDBMS를 위한 언어이다.
	- NoSQL
		• SQL말고 다르게 해보자!
		• 검색속도가 굉장히 빠름
		• MongoDB? 
	- 안드로이드 데이터베이스
		• SQLiteDatabase
		• SharedPrefrence (이친구를 많이 사용함)(key-value)
-목적= 공유된 사용자의 기호를 저장
	- 복잡한 데이터 를 구상시 라이브러리의 도움을 받는데 가장 유명한 라이브 러리는 Realm
	- https://realm.io/kr/docs/java/latest/#getting-started
	설치하기
	Realm은 Gradle 플러그인으로 설치됩니다.
	단계 1: 아래의 클래스 패스 의존성을 프로젝트 수준 build.gradle 파일에 추가합니다.
	
	buildscript {
    repositories {
        jcenter()
    }
    dependencies {
        classpath "io.realm:realm-gradle-plugin:3.5.0"
    }
}
	
	출처: <https://realm.io/kr/docs/java/latest/#getting-started> 
	단계 2: realm-android 플러그인을 애플리케이션 수준 build.gradle 파일에서 적용시킵니다.
	
	apply plugin: 'realm-android'
	
	출처: <https://realm.io/kr/docs/java/latest/#getting-started> 
	
	여기서 오류가 발생하는데 applyplugin:'kotlin-kapt' 
	 추가시켜주면 오류 해결,
	플러그인에서 순서가 중요한 친구들이 있어서 realm은 가장 아래에 위치 시켜 놓는다.
	Valconfig:RealmConfiguration=RealmConfiguration.Builder()
	.deleteRealmIfMigrationNeeded()
	.build()
	Builder() 같은 경우는 메서드체인 방식으로 많이 활용함
		Async
	- 비동기 방식
	- 쓰레드를 만들어서 작업을 따로 처리한다.(정확히, 말하면 쓰레드를 만들었다기 보단 백그라운드).
		안드로이드에서 Async 다루는 방법
	- AsyncTask 를 상속받음
		• ->onPreExcute :쓰레드 출발하기전에 할작업
		• ->doIntBackground : 쓰레드가 할 작업
		• ->onPregressUpdate : 중간중간에 MainThread로 온다(잘 사용되지 않음 ) Progress바  만들때 사용
		• ->onPostExcute : 작업을 다 마친 후 MainThread
		Async로 Progress바 실습
		6/05
		네트워크
	- 통신
	- DataBase <------>Server <------>Client(app,web)
		• (번외로 로컬데이터베이스를 사용하면 클라이언트 쪽에 할당되니까 서버가 필요 없지 않느냐 ?  -> 
	- LocalDataBAse 의 한계
		• 동기화가 어렵다
		• 상호작용이 불가능하다.(그래서 데이터베이스를 서버가 관리해주는 것)
	서버와 통신하는법
		해당 URL로 요청을 보내는 것
		인증정보를 우리가 서버에 보낸다
		글 댓글 을 쓸때 그 데이터를 (URL로)같이 보내는데 그건 JSON  형식을 사용하여 데이터를 보낸다
	Json(javascript Object Notation -> Javascript에서 객체를 만들때 사용하는 표현식)
	Json  형식
	[] = 리스트 {} = 객체
		[
			{
			}
		]
	Json Parsing
		-> Json을 코틀린이나 자바가 이해할수 있게 변형하는 과정
	Serializable (직렬화)
	Request 타입
		GET POST DELETE PUT
	StatusCode
	200 -> good
	400번대
	
	Json 형식을 우리가 BufferReader(InputStreamReader(connection.inputstream).readLine() 으로 읽었는데 이 형식을 직렬화해주기 위해선 귀찮으므로 라이브러리를 사용해준다.
	gson
	dependencies {
  implementation 'com.google.code.gson:gson:2.8.6'
}
	
	출처: <https://github.com/google/gson> 
	전에는 직접 서버와 통신했지만 이번에는
	라이브러리 도움을 받아서 서버와 통신하는법
	(가장 유명한 것들)(앱의 네트워킹을 더 쉽고 빠르게 만드는 HTTP 통신 라이브러리)
	-Volly (구글 정식 디벨로퍼 네트워크라이브러리)
	-Retrofit
	implementation 'com.squareup.retrofit2:retrofit:2.6.0'
implementation 'com.squareup.retrofit2:converter-gson:2.6.0'
	
	출처: <https://jungwoon.github.io/android/2019/07/11/Retrofit/> 
	
	
	화면 회전
