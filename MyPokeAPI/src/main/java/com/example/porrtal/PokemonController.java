package com.example.porrtal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokemonController {

//	@GetMapping("/")
//	public void printing() {
//		for(int i = 1; i <= 1010; i++) {
//			System.out.println("_pokemonList(\""+ i +"\"),");
//		}
//	}
	
	@RequestMapping({ "/pokemon/1", "/pokemon/フシギダネ", "/pokemon/Bulbasaur" })
	public PokemonData poke1() {
		PokemonData data = new PokemonData();
		data.setId(1);
		data.setName("フシギダネ");
		data.setFeatures("生まれてから　しばらくの　あいだは　" + "背中の　タネから　栄養を　もらって　" + "大きく　育つ。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png");
		return data;
	}

	@RequestMapping({ "/pokemon/2", "/pokemon/フシギソウ", "/pokemon/Ivysaur" })
	public PokemonData poke2() {
		PokemonData data = new PokemonData();
		data.setId(2);
		data.setName("フシギソウ");
		data.setFeatures("背中の　つぼみが　ふくらみ出すと　" + "甘い　においが　漂いはじめる。　" + "大輪の　花が　咲く　前触れ。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png");
		return data;
	}

	@RequestMapping({ "/pokemon/3", "/pokemon/フシギバナ", "/pokemon/Venusaur" })
	public PokemonData poke3() {
		PokemonData data = new PokemonData();
		data.setId(3);
		data.setName("フシギバナ");
		data.setFeatures("雨の　降った　翌日は　" + "背中の　花の　香りが　強まる。　" + "香りに　誘われ　ポケモンが　集まる。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png");
		return data;
	}

	@RequestMapping({ "/pokemon/4", "/pokemon/ヒトカゲ", "/pokemon/Charmander" })
	public PokemonData poke4() {
		PokemonData data = new PokemonData();
		data.setId(4);
		data.setName("ヒトカゲ");
		data.setFeatures("生まれたときから　尻尾に　炎が　" + "点っている。炎が　消えたとき　" + "その　命は　終わってしまう。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png");
		return data;
	}

	@RequestMapping({ "/pokemon/5", "/pokemon/リザード", "/pokemon/Charmeleon" })
	public PokemonData poke5() {
		PokemonData data = new PokemonData();
		data.setId(5);
		data.setName("リザード");
		data.setFeatures("燃える　尻尾を　振り回すと　" + "まわりの　温度が　どんどん　上がって　" + "相手を　苦しめる。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png");
		return data;
	}

	@RequestMapping({ "/pokemon/6", "/pokemon/リザードン", "/pokemon/Charizard" })
	public PokemonData poke6() {
		PokemonData data = new PokemonData();
		data.setId(6);
		data.setName("リザードン");
		data.setFeatures("地上　１４００メートルまで　" + "羽を　使って　飛ぶことができる。　" + "高熱の　炎を　吐く。");
		data.setType("ほのお");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png");
		return data;
	}

	@RequestMapping({ "/pokemon/7", "/pokemon/ゼニガメ", "/pokemon/Squirtle" })
	public PokemonData poke7() {
		PokemonData data = new PokemonData();
		data.setId(7);
		data.setName("ゼニガメ");
		data.setFeatures("水面から　水を　噴射して　" + "エサを　取る。危なくなると　甲羅に　" + "手足を　ひっこめて　身を　守る。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png");
		return data;
	}

	@RequestMapping({ "/pokemon/8", "/pokemon/カメール", "/pokemon/Wartortle" })
	public PokemonData poke8() {
		PokemonData data = new PokemonData();
		data.setId(8);
		data.setName("カメール");
		data.setFeatures("１万年の　寿命を　持つと　" + "言われている。ふさふさの　尻尾は　" + "長生きの　シンボルとして　人気。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/8.png");
		return data;
	}

	@RequestMapping({ "/pokemon/9", "/pokemon/カメックス", "/pokemon/Blastoise" })
	public PokemonData poke9() {
		PokemonData data = new PokemonData();
		data.setId(9);
		data.setName("カメックス");
		data.setFeatures("甲羅に　噴射口が　あって　" + "ロケットのような　勢いで　" + "突っこんでくる　すごい　やつだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/9.png");
		return data;
	}

	@RequestMapping({ "/pokemon/10", "/pokemon/キャタピー", "/pokemon/Caterpie" })
	public PokemonData poke10() {
		PokemonData data = new PokemonData();
		data.setId(10);
		data.setName("キャタピー");
		data.setFeatures("脚は　短いが　吸盤に　" + "なっているので　坂でも　壁でも　" + "くたびれることなく　進んでいく。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/10.png");
		return data;
	}

	@RequestMapping({ "/pokemon/11", "/pokemon/トランセル", "/pokemon/Metapod" })
	public PokemonData poke11() {
		PokemonData data = new PokemonData();
		data.setId(11);
		data.setName("トランセル");
		data.setFeatures("殻が　硬くなる前に　" + "強い　衝撃を　受けると　" + "中身が　出てしまうので　注意。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/11.png");
		return data;
	}

	@RequestMapping({ "/pokemon/12", "/pokemon/バタフリー", "/pokemon/Butterfree" })
	public PokemonData poke12() {
		PokemonData data = new PokemonData();
		data.setId(12);
		data.setName("バタフリー");
		data.setFeatures("羽は　水を　弾く　りんぷんに　" + "守られている。雨の　日でも　" + "空を　飛ぶことが　できる。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/12.png");
		return data;
	}

	@RequestMapping({ "/pokemon/13", "/pokemon/ビードル", "/pokemon/Weedle" })
	public PokemonData poke13() {
		PokemonData data = new PokemonData();
		data.setId(13);
		data.setName("ビードル");
		data.setFeatures("毒針は　とても　強力。　" + "目立つ　体の　色は　" + "相手に　警戒を　させるためだ。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/13.png");
		return data;
	}

	@RequestMapping({ "/pokemon/14", "/pokemon/コクーン", "/pokemon/Kakuna" })
	public PokemonData poke14() {
		PokemonData data = new PokemonData();
		data.setId(14);
		data.setName("コクーン");
		data.setFeatures("天敵に　見つからないように　" + "葉っぱの　裏や　枝の　すきまに　隠れて　" + "進化の　ときを　待つ。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/14.png");
		return data;
	}

	@RequestMapping({ "/pokemon/15", "/pokemon/スピアー", "/pokemon/Beedrill" })
	public PokemonData poke15() {
		PokemonData data = new PokemonData();
		data.setId(15);
		data.setName("スピアー");
		data.setFeatures("集団で　現れることもある。　" + "猛スピードで　飛び回り　" + "お尻の　毒針で　刺しまくる。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/15.png");
		return data;
	}

	@RequestMapping({ "/pokemon/16", "/pokemon/ポッポ", "/pokemon/Pidgey" })
	public PokemonData poke16() {
		PokemonData data = new PokemonData();
		data.setId(16);
		data.setName("ポッポ");
		data.setFeatures("戦いを　好まない　おとなしい　" + "性格だが　下手に　手を　出すと　" + "強烈に　反撃されるぞ。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/16.png");
		return data;
	}

	@RequestMapping({ "/pokemon/17", "/pokemon/ピジョン", "/pokemon/Pidgeotto" })
	public PokemonData poke17() {
		PokemonData data = new PokemonData();
		data.setId(17);
		data.setName("ピジョン");
		data.setFeatures("広い　縄張りを　持っており　" + "侵入する　邪魔者は　" + "徹底的に　つつかれてしまう。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/17.png");
		return data;
	}

	@RequestMapping({ "/pokemon/18", "/pokemon/ピジョット", "/pokemon/Pidgeot" })
	public PokemonData poke18() {
		PokemonData data = new PokemonData();
		data.setId(18);
		data.setName("ピジョット");
		data.setFeatures("美しい　羽を　広げて　" + "相手を　威嚇する。　" + "マッハ２で　空を　飛び回る。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/18.png");
		return data;
	}

	@RequestMapping({ "/pokemon/19", "/pokemon/コラッタ", "/pokemon/Rattata" })
	public PokemonData poke19() {
		PokemonData data = new PokemonData();
		data.setId(19);
		data.setName("コラッタ");
		data.setFeatures("キバが２つ。とにかく　なんでも　" + "かじってみる。１匹　見つけたら　" + "４０匹は　そこに　住んでるはず。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/19.png");
		return data;
	}

	@RequestMapping({ "/pokemon/20", "/pokemon/ラッタ", "/pokemon/Raticate" })
	public PokemonData poke20() {
		PokemonData data = new PokemonData();
		data.setId(20);
		data.setName("ラッタ");
		data.setFeatures("後ろ足に　ついた　水かきを　使って　" + "川を　渡り　広い　範囲で　" + "エサを　探し回る。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/20.png");
		return data;
	}

	@RequestMapping({ "/pokemon/21", "/pokemon/オニスズメ", "/pokemon/Spearow" })
	public PokemonData poke21() {
		PokemonData data = new PokemonData();
		data.setId(21);
		data.setName("オニスズメ");
		data.setFeatures("草むらの　虫などを　食べる。　" + "羽が　短いために　" + "いつも　忙しく　はばたいている。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/21.png");
		return data;
	}

	@RequestMapping({ "/pokemon/22", "/pokemon/オニドリル", "/pokemon/Fearow" })
	public PokemonData poke22() {
		PokemonData data = new PokemonData();
		data.setId(22);
		data.setName("オニドリル");
		data.setFeatures("大きな　翼で　１日中　" + "飛び回る　体力の　持ち主。　" + "鋭い　クチバシで　戦う。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/22.png");
		return data;
	}

	@RequestMapping({ "/pokemon/23", "/pokemon/アーボ", "/pokemon/Ekans" })
	public PokemonData poke23() {
		PokemonData data = new PokemonData();
		data.setId(23);
		data.setName("アーボ");
		data.setFeatures("まったく　気配を　感じさせずに　" + "移動する。ポッポや　オニスズメの　" + "タマゴを　まるのみ　してしまう。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/23.png");
		return data;
	}

	@RequestMapping({ "/pokemon/24", "/pokemon/アーボック", "/pokemon/Arbok" })
	public PokemonData poke24() {
		PokemonData data = new PokemonData();
		data.setId(24);
		data.setName("アーボック");
		data.setFeatures("胸を　広げ　威嚇するとき　" + "口から　漏れる　空気の　音は　" + "不気味で　相手を　おびえさせる。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/24.png");
		return data;
	}

	@RequestMapping({ "/pokemon/25", "/pokemon/ピカチュウ", "/pokemon/Pikachu" })
	public PokemonData poke25() {
		PokemonData data = new PokemonData();
		data.setId(25);
		data.setName("ピカチュウ");
		data.setFeatures("ほっぺたの　両側に　" + "小さい　電気袋を　持つ。　" + "ピンチのときに　放電する。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/25.png");
		return data;
	}

	@RequestMapping({ "/pokemon/26", "/pokemon/ライチュウ", "/pokemon/Raichu" })
	public PokemonData poke26() {
		PokemonData data = new PokemonData();
		data.setId(26);
		data.setName("ライチュウ");
		data.setFeatures("電撃は　１０万ボルトに　" + "達することもあり　ヘタに触ると　" + "インド象でも　気絶する。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/26.png");
		return data;
	}

	@RequestMapping({ "/pokemon/27", "/pokemon/サンド", "/pokemon/Sandshrew" })
	public PokemonData poke27() {
		PokemonData data = new PokemonData();
		data.setId(27);
		data.setName("サンド");
		data.setFeatures("水気を　嫌い　乾燥地に　" + "深い穴を　掘って　生活する。　" + "一瞬で　体を　まるめる。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/27.png");
		return data;
	}

	@RequestMapping({ "/pokemon/28", "/pokemon/サンドパン", "/pokemon/Sandslash" })
	public PokemonData poke28() {
		PokemonData data = new PokemonData();
		data.setId(28);
		data.setName("サンドパン");
		data.setFeatures("背中を　まるめると　トゲトゲの　" + "ボールみたいだ。そのまま　転がって　" + "ぶつかってきたり　逃げたりする。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/28.png");
		return data;
	}

	@RequestMapping({ "/pokemon/29", "/pokemon/ニドラン♀", "/pokemon/Nidoran♀" })
	public PokemonData poke29() {
		PokemonData data = new PokemonData();
		data.setId(29);
		data.setName("ニドラン♀");
		data.setFeatures("小柄で　とても　おとなしい。　" + "襲われると　小さな　毒針を　" + "使って　戦い　身を　守る。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/29.png");
		return data;
	}

	@RequestMapping({ "/pokemon/30", "/pokemon/ニドリーナ", "/pokemon/Nidorina" })
	public PokemonData poke30() {
		PokemonData data = new PokemonData();
		data.setId(30);
		data.setName("ニドリーナ");
		data.setFeatures("子供に　エサを　分け与えるとき　" + "親が　かみくだき　やわらかくした　" + "エサを　吐き戻して　与える。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/30.png");
		return data;
	}

	@RequestMapping({ "/pokemon/31", "/pokemon/ニドクイン", "/pokemon/Nidoqueen" })
	public PokemonData poke31() {
		PokemonData data = new PokemonData();
		data.setId(31);
		data.setName("ニドクイン");
		data.setFeatures("硬くて　針のような　ウロコが　" + "体を　覆っている。　" + "興奮すると　針が　逆立つ。");
		data.setType("どく");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/31.png");
		return data;
	}

	@RequestMapping({ "/pokemon/32", "/pokemon/ニドラン♂", "/pokemon/Nidoran♂" })
	public PokemonData poke32() {
		PokemonData data = new PokemonData();
		data.setId(32);
		data.setName("ニドラン♂");
		data.setFeatures("耳が　大きく　遠くの　音を　" + "聞くとき　はばたくように　動く。　" + "怒ると　毒針を　出す。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/32.png");
		return data;
	}

	@RequestMapping({ "/pokemon/33", "/pokemon/ニドリーノ", "/pokemon/Nidorino" })
	public PokemonData poke33() {
		PokemonData data = new PokemonData();
		data.setId(33);
		data.setName("ニドリーノ");
		data.setFeatures("神経質で　喧嘩っ早い。　" + "体内の　アドレナリンが　増えると　" + "毒素の　濃度も　高まるぞ。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/33.png");
		return data;
	}

	@RequestMapping({ "/pokemon/34", "/pokemon/ニドキング", "/pokemon/Nidoking" })
	public PokemonData poke34() {
		PokemonData data = new PokemonData();
		data.setId(34);
		data.setName("ニドキング");
		data.setFeatures("尻尾の　一撃は　電柱を　" + "まるで　マッチ棒のように　" + "真っ二つに　へし折ってしまう。");
		data.setType("どく");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/34.png");
		return data;
	}

	@RequestMapping({ "/pokemon/35", "/pokemon/ピッピ", "/pokemon/Clefairy" })
	public PokemonData poke35() {
		PokemonData data = new PokemonData();
		data.setId(35);
		data.setName("ピッピ");
		data.setFeatures("背中の　翼に　月の光を　" + "集めることで　空中に　" + "浮かぶことが　できるらしい。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/35.png");
		return data;
	}

	@RequestMapping({ "/pokemon/36", "/pokemon/ピクシー", "/pokemon/Clefable" })
	public PokemonData poke36() {
		PokemonData data = new PokemonData();
		data.setId(36);
		data.setName("ピクシー");
		data.setFeatures("妖精の　仲間で　めったに　" + "人前に　出てこない。気配を　" + "感じて　すぐに　逃げてしまうようだ。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/36.png");
		return data;
	}

	@RequestMapping({ "/pokemon/37", "/pokemon/ロコン", "/pokemon/Vulpix" })
	public PokemonData poke37() {
		PokemonData data = new PokemonData();
		data.setId(37);
		data.setName("ロコン");
		data.setFeatures("子供だが　６本の　尻尾が　" + "美しい。成長すると　さらに　" + "尻尾が　増える。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/37.png");
		return data;
	}

	@RequestMapping({ "/pokemon/38", "/pokemon/キュウコン", "/pokemon/Ninetales" })
	public PokemonData poke38() {
		PokemonData data = new PokemonData();
		data.setId(38);
		data.setName("キュウコン");
		data.setFeatures("頭が良くて　執念深い。　" + "ふざけて　尻尾を　つかむと　" + "１０００年　たたられるという。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/38.png");
		return data;
	}

	@RequestMapping({ "/pokemon/39", "/pokemon/プリン", "/pokemon/Jigglypuff" })
	public PokemonData poke39() {
		PokemonData data = new PokemonData();
		data.setId(39);
		data.setName("プリン");
		data.setFeatures("大きく　体を　ふくらませてから　" + "歌う　子守歌は　いつもより　" + "長くて　ぜったいに　眠くなる。");
		data.setType("ノーマル");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/39.png");
		return data;
	}

	@RequestMapping({ "/pokemon/40", "/pokemon/プクリン", "/pokemon/Wigglytuff" })
	public PokemonData poke40() {
		PokemonData data = new PokemonData();
		data.setId(40);
		data.setName("プクリン");
		data.setFeatures("ボディーに　弾力性が　あり　" + "怒らせると　息を　吸いこんで　" + "どんどん　大きく　ふくらむ。");
		data.setType("ノーマル");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/40.png");
		return data;
	}

	@RequestMapping({ "/pokemon/41", "/pokemon/ズバット", "/pokemon/Zubat" })
	public PokemonData poke41() {
		PokemonData data = new PokemonData();
		data.setId(41);
		data.setName("ズバット");
		data.setFeatures("日光を　浴びると　ヤケドするほど　" + "皮膚が　薄い。　寒くなると　群れて　" + "身体を　寄せあい　暖めあうのだ。");
		data.setType("どく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/41.png");
		return data;
	}

	@RequestMapping({ "/pokemon/42", "/pokemon/ゴルバット", "/pokemon/Golbat" })
	public PokemonData poke42() {
		PokemonData data = new PokemonData();
		data.setId(42);
		data.setName("ゴルバット");
		data.setFeatures("ひとたび　血を　吸いはじめると　" + "満腹になるまで　やめない。　" + "暗闇を　飛び　獲物を　探す。");
		data.setType("どく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/42.png");
		return data;
	}

	@RequestMapping({ "/pokemon/43", "/pokemon/ナゾノクサ", "/pokemon/Oddish" })
	public PokemonData poke43() {
		PokemonData data = new PokemonData();
		data.setId(43);
		data.setName("ナゾノクサ");
		data.setFeatures("別名　アルキメンデス。　" + "夜になると　２本の　根っこで　" + "３００メートルも　歩くという。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/43.png");
		return data;
	}

	@RequestMapping({ "/pokemon/44", "/pokemon/クサイハナ", "/pokemon/Gloom" })
	public PokemonData poke44() {
		PokemonData data = new PokemonData();
		data.setId(44);
		data.setName("クサイハナ");
		data.setFeatures("口から　たれている　ミツは　" + "２キロ　離れていても　鼻が　" + "まがるほど　猛烈に　くさい。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/44.png");
		return data;
	}

	@RequestMapping({ "/pokemon/45", "/pokemon/ラフレシア", "/pokemon/Vileplume" })
	public PokemonData poke45() {
		PokemonData data = new PokemonData();
		data.setId(45);
		data.setName("ラフレシア");
		data.setFeatures("世界一　大きな　花びらは　" + "歩くたびに　揺れて　大量の　" + "毒花粉を　ばらまいている。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/45.png");
		return data;
	}

	@RequestMapping({ "/pokemon/46", "/pokemon/パラス", "/pokemon/Paras" })
	public PokemonData poke46() {
		PokemonData data = new PokemonData();
		data.setId(46);
		data.setName("パラス");
		data.setFeatures("穴を　掘り　木の根っこから　" + "栄養を　取るが　ほとんどは　" + "背中の　キノコに　奪われる。");
		data.setType("むし");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/46.png");
		return data;
	}

	@RequestMapping({ "/pokemon/47", "/pokemon/パラセクト", "/pokemon/Parasect" })
	public PokemonData poke47() {
		PokemonData data = new PokemonData();
		data.setId(47);
		data.setName("パラセクト");
		data.setFeatures("背中の　キノコが　育つほど　" + "ばらまかれる　キノコの　胞子の　" + "効果は　強力になる。");
		data.setType("むし");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/47.png");
		return data;
	}

	@RequestMapping({ "/pokemon/48", "/pokemon/コンパン", "/pokemon/Venonat" })
	public PokemonData poke48() {
		PokemonData data = new PokemonData();
		data.setId(48);
		data.setName("コンパン");
		data.setFeatures("大きな　木の下に　住んでいて　" + "虫などを　食べているらしい。　" + "夜は　明かりのそばに　やってくる。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/48.png");
		return data;
	}

	@RequestMapping({ "/pokemon/49", "/pokemon/モルフォン", "/pokemon/Venomoth" })
	public PokemonData poke49() {
		PokemonData data = new PokemonData();
		data.setId(49);
		data.setName("モルフォン");
		data.setFeatures("羽に　りんぷんが　ついていて　" + "ヒラヒラと　羽ばたくたびに　" + "猛毒の　粉を　ばらまく。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/49.png");
		return data;
	}

	@RequestMapping({ "/pokemon/50", "/pokemon/ディグダ", "/pokemon/Diglett" })
	public PokemonData poke50() {
		PokemonData data = new PokemonData();
		data.setId(50);
		data.setName("ディグダ");
		data.setFeatures("皮膚が　とても　薄いので　" + "光に　照らされると　血液が　" + "温められて　弱ってしまう。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/50.png");
		return data;
	}

	@RequestMapping({ "/pokemon/51", "/pokemon/ダグトリオ", "/pokemon/Dugtrio" })
	public PokemonData poke51() {
		PokemonData data = new PokemonData();
		data.setId(51);
		data.setName("ダグトリオ");
		data.setFeatures("すごい　力の　持ち主で　" + "どんなに　硬い　地面でも　" + "地下１００キロまで　掘りすすむ。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/51.png");
		return data;
	}

	@RequestMapping({ "/pokemon/52", "/pokemon/ニャース", "/pokemon/Meowth" })
	public PokemonData poke52() {
		PokemonData data = new PokemonData();
		data.setId(52);
		data.setName("ニャース");
		data.setFeatures("昼間は　だらだら　寝て過ごし　" + "日が　暮れるころに　活動開始。　" + "夜の街で　コインを　探す。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/52.png");
		return data;
	}

	@RequestMapping({ "/pokemon/53", "/pokemon/ペルシアン", "/pokemon/Persian" })
	public PokemonData poke53() {
		PokemonData data = new PokemonData();
		data.setId(53);
		data.setName("ペルシアン");
		data.setFeatures("しなやかな　筋肉の　おかげで　" + "足音ひとつ　立てずに　歩ける。　" + "獲物を　狩るときは　一瞬。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/53.png");
		return data;
	}

	@RequestMapping({ "/pokemon/54", "/pokemon/コダック", "/pokemon/Psyduck" })
	public PokemonData poke54() {
		PokemonData data = new PokemonData();
		data.setId(54);
		data.setName("コダック");
		data.setFeatures("不思議な　力を　秘めているが　" + "使った　記憶が　ないので　" + "いつも　首を　かしげている。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/54.png");
		return data;
	}

	@RequestMapping({ "/pokemon/55", "/pokemon/ゴルダック", "/pokemon/Golduck" })
	public PokemonData poke55() {
		PokemonData data = new PokemonData();
		data.setId(55);
		data.setName("ゴルダック");
		data.setFeatures("額の　赤い　部分を　持つと　" + "神通力を　授かると　いわれ　" + "乱獲　された　過去も　ある。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/55.png");
		return data;
	}

	@RequestMapping({ "/pokemon/56", "/pokemon/マンキー", "/pokemon/Mankey" })
	public PokemonData poke56() {
		PokemonData data = new PokemonData();
		data.setId(56);
		data.setName("マンキー");
		data.setFeatures("木の上で　生活している。　" + "群れの　１匹が　怒り出すと　" + "全員が　意味もなく　暴れ出す。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/56.png");
		return data;
	}

	@RequestMapping({ "/pokemon/57", "/pokemon/オコリザル", "/pokemon/Primeape" })
	public PokemonData poke57() {
		PokemonData data = new PokemonData();
		data.setId(57);
		data.setName("オコリザル");
		data.setFeatures("いつも　猛烈に　怒っており　" + "逃げても　逃げても　" + "どこまでも　追いかけてくる。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/57.png");
		return data;
	}

	@RequestMapping({ "/pokemon/58", "/pokemon/ガーディ", "/pokemon/Growlithe" })
	public PokemonData poke58() {
		PokemonData data = new PokemonData();
		data.setId(58);
		data.setName("ガーディ");
		data.setFeatures("自分より　強くて　大きな　相手にも　" + "恐れずに　立ち向かう　" + "勇敢で　頼もしい　性格。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/58.png");
		return data;
	}

	@RequestMapping({ "/pokemon/59", "/pokemon/ウインディ", "/pokemon/Arcanine" })
	public PokemonData poke59() {
		PokemonData data = new PokemonData();
		data.setId(59);
		data.setName("ウインディ");
		data.setFeatures("堂々とした　鳴き声は　" + "威厳に　あふれ　聞いたものは　" + "思わず　ひれ伏してしまう。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/59.png");
		return data;
	}

	@RequestMapping({ "/pokemon/60", "/pokemon/ニョロモ", "/pokemon/Poliwag" })
	public PokemonData poke60() {
		PokemonData data = new PokemonData();
		data.setId(60);
		data.setName("ニョロモ");
		data.setFeatures("渦巻の　向きは　生まれた　" + "地方によって　違うらしい。　" + "歩くより　泳ぐほうが　上手。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/60.png");
		return data;
	}

	@RequestMapping({ "/pokemon/61", "/pokemon/ニョロゾ", "/pokemon/Poliwhirl" })
	public PokemonData poke61() {
		PokemonData data = new PokemonData();
		data.setId(61);
		data.setName("ニョロゾ");
		data.setFeatures("２本の　脚は　発達しており　" + "地上で　暮らせるのに　なぜか　" + "水中　生活が　好き。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/61.png");
		return data;
	}

	@RequestMapping({ "/pokemon/62", "/pokemon/ニョロボン", "/pokemon/Poliwrath" })
	public PokemonData poke62() {
		PokemonData data = new PokemonData();
		data.setId(62);
		data.setName("ニョロボン");
		data.setFeatures("クロールや　バタフライが　得意で　" + "オリンピックの　選手でも　" + "ぐんぐんと　追い抜いていく。");
		data.setType("みず");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/62.png");
		return data;
	}

	@RequestMapping({ "/pokemon/63", "/pokemon/ケーシィ", "/pokemon/Abra" })
	public PokemonData poke63() {
		PokemonData data = new PokemonData();
		data.setId(63);
		data.setName("ケーシィ");
		data.setFeatures("攻撃の　気配を　読み取って　" + "襲われる前に　さっさと　" + "テレポートで　その場を　去っていく。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/63.png");
		return data;
	}

	@RequestMapping({ "/pokemon/64", "/pokemon/ユンゲラー", "/pokemon/Kadabra" })
	public PokemonData poke64() {
		PokemonData data = new PokemonData();
		data.setId(64);
		data.setName("ユンゲラー");
		data.setFeatures("能力を　使うたびに　" + "体から　特殊な　アルファ波を　" + "出して　機械を　狂わせる。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/64.png");
		return data;
	}

	@RequestMapping({ "/pokemon/65", "/pokemon/フーディン", "/pokemon/Alakazam" })
	public PokemonData poke65() {
		PokemonData data = new PokemonData();
		data.setId(65);
		data.setName("フーディン");
		data.setFeatures("スーパーコンピュータより　素早く　" + "計算する　頭脳を　持つ。　" + "知能指数は　だいたい５０００。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/65.png");
		return data;
	}

	@RequestMapping({ "/pokemon/66", "/pokemon/ワンリキー", "/pokemon/Machop" })
	public PokemonData poke66() {
		PokemonData data = new PokemonData();
		data.setId(66);
		data.setName("ワンリキー");
		data.setFeatures("全身が　筋肉になっており　" + "子供ほどの　大きさしかないのに　" + "大人　１００人を　投げ飛ばせる。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/66.png");
		return data;
	}

	@RequestMapping({ "/pokemon/67", "/pokemon/ゴーリキー", "/pokemon/Machoke" })
	public PokemonData poke67() {
		PokemonData data = new PokemonData();
		data.setId(67);
		data.setName("ゴーリキー");
		data.setFeatures("片手で　ダンプカーを　持ち上げる　" + "パワーを　活かして　人の　かわりに　" + "力仕事を　手伝う　ポケモン。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/67.png");
		return data;
	}

	@RequestMapping({ "/pokemon/68", "/pokemon/カイリキー", "/pokemon/Machamp" })
	public PokemonData poke68() {
		PokemonData data = new PokemonData();
		data.setId(68);
		data.setName("カイリキー");
		data.setFeatures("４本の　腕で　相手の　手足を　" + "押さえこみ　自由を　奪うと　" + "地平線の　向こうまで　投げ飛ばす。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/68.png");
		return data;
	}

	@RequestMapping({ "/pokemon/69", "/pokemon/マダツボミ", "/pokemon/Bellsprout" })
	public PokemonData poke69() {
		PokemonData data = new PokemonData();
		data.setId(69);
		data.setName("マダツボミ");
		data.setFeatures("人の　顔のような　つぼみから　" + "伝説の　マンドラゴラの　" + "一種ではないかと　ささやかれている。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/69.png");
		return data;
	}

	@RequestMapping({ "/pokemon/70", "/pokemon/ウツドン", "/pokemon/Weepinbell" })
	public PokemonData poke70() {
		PokemonData data = new PokemonData();
		data.setId(70);
		data.setName("ウツドン");
		data.setFeatures("まず　毒の粉を　吐き　相手の　" + "動きを　止めてしまってから　" + "溶解液で　とどめを　刺す。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/70.png");
		return data;
	}

	@RequestMapping({ "/pokemon/71", "/pokemon/ウツボット", "/pokemon/Victreebel" })
	public PokemonData poke71() {
		PokemonData data = new PokemonData();
		data.setId(71);
		data.setName("ウツボット");
		data.setFeatures("体内に　取りこまれた　ものは　" + "どんなに　硬くても　溶解液で　" + "跡形なく　溶かされてしまう。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/71.png");
		return data;
	}

	@RequestMapping({ "/pokemon/72", "/pokemon/メノクラゲ", "/pokemon/Tentacool" })
	public PokemonData poke72() {
		PokemonData data = new PokemonData();
		data.setId(72);
		data.setName("メノクラゲ");
		data.setFeatures("海の　浅い　ところを　漂う。　" + "釣り人が　間違って　釣り上げ　" + "刺されることが　多いと　聞く。");
		data.setType("みず");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/72.png");
		return data;
	}

	@RequestMapping({ "/pokemon/73", "/pokemon/ドククラゲ", "/pokemon/Tentacruel" })
	public PokemonData poke73() {
		PokemonData data = new PokemonData();
		data.setId(73);
		data.setName("ドククラゲ");
		data.setFeatures("８０本の　触手が　自由に　動く。　" + "刺されると　毒に　侵され　" + "鋭い　痛みが　走る。");
		data.setType("みず");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/73.png");
		return data;
	}

	@RequestMapping({ "/pokemon/74", "/pokemon/イシツブテ", "/pokemon/Geodude" })
	public PokemonData poke74() {
		PokemonData data = new PokemonData();
		data.setId(74);
		data.setName("イシツブテ");
		data.setFeatures("石ころと　見分けが　つかない。　" + "頑丈な　体を　仲間と　ぶつけ合い　" + "硬さを　競い合う。");
		data.setType("いわ");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/74.png");
		return data;
	}

	@RequestMapping({ "/pokemon/75", "/pokemon/ゴローン", "/pokemon/Graveler" })
	public PokemonData poke75() {
		PokemonData data = new PokemonData();
		data.setId(75);
		data.setName("ゴローン");
		data.setFeatures("坂道を　転がりながら　移動。　" + "邪魔な　ものは　どんどん　" + "押しつぶして　進んでいく。");
		data.setType("いわ");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/75.png");
		return data;
	}

	@RequestMapping({ "/pokemon/76", "/pokemon/ゴローニャ", "/pokemon/Golem" })
	public PokemonData poke76() {
		PokemonData data = new PokemonData();
		data.setId(76);
		data.setName("ゴローニャ");
		data.setFeatures("岩石の　ような　硬い　体は　" + "ダイナマイトでも　傷つかない。　" + "１年に　１度だけ　脱皮する。");
		data.setType("いわ");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/76.png");
		return data;
	}

	@RequestMapping({ "/pokemon/77", "/pokemon/ポニータ", "/pokemon/Ponyta" })
	public PokemonData poke77() {
		PokemonData data = new PokemonData();
		data.setId(77);
		data.setName("ポニータ");
		data.setFeatures("親の　あとを　追いかけるうちに　" + "強靭な　足腰になる。　" + "１日中　野山を　駆け回る。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/77.png");
		return data;
	}

	@RequestMapping({ "/pokemon/78", "/pokemon/ギャロップ", "/pokemon/Rapidash" })
	public PokemonData poke78() {
		PokemonData data = new PokemonData();
		data.setId(78);
		data.setName("ギャロップ");
		data.setFeatures("走る　速度は　時速２４０キロ。　" + "たてがみの　炎が　激しく　燃え　" + "矢のように　駆け抜ける。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/78.png");
		return data;
	}

	@RequestMapping({ "/pokemon/79", "/pokemon/ヤドン", "/pokemon/Slowpoke" })
	public PokemonData poke79() {
		PokemonData data = new PokemonData();
		data.setId(79);
		data.setName("ヤドン");
		data.setFeatures("水辺で　ボーッとしている。　" + "なにかが　尻尾に　かみついても　" + "まる１日　気づかない。");
		data.setType("みず");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/79.png");
		return data;
	}

	@RequestMapping({ "/pokemon/80", "/pokemon/ヤドラン", "/pokemon/Slowbro" })
	public PokemonData poke80() {
		PokemonData data = new PokemonData();
		data.setId(80);
		data.setName("ヤドラン");
		data.setFeatures("ヤドンが　海へ　エサを　" + "取りにいったとき　シェルダーに　" + "尻尾を　かまれ　ヤドランになった。");
		data.setType("みず");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/80.png");
		return data;
	}

	@RequestMapping({ "/pokemon/81", "/pokemon/コイル", "/pokemon/Magnemite" })
	public PokemonData poke81() {
		PokemonData data = new PokemonData();
		data.setId(81);
		data.setName("コイル");
		data.setFeatures("空中に　浮いたまま　移動して　" + "左右の　ユニットから　" + "電磁波などを　放射する。");
		data.setType("でんき");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/81.png");
		return data;
	}

	@RequestMapping({ "/pokemon/82", "/pokemon/レアコイル", "/pokemon/Magneton" })
	public PokemonData poke82() {
		PokemonData data = new PokemonData();
		data.setId(82);
		data.setName("レアコイル");
		data.setFeatures("ナゾの　電波を　発信しており　" + "半径１キロの　範囲では　" + "気温が　２度　上がる。");
		data.setType("でんき");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/82.png");
		return data;
	}

	@RequestMapping({ "/pokemon/83", "/pokemon/カモネギ", "/pokemon/Farfetch’d" })
	public PokemonData poke83() {
		PokemonData data = new PokemonData();
		data.setId(83);
		data.setName("カモネギ");
		data.setFeatures("自分の　巣を　作るための　" + "植物の　茎を　１本　" + "いつも　持って　歩いている。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/83.png");
		return data;
	}

	@RequestMapping({ "/pokemon/84", "/pokemon/ドードー", "/pokemon/Doduo" })
	public PokemonData poke84() {
		PokemonData data = new PokemonData();
		data.setId(84);
		data.setName("ドードー");
		data.setFeatures("２つの　頭の　脳みそは　" + "テレパシーのような　力で　" + "気持ちを　通じ合わせているらしい。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/84.png");
		return data;
	}

	@RequestMapping({ "/pokemon/85", "/pokemon/ドードリオ", "/pokemon/Dodrio" })
	public PokemonData poke85() {
		PokemonData data = new PokemonData();
		data.setId(85);
		data.setName("ドードリオ");
		data.setFeatures("ドードーの　どちらかの　頭が　" + "分裂した　変種。草原を　" + "時速　６０キロで　走っていく。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/85.png");
		return data;
	}

	@RequestMapping({ "/pokemon/86", "/pokemon/パウワウ", "/pokemon/Seel" })
	public PokemonData poke86() {
		PokemonData data = new PokemonData();
		data.setId(86);
		data.setName("パウワウ");
		data.setFeatures("水色の　体毛に　覆われた　皮膚は　" + "分厚くて　丈夫。　" + "零下４０度でも　活動できる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/86.png");
		return data;
	}

	@RequestMapping({ "/pokemon/87", "/pokemon/ジュゴン", "/pokemon/Dewgong" })
	public PokemonData poke87() {
		PokemonData data = new PokemonData();
		data.setId(87);
		data.setName("ジュゴン");
		data.setFeatures("体は　水の　抵抗が　" + "少ない　流線型。　" + "寒くなるほど　元気が　出てくる。");
		data.setType("みず");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/87.png");
		return data;
	}

	@RequestMapping({ "/pokemon/88", "/pokemon/ベトベター", "/pokemon/Grimer" })
	public PokemonData poke88() {
		PokemonData data = new PokemonData();
		data.setId(88);
		data.setName("ベトベター");
		data.setFeatures("汚い　場所に　現れる。　" + "工場が　流す　ヘドロ廃液を　" + "飲んで　生きている。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/88.png");
		return data;
	}

	@RequestMapping({ "/pokemon/89", "/pokemon/ベトベトン", "/pokemon/Muk" })
	public PokemonData poke89() {
		PokemonData data = new PokemonData();
		data.setId(89);
		data.setName("ベトベトン");
		data.setFeatures("体から　猛毒の　体液が　" + "染み出ている。その　液に　触れた　" + "草木は　あっというまに　枯れる。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/89.png");
		return data;
	}

	@RequestMapping({ "/pokemon/90", "/pokemon/シェルダー", "/pokemon/Shellder" })
	public PokemonData poke90() {
		PokemonData data = new PokemonData();
		data.setId(90);
		data.setName("シェルダー");
		data.setFeatures("殻で　挟みこむのは　" + "やわらかい　中身を　さらけ出すので　" + "一か八かの　手段なのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/90.png");
		return data;
	}

	@RequestMapping({ "/pokemon/91", "/pokemon/パルシェン", "/pokemon/Cloyster" })
	public PokemonData poke91() {
		PokemonData data = new PokemonData();
		data.setId(91);
		data.setName("パルシェン");
		data.setFeatures("殻が　非常に　硬く　" + "ナパーム弾でも　壊せない。　" + "攻撃するときだけ　開く。");
		data.setType("みず");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/91.png");
		return data;
	}

	@RequestMapping({ "/pokemon/92", "/pokemon/ゴース", "/pokemon/Gastly" })
	public PokemonData poke92() {
		PokemonData data = new PokemonData();
		data.setId(92);
		data.setName("ゴース");
		data.setFeatures("ガスから　生まれた　生命体。　" + "毒を含んだ　ガスの　体に　" + "包まれると　だれでも　気絶する。");
		data.setType("ゴースト");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/92.png");
		return data;
	}

	@RequestMapping({ "/pokemon/93", "/pokemon/ゴースト", "/pokemon/Haunter" })
	public PokemonData poke93() {
		PokemonData data = new PokemonData();
		data.setId(93);
		data.setName("ゴースト");
		data.setFeatures("ガス状の　舌で　なめられると　" + "魂を　取られてしまう。　" + "闇に　隠れて　獲物を　ねらう。");
		data.setType("ゴースト");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/93.png");
		return data;
	}

	@RequestMapping({ "/pokemon/94", "/pokemon/ゲンガー", "/pokemon/Gengar" })
	public PokemonData poke94() {
		PokemonData data = new PokemonData();
		data.setId(94);
		data.setName("ゲンガー");
		data.setFeatures("夜中　人の　影に　潜りこみ　" + "少しずつ　体温を　奪う。　" + "ねらわれると　寒気が　止まらない。");
		data.setType("ゴースト");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/94.png");
		return data;
	}

	@RequestMapping({ "/pokemon/95", "/pokemon/イワーク", "/pokemon/Onix" })
	public PokemonData poke95() {
		PokemonData data = new PokemonData();
		data.setId(95);
		data.setName("イワーク");
		data.setFeatures("普段は　土の中に　住んでいる。　" + "地中を　時速８０キロで　" + "掘りながら　エサを　探す。");
		data.setType("いわ");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/95.png");
		return data;
	}

	@RequestMapping({ "/pokemon/96", "/pokemon/スリープ", "/pokemon/Drowzee" })
	public PokemonData poke96() {
		PokemonData data = new PokemonData();
		data.setId(96);
		data.setName("スリープ");
		data.setFeatures("楽しい　夢を　見ていたはずなのに　" + "どんな夢か　思い出せないとき。　" + "きっと　スリープに　食べられたのだ。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/96.png");
		return data;
	}

	@RequestMapping({ "/pokemon/97", "/pokemon/スリーパー", "/pokemon/Hypno" })
	public PokemonData poke97() {
		PokemonData data = new PokemonData();
		data.setId(97);
		data.setName("スリーパー");
		data.setFeatures("振り子を　目の前で　ゆらされると　" + "たった今　目覚めたばかりの　人も　" + "３秒後には　眠ってしまう。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/97.png");
		return data;
	}

	@RequestMapping({ "/pokemon/98", "/pokemon/クラブ", "/pokemon/Krabby" })
	public PokemonData poke98() {
		PokemonData data = new PokemonData();
		data.setId(98);
		data.setName("クラブ");
		data.setFeatures("海の　近くで　見つかる。　" + "大きな　ハサミは　もぎとっても　" + "あとから　また　生えてくる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/98.png");
		return data;
	}

	@RequestMapping({ "/pokemon/99", "/pokemon/キングラー", "/pokemon/Kingler" })
	public PokemonData poke99() {
		PokemonData data = new PokemonData();
		data.setId(99);
		data.setName("キングラー");
		data.setFeatures("不格好に　大きくなった　" + "ハサミを　勢いよく　持ち上げると　" + "バランスが　崩れ　よたついてしまう。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/99.png");
		return data;
	}

	@RequestMapping({ "/pokemon/100", "/pokemon/ビリリダマ", "/pokemon/Voltorb" })
	public PokemonData poke100() {
		PokemonData data = new PokemonData();
		data.setId(100);
		data.setName("ビリリダマ");
		data.setFeatures("発電所などに　現れる。　" + "モンスターボールと　間違えて　" + "触って　しびれる　人が　多い。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/100.png");
		return data;
	}

	@RequestMapping({ "/pokemon/101", "/pokemon/マルマイン", "/pokemon/Electrode" })
	public PokemonData poke101() {
		PokemonData data = new PokemonData();
		data.setId(101);
		data.setName("マルマイン");
		data.setFeatures("あふれるほどの　電気エネルギーを　" + "体内に　ためこんでいるので　" + "少しの　刺激で　爆発する。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/101.png");
		return data;
	}

	@RequestMapping({ "/pokemon/102", "/pokemon/タマタマ", "/pokemon/Exeggcute" })
	public PokemonData poke102() {
		PokemonData data = new PokemonData();
		data.setId(102);
		data.setName("タマタマ");
		data.setFeatures("なにかの　タマゴのようだが　" + "じつは　植物の　タネにちかい　" + "生き物であることが　わかった。");
		data.setType("くさ");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/102.png");
		return data;
	}

	@RequestMapping({ "/pokemon/103", "/pokemon/ナッシー", "/pokemon/Exeggutor" })
	public PokemonData poke103() {
		PokemonData data = new PokemonData();
		data.setId(103);
		data.setName("ナッシー");
		data.setFeatures("歩く　熱帯雨林と　呼ばれる。　" + "大きくなった　頭の　ひとつが　" + "地面に　落ちると　タマタマになる。");
		data.setType("くさ");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/103.png");
		return data;
	}

	@RequestMapping({ "/pokemon/104", "/pokemon/カラカラ", "/pokemon/Cubone" })
	public PokemonData poke104() {
		PokemonData data = new PokemonData();
		data.setId(104);
		data.setName("カラカラ");
		data.setFeatures("死に別れた　母親の　骨を　" + "いつも　覆っているので　" + "素顔が　どんなふうか　わからない。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/104.png");
		return data;
	}

	@RequestMapping({ "/pokemon/105", "/pokemon/ガラガラ", "/pokemon/Marowak" })
	public PokemonData poke105() {
		PokemonData data = new PokemonData();
		data.setId(105);
		data.setName("ガラガラ");
		data.setFeatures("元々は　ひ弱で　おくびょう。　" + "進化で　骨を　振り回す　" + "乱暴な　性質に　なる。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/105.png");
		return data;
	}

	@RequestMapping({ "/pokemon/106", "/pokemon/サワムラー", "/pokemon/Hitmonlee" })
	public PokemonData poke106() {
		PokemonData data = new PokemonData();
		data.setId(106);
		data.setName("サワムラー");
		data.setFeatures("連続で　キックを　放つうちに　" + "両足は　どんどん　伸びて　" + "逃げ出そうとする　相手も　蹴れる。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/106.png");
		return data;
	}

	@RequestMapping({ "/pokemon/107", "/pokemon/エビワラー", "/pokemon/Hitmonchan" })
	public PokemonData poke107() {
		PokemonData data = new PokemonData();
		data.setId(107);
		data.setName("エビワラー");
		data.setFeatures("プロボクサーの　魂が　" + "乗り移っている。パンチの　スピードは　" + "新幹線よりも　速い。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/107.png");
		return data;
	}

	@RequestMapping({ "/pokemon/108", "/pokemon/ベロリンガ", "/pokemon/Lickitung" })
	public PokemonData poke108() {
		PokemonData data = new PokemonData();
		data.setId(108);
		data.setName("ベロリンガ");
		data.setFeatures("舌が　身長の　２倍もある。　" + "エサを　取ったり　攻撃を　したりと　" + "まるで　手のように　動かせる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/108.png");
		return data;
	}

	@RequestMapping({ "/pokemon/109", "/pokemon/ドガース", "/pokemon/Koffing" })
	public PokemonData poke109() {
		PokemonData data = new PokemonData();
		data.setId(109);
		data.setName("ドガース");
		data.setFeatures("空気よりも　軽い　ガスを　" + "体に　ためて　浮かんでいる。　" + "ガスは　くさい上に　爆発する。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/109.png");
		return data;
	}

	@RequestMapping({ "/pokemon/110", "/pokemon/マタドガス", "/pokemon/Weezing" })
	public PokemonData poke110() {
		PokemonData data = new PokemonData();
		data.setId(110);
		data.setName("マタドガス");
		data.setFeatures("ごくまれに　突然変異で　" + "双子の　小さい　ドガースが　" + "連結したまま　出ることがある。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/110.png");
		return data;
	}

	@RequestMapping({ "/pokemon/111", "/pokemon/サイホーン", "/pokemon/Rhyhorn" })
	public PokemonData poke111() {
		PokemonData data = new PokemonData();
		data.setId(111);
		data.setName("サイホーン");
		data.setFeatures("４本の　脚は　短くて　" + "うまく　曲がれない。ただひたすらに　" + "突進するだけだ。");
		data.setType("じめん");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/111.png");
		return data;
	}

	@RequestMapping({ "/pokemon/112", "/pokemon/サイドン", "/pokemon/Rhydon" })
	public PokemonData poke112() {
		PokemonData data = new PokemonData();
		data.setId(112);
		data.setName("サイドン");
		data.setFeatures("進化して　後ろ足だけで　" + "立つようになった。ツノで　突かれると　" + "岩石にも　穴が　開いてしまう。");
		data.setType("じめん");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/112.png");
		return data;
	}

	@RequestMapping({ "/pokemon/113", "/pokemon/ラッキー", "/pokemon/Chansey" })
	public PokemonData poke113() {
		PokemonData data = new PokemonData();
		data.setId(113);
		data.setName("ラッキー");
		data.setFeatures("１日に　いくつか　タマゴを　産む。　" + "その　タマゴは　栄養満点で　" + "ものすごく　おいしいらしい。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/113.png");
		return data;
	}

	@RequestMapping({ "/pokemon/114", "/pokemon/モンジャラ", "/pokemon/Tangela" })
	public PokemonData poke114() {
		PokemonData data = new PokemonData();
		data.setId(114);
		data.setName("モンジャラ");
		data.setFeatures("動くものに　ツルを　絡める。　" + "ツルは　微妙に　揺れているので　" + "絡みつかれると　くすぐったい。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/114.png");
		return data;
	}

	@RequestMapping({ "/pokemon/115", "/pokemon/ガルーラ", "/pokemon/Kangaskhan" })
	public PokemonData poke115() {
		PokemonData data = new PokemonData();
		data.setId(115);
		data.setName("ガルーラ");
		data.setFeatures("安全な　場所なら　子供も　" + "お腹の　袋から　出て　遊ぶ。　" + "親は　それを　じっと　見守る。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/115.png");
		return data;
	}

	@RequestMapping({ "/pokemon/116", "/pokemon/タッツー", "/pokemon/Horsea" })
	public PokemonData poke116() {
		PokemonData data = new PokemonData();
		data.setId(116);
		data.setName("タッツー");
		data.setFeatures("サンゴの　陰に　住処を　作る。　" + "危険を　感じると　口から　" + "真っ黒い　墨を　吐いて　逃げる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/116.png");
		return data;
	}

	@RequestMapping({ "/pokemon/117", "/pokemon/シードラ", "/pokemon/Seadra" })
	public PokemonData poke117() {
		PokemonData data = new PokemonData();
		data.setId(117);
		data.setName("シードラ");
		data.setFeatures("羽と　尻尾を　素早く　動かし　" + "前を　向いたまま　後ろへ　" + "泳ぐこともできる　ポケモン。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/117.png");
		return data;
	}

	@RequestMapping({ "/pokemon/118", "/pokemon/トサキント", "/pokemon/Goldeen" })
	public PokemonData poke118() {
		PokemonData data = new PokemonData();
		data.setId(118);
		data.setName("トサキント");
		data.setFeatures("背びれ　胸びれ　尾びれが　" + "優雅に　たなびくので　" + "水の踊り子　と呼ばれる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/118.png");
		return data;
	}

	@RequestMapping({ "/pokemon/119", "/pokemon/アズマオウ", "/pokemon/Seaking" })
	public PokemonData poke119() {
		PokemonData data = new PokemonData();
		data.setId(119);
		data.setName("アズマオウ");
		data.setFeatures("頭の　ツノで　川底にある　" + "岩を　くり抜いて　巣を　作る。　" + "タマゴを　命がけで　守る。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/119.png");
		return data;
	}

	@RequestMapping({ "/pokemon/120", "/pokemon/ヒトデマン", "/pokemon/Staryu" })
	public PokemonData poke120() {
		PokemonData data = new PokemonData();
		data.setId(120);
		data.setName("ヒトデマン");
		data.setFeatures("海辺に　多く　現れ　" + "夜になると　中心が　" + "赤く　点滅する。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/120.png");
		return data;
	}

	@RequestMapping({ "/pokemon/121", "/pokemon/スターミー", "/pokemon/Starmie" })
	public PokemonData poke121() {
		PokemonData data = new PokemonData();
		data.setId(121);
		data.setName("スターミー");
		data.setFeatures("体の　中心にある　赤いコアから　" + "夜空に　向かって　ナゾの　電波を　" + "発信している。");
		data.setType("みず");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/121.png");
		return data;
	}

	@RequestMapping({ "/pokemon/122", "/pokemon/バリヤード", "/pokemon/Mr. Mime" })
	public PokemonData poke122() {
		PokemonData data = new PokemonData();
		data.setId(122);
		data.setName("バリヤード");
		data.setFeatures("人を　信じこませるのが　うまい。　" + "パントマイムで　作った　壁が　" + "本当に　現れるという。");
		data.setType("エスパー");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/122.png");
		return data;
	}

	@RequestMapping({ "/pokemon/123", "/pokemon/ストライク", "/pokemon/Scyther" })
	public PokemonData poke123() {
		PokemonData data = new PokemonData();
		data.setId(123);
		data.setName("ストライク");
		data.setFeatures("ニンジャのように　素早い　動きで　" + "獲物を　惑わせる。　一瞬の　" + "隙に　鎌で　切り裂いて　しまう。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/123.png");
		return data;
	}

	@RequestMapping({ "/pokemon/124", "/pokemon/ルージュラ", "/pokemon/Jynx" })
	public PokemonData poke124() {
		PokemonData data = new PokemonData();
		data.setId(124);
		data.setName("ルージュラ");
		data.setFeatures("人間のような　言葉を　話すが　" + "まだ　なにを言っているか　不明で　" + "現在　研究されている。");
		data.setType("こおり");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/124.png");
		return data;
	}

	@RequestMapping({ "/pokemon/125", "/pokemon/エレブー", "/pokemon/Electabuzz" })
	public PokemonData poke125() {
		PokemonData data = new PokemonData();
		data.setId(125);
		data.setName("エレブー");
		data.setFeatures("強い　電気が　大好物で　" + "大きな　発電所などに　" + "しばしば　現れる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/125.png");
		return data;
	}

	@RequestMapping({ "/pokemon/126", "/pokemon/ブーバー", "/pokemon/Magmar" })
	public PokemonData poke126() {
		PokemonData data = new PokemonData();
		data.setId(126);
		data.setName("ブーバー");
		data.setFeatures("火山の　火口で　生まれ育った。　" + "太陽と　同じような　炎の　" + "ゆらめきが　全身を　覆う。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/126.png");
		return data;
	}

	@RequestMapping({ "/pokemon/127", "/pokemon/カイロス", "/pokemon/Pinsir" })
	public PokemonData poke127() {
		PokemonData data = new PokemonData();
		data.setId(127);
		data.setName("カイロス");
		data.setFeatures("長い　ツノを　振り回して　" + "攻撃してくる。寒いときは　" + "森の　奥に　姿を　隠す。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/127.png");
		return data;
	}

	@RequestMapping({ "/pokemon/128", "/pokemon/ケンタロス", "/pokemon/Tauros" })
	public PokemonData poke128() {
		PokemonData data = new PokemonData();
		data.setId(128);
		data.setName("ケンタロス");
		data.setFeatures("体当たりしてくるとき　" + "３本の　尻尾で　自分の　体を　" + "ピシピシと　たたく。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/128.png");
		return data;
	}

	@RequestMapping({ "/pokemon/129", "/pokemon/コイキング", "/pokemon/Magikarp" })
	public PokemonData poke129() {
		PokemonData data = new PokemonData();
		data.setId(129);
		data.setName("コイキング");
		data.setFeatures("大昔は　まだ　もう少し　" + "強かったらしい。しかし　今は　" + "悲しいくらいに　弱いのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/129.png");
		return data;
	}

	@RequestMapping({ "/pokemon/130", "/pokemon/ギャラドス", "/pokemon/Gyarados" })
	public PokemonData poke130() {
		PokemonData data = new PokemonData();
		data.setId(130);
		data.setName("ギャラドス");
		data.setFeatures("めったに　姿を　現さないが　" + "ひとたび　暴れ出すと　大きな　" + "都市が　壊滅するときもある。");
		data.setType("みず");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/130.png");
		return data;
	}

	@RequestMapping({ "/pokemon/131", "/pokemon/ラプラス", "/pokemon/Lapras" })
	public PokemonData poke131() {
		PokemonData data = new PokemonData();
		data.setId(131);
		data.setName("ラプラス");
		data.setFeatures("人の　言葉を　理解する　高い　" + "知能を　持つ。海の　上を　" + "人を　乗せて　進むのが　好き。");
		data.setType("みず");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/131.png");
		return data;
	}

	@RequestMapping({ "/pokemon/132", "/pokemon/メタモン", "/pokemon/Ditto" })
	public PokemonData poke132() {
		PokemonData data = new PokemonData();
		data.setId(132);
		data.setName("メタモン");
		data.setFeatures("体の　細胞の　作りを　" + "自分で　組み替えて　" + "ほかの　生命体に　変身する。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/132.png");
		return data;
	}

	@RequestMapping({ "/pokemon/133", "/pokemon/イーブイ", "/pokemon/Eevee" })
	public PokemonData poke133() {
		PokemonData data = new PokemonData();
		data.setId(133);
		data.setName("イーブイ");
		data.setFeatures("不安定な　遺伝子の　おかげで　" + "さまざまな　進化の　可能性を　" + "秘めている　特殊な　ポケモン。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/133.png");
		return data;
	}

	@RequestMapping({ "/pokemon/134", "/pokemon/シャワーズ", "/pokemon/Vaporeon" })
	public PokemonData poke134() {
		PokemonData data = new PokemonData();
		data.setId(134);
		data.setName("シャワーズ");
		data.setFeatures("水中での　生活に　適した　" + "体に　進化した。　" + "水に　溶けると　見えなくなる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/134.png");
		return data;
	}

	@RequestMapping({ "/pokemon/135", "/pokemon/サンダース", "/pokemon/Jolteon" })
	public PokemonData poke135() {
		PokemonData data = new PokemonData();
		data.setId(135);
		data.setName("サンダース");
		data.setFeatures("空気中の　マイナスイオンを　" + "吸いこんで　約１００００ボルトの　" + "電気を　吐き出すことがある。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/135.png");
		return data;
	}

	@RequestMapping({ "/pokemon/136", "/pokemon/ブースター", "/pokemon/Flareon" })
	public PokemonData poke136() {
		PokemonData data = new PokemonData();
		data.setId(136);
		data.setName("ブースター");
		data.setFeatures("体内に　炎袋があり　" + "深く　息を　吸いこんだあと　" + "１７００度の　火を　吐く。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/136.png");
		return data;
	}

	@RequestMapping({ "/pokemon/137", "/pokemon/ポリゴン", "/pokemon/Porygon" })
	public PokemonData poke137() {
		PokemonData data = new PokemonData();
		data.setId(137);
		data.setName("ポリゴン");
		data.setFeatures("体が　プログラムで　できている。　" + "電子空間を　自由自在に　" + "移動できる　能力を持つ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/137.png");
		return data;
	}

	@RequestMapping({ "/pokemon/138", "/pokemon/オムナイト", "/pokemon/Omanyte" })
	public PokemonData poke138() {
		PokemonData data = new PokemonData();
		data.setId(138);
		data.setName("オムナイト");
		data.setFeatures("古代の　化石から　復活。　" + "殻の　中に　ためた　空気で　" + "水中を　浮き沈みしていた。");
		data.setType("いわ");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/138.png");
		return data;
	}

	@RequestMapping({ "/pokemon/139", "/pokemon/オムスター", "/pokemon/Omastar" })
	public PokemonData poke139() {
		PokemonData data = new PokemonData();
		data.setId(139);
		data.setName("オムスター");
		data.setFeatures("一度　巻きついたら　絶対に　" + "離れない。鋭い　キバで　" + "獲物を　引き裂くように　食べる。");
		data.setType("いわ");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/139.png");
		return data;
	}

	@RequestMapping({ "/pokemon/140", "/pokemon/カブト", "/pokemon/Kabuto" })
	public PokemonData poke140() {
		PokemonData data = new PokemonData();
		data.setId(140);
		data.setName("カブト");
		data.setFeatures("古代生物の　化石から　" + "再生した　ポケモン。　" + "硬い　殻で　身を　守っている。");
		data.setType("いわ");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/140.png");
		return data;
	}

	@RequestMapping({ "/pokemon/141", "/pokemon/カブトプス", "/pokemon/Kabutops" })
	public PokemonData poke141() {
		PokemonData data = new PokemonData();
		data.setId(141);
		data.setName("カブトプス");
		data.setFeatures("細い　体で　素早く　泳ぐ。　" + "捕らえた　獲物は　カマで　切り裂き　" + "体液を　吸っていたらしい。");
		data.setType("いわ");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/141.png");
		return data;
	}

	@RequestMapping({ "/pokemon/142", "/pokemon/プテラ", "/pokemon/Aerodactyl" })
	public PokemonData poke142() {
		PokemonData data = new PokemonData();
		data.setId(142);
		data.setName("プテラ");
		data.setFeatures("甲高い　声で　叫びながら　" + "古代の　大空を　飛んでいたとされる　" + "どうもうな　ポケモン。");
		data.setType("いわ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/142.png");
		return data;
	}

	@RequestMapping({ "/pokemon/143", "/pokemon/カビゴン", "/pokemon/Snorlax" })
	public PokemonData poke143() {
		PokemonData data = new PokemonData();
		data.setId(143);
		data.setName("カビゴン");
		data.setFeatures("カビが　生えていても　腐っていても　" + "大丈夫。カビゴンの　胃袋は　" + "なんでも　消化できるのだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/143.png");
		return data;
	}

	@RequestMapping({ "/pokemon/144", "/pokemon/フリーザー", "/pokemon/Articuno" })
	public PokemonData poke144() {
		PokemonData data = new PokemonData();
		data.setId(144);
		data.setName("フリーザー");
		data.setFeatures("雪山で　寒くて　死にそうなとき　" + "目の前に　現れるといわれる　" + "伝説の　ポケモン。");
		data.setType("こおり");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/144.png");
		return data;
	}

	@RequestMapping({ "/pokemon/145", "/pokemon/サンダー", "/pokemon/Zapdos" })
	public PokemonData poke145() {
		PokemonData data = new PokemonData();
		data.setId(145);
		data.setName("サンダー");
		data.setFeatures("雷雲の　中に　いると　" + "言われる　伝説の　ポケモン。　" + "雷を　自在に　操る。");
		data.setType("でんき");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/145.png");
		return data;
	}

	@RequestMapping({ "/pokemon/146", "/pokemon/ファイヤー", "/pokemon/Moltres" })
	public PokemonData poke146() {
		PokemonData data = new PokemonData();
		data.setId(146);
		data.setName("ファイヤー");
		data.setFeatures("伝説の　とりポケモンの　１匹。　" + "ファイヤーが　姿を　見せると　" + "春が　訪れると　言われている。");
		data.setType("ほのお");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/146.png");
		return data;
	}

	@RequestMapping({ "/pokemon/147", "/pokemon/ミニリュウ", "/pokemon/Dratini" })
	public PokemonData poke147() {
		PokemonData data = new PokemonData();
		data.setId(147);
		data.setName("ミニリュウ");
		data.setFeatures("脱皮を　繰り返しては　" + "どんどん　大きくなる　" + "生命力　あふれる　ポケモン。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/147.png");
		return data;
	}

	@RequestMapping({ "/pokemon/148", "/pokemon/ハクリュー", "/pokemon/Dragonair" })
	public PokemonData poke148() {
		PokemonData data = new PokemonData();
		data.setId(148);
		data.setName("ハクリュー");
		data.setFeatures("オーラに　包まれる　神聖な　" + "生き物らしい。天気を　変える　" + "力を　持つと　言われている。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/148.png");
		return data;
	}

	@RequestMapping({ "/pokemon/149", "/pokemon/カイリュー", "/pokemon/Dragonite" })
	public PokemonData poke149() {
		PokemonData data = new PokemonData();
		data.setId(149);
		data.setName("カイリュー");
		data.setFeatures("広い　海の　どこかに　住処が　" + "あると　言われている。難破した　" + "船を　陸まで　導いてくれる。");
		data.setType("ドラゴン");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/149.png");
		return data;
	}

	@RequestMapping({ "/pokemon/150", "/pokemon/ミュウツー", "/pokemon/Mewtwo" })
	public PokemonData poke150() {
		PokemonData data = new PokemonData();
		data.setId(150);
		data.setName("ミュウツー");
		data.setFeatures("ミュウの　遺伝子を　組み替えて　" + "生み出された。ポケモンで　一番　" + "凶暴な　心を　持つという。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/150.png");
		return data;
	}

	@RequestMapping({ "/pokemon/151", "/pokemon/ミュウ", "/pokemon/Mew" })
	public PokemonData poke151() {
		PokemonData data = new PokemonData();
		data.setId(151);
		data.setName("ミュウ");
		data.setFeatures("遺伝子には　すべての　ポケモンの　" + "情報が　含まれているので　" + "あらゆる　技が　使えるという。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/151.png");
		return data;
	}

	@RequestMapping({ "/pokemon/152", "/pokemon/チコリータ", "/pokemon/Chikorita" })
	public PokemonData poke152() {
		PokemonData data = new PokemonData();
		data.setId(152);
		data.setName("チコリータ");
		data.setFeatures("葉っぱを　振り回して　相手を　威嚇するが　" + "葉っぱから　甘い　香りが　漂うので　" + "お互いに　和やかな　雰囲気に　なるよ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/152.png");
		return data;
	}

	@RequestMapping({ "/pokemon/153", "/pokemon/ベイリーフ", "/pokemon/Bayleef" })
	public PokemonData poke153() {
		PokemonData data = new PokemonData();
		data.setId(153);
		data.setName("ベイリーフ");
		data.setFeatures("首の　周りの　くるりと　巻いた　葉っぱの　" + "中には　小さな　木の芽が　１個　なっている。　" + "その　香りは　人を　元気に　させるぞ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/153.png");
		return data;
	}

	@RequestMapping({ "/pokemon/154", "/pokemon/メガニウム", "/pokemon/Meganium" })
	public PokemonData poke154() {
		PokemonData data = new PokemonData();
		data.setId(154);
		data.setName("メガニウム");
		data.setFeatures("花の　香りは　気持ちを　穏やかにする。　" + "戦いの　ときは　香りを　発散させて　" + "相手の　戦う　気持ちを　鈍らせるのだ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/154.png");
		return data;
	}

	@RequestMapping({ "/pokemon/155", "/pokemon/ヒノアラシ", "/pokemon/Cyndaquil" })
	public PokemonData poke155() {
		PokemonData data = new PokemonData();
		data.setId(155);
		data.setName("ヒノアラシ");
		data.setFeatures("背中から　炎を　噴き上げて　身を　守る。　" + "怒った　ときの　炎は　勢いが　いいが　" + "疲れている　ときは　不完全燃焼する。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/155.png");
		return data;
	}

	@RequestMapping({ "/pokemon/156", "/pokemon/マグマラシ", "/pokemon/Quilava" })
	public PokemonData poke156() {
		PokemonData data = new PokemonData();
		data.setId(156);
		data.setName("マグマラシ");
		data.setFeatures("炎の　勢いと　熱風で　威嚇する。　" + "素早い　身のこなしで　相手の　攻撃を　" + "かわしながら　同時に　炎で　燃やす。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/156.png");
		return data;
	}

	@RequestMapping({ "/pokemon/157", "/pokemon/バクフーン", "/pokemon/Typhlosion" })
	public PokemonData poke157() {
		PokemonData data = new PokemonData();
		data.setId(157);
		data.setName("バクフーン");
		data.setFeatures("灼熱の　炎で　周りに　陽炎を　" + "つくりだして　姿を　隠す　ことが　できる。　" + "燃えあがる　爆風は　すべてを　焼き尽くすぞ。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/157.png");
		return data;
	}

	@RequestMapping({ "/pokemon/158", "/pokemon/ワニノコ", "/pokemon/Totodile" })
	public PokemonData poke158() {
		PokemonData data = new PokemonData();
		data.setId(158);
		data.setName("ワニノコ");
		data.setFeatures("小さな　体でも　アゴの　力は　強い。　" + "ワニノコ自身は　甘がみ　している　つもりでも　" + "大怪我を　してしまう　ほどの　力が　ある。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/158.png");
		return data;
	}

	@RequestMapping({ "/pokemon/159", "/pokemon/アリゲイツ", "/pokemon/Croconaw" })
	public PokemonData poke159() {
		PokemonData data = new PokemonData();
		data.setId(159);
		data.setName("アリゲイツ");
		data.setFeatures("一度　かみついたら　絶対に　離さない。　" + "キバの　先が　釣り針　みたいに　反り返って　" + "いるので　一度　刺さると　抜けなく　なるのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/159.png");
		return data;
	}

	@RequestMapping({ "/pokemon/160", "/pokemon/オーダイル", "/pokemon/Feraligatr" })
	public PokemonData poke160() {
		PokemonData data = new PokemonData();
		data.setId(160);
		data.setName("オーダイル");
		data.setFeatures("大きな　口を　開けて　相手を　威嚇する。　" + "強靭な　後ろ足で　地面を　蹴って　" + "ものすごい　スピードで　突進　してくるぞ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/160.png");
		return data;
	}

	@RequestMapping({ "/pokemon/161", "/pokemon/オタチ", "/pokemon/Sentret" })
	public PokemonData poke161() {
		PokemonData data = new PokemonData();
		data.setId(161);
		data.setName("オタチ");
		data.setFeatures("眠る　ときには　交代で　見張りをする。　" + "危険を　察知すると　仲間を　おこすのだ。　" + "群れから　はぐれると　怖くて　眠れなくなる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/161.png");
		return data;
	}

	@RequestMapping({ "/pokemon/162", "/pokemon/オオタチ", "/pokemon/Furret" })
	public PokemonData poke162() {
		PokemonData data = new PokemonData();
		data.setId(162);
		data.setName("オオタチ");
		data.setFeatures("敵に　襲われても　細い　すき間に　" + "するりと　潜り込んで　逃げる　ことが　できる、　" + "手足は　短いが　とても　すばしっこい。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/162.png");
		return data;
	}

	@RequestMapping({ "/pokemon/163", "/pokemon/ホーホー", "/pokemon/Hoothoot" })
	public PokemonData poke163() {
		PokemonData data = new PokemonData();
		data.setId(163);
		data.setName("ホーホー");
		data.setFeatures("体の　中には　地球の　自転を　" + "感じ取る　器官を　持っているので　毎日　" + "同じ　時間に　なると　鳴き声を　あげる。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/163.png");
		return data;
	}

	@RequestMapping({ "/pokemon/164", "/pokemon/ヨルノズク", "/pokemon/Noctowl" })
	public PokemonData poke164() {
		PokemonData data = new PokemonData();
		data.setId(164);
		data.setName("ヨルノズク");
		data.setFeatures("わずかな　光でも　見える　優れた　目と　" + "羽音を　立てない　柔らかい　羽の　おかげで　" + "暗闇では　獲物を　絶対に　逃がさない。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/164.png");
		return data;
	}

	@RequestMapping({ "/pokemon/165", "/pokemon/レディバ", "/pokemon/Ledyba" })
	public PokemonData poke165() {
		PokemonData data = new PokemonData();
		data.setId(165);
		data.setName("レディバ");
		data.setFeatures("足の　付け根から　出す　液体の　臭いで　" + "仲間と　コミュニケーションを　取っている。　" + "臭いの　違いで　気持ちを　伝えるという。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/165.png");
		return data;
	}

	@RequestMapping({ "/pokemon/166", "/pokemon/レディアン", "/pokemon/Ledian" })
	public PokemonData poke166() {
		PokemonData data = new PokemonData();
		data.setId(166);
		data.setName("レディアン");
		data.setFeatures("星が　沢山　見える　空気の　きれいな　" + "土地には　レディアンが　沢山　すむと　いう。　" + "星明りを　エネルギーに　しているからだ。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/166.png");
		return data;
	}

	@RequestMapping({ "/pokemon/167", "/pokemon/イトマル", "/pokemon/Spinarak" })
	public PokemonData poke167() {
		PokemonData data = new PokemonData();
		data.setId(167);
		data.setName("イトマル");
		data.setFeatures("糸で　つくった　ワナは　第２の　神経。　" + "糸を　伝わる　わずかな　振動　だけで　" + "獲物の　種類が　わかると　いわれている。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/167.png");
		return data;
	}

	@RequestMapping({ "/pokemon/168", "/pokemon/アリアドス", "/pokemon/Ariados" })
	public PokemonData poke168() {
		PokemonData data = new PokemonData();
		data.setId(168);
		data.setName("アリアドス");
		data.setFeatures("足の　先端には　小さな　カギヅメが　あり　" + "天井や　垂直の　壁も　歩ける。　" + "細く　丈夫な　糸で　敵を　絞めあげる。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/168.png");
		return data;
	}

	@RequestMapping({ "/pokemon/169", "/pokemon/クロバット", "/pokemon/Crobat" })
	public PokemonData poke169() {
		PokemonData data = new PokemonData();
		data.setId(169);
		data.setName("クロバット");
		data.setFeatures("耳を　すまさないと　聞こえないほど　小さな　" + "羽音で　ねらった　獲物に　忍び寄るぞ。　" + "後ろ足の　ハネで　枝に　つかまり　休む。");
		data.setType("どく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/169.png");
		return data;
	}

	@RequestMapping({ "/pokemon/170", "/pokemon/チョンチー", "/pokemon/Chinchou" })
	public PokemonData poke170() {
		PokemonData data = new PokemonData();
		data.setId(170);
		data.setName("チョンチー");
		data.setFeatures("強い　電気を　発生させる　細胞が　" + "２本の　触手の　中に　詰まっている。　" + "自分も　ちょっと　ピリピリ　しびれるらしい。");
		data.setType("みず");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/170.png");
		return data;
	}

	@RequestMapping({ "/pokemon/171", "/pokemon/ランターン", "/pokemon/Lanturn" })
	public PokemonData poke171() {
		PokemonData data = new PokemonData();
		data.setId(171);
		data.setName("ランターン");
		data.setFeatures("夜中に　船から　暗い　海を　のぞき込むと　" + "深海を　泳ぐ　ランターンの　光が　" + "星空の　ように　見える　ことが　あるよ。");
		data.setType("みず");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/171.png");
		return data;
	}

	@RequestMapping({ "/pokemon/172", "/pokemon/ピチュー", "/pokemon/Pichu" })
	public PokemonData poke172() {
		PokemonData data = new PokemonData();
		data.setId(172);
		data.setName("ピチュー");
		data.setFeatures("仲間と　遊んでいるとき　お互いの　電気が　" + "ショートして　火花を　出す　ことが　あるぞ。　" + "火花に　びっくり　すると　泣き出してしまうよ。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/172.png");
		return data;
	}

	@RequestMapping({ "/pokemon/173", "/pokemon/ピィ", "/pokemon/Cleffa" })
	public PokemonData poke173() {
		PokemonData data = new PokemonData();
		data.setId(173);
		data.setName("ピィ");
		data.setFeatures("流れ星の　多い　夜は　輪に　なって　" + "踊る　ピィの　姿を　みることが　できる。　" + "日の出まで　踊り　夜露で　のどを　潤す。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/173.png");
		return data;
	}

	@RequestMapping({ "/pokemon/174", "/pokemon/ププリン", "/pokemon/Igglybuff" })
	public PokemonData poke174() {
		PokemonData data = new PokemonData();
		data.setId(174);
		data.setName("ププリン");
		data.setFeatures("マシュマロ　みたいな　触り心地の　体から　" + "ほんのり　甘い　においが　漂ってくるよ。　" + "においは　敵の　気持ちを　穏やかにする。");
		data.setType("ノーマル");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/174.png");
		return data;
	}

	@RequestMapping({ "/pokemon/175", "/pokemon/トゲピー", "/pokemon/Togepi" })
	public PokemonData poke175() {
		PokemonData data = new PokemonData();
		data.setId(175);
		data.setName("トゲピー");
		data.setFeatures("人や　ポケモンが　発している　優しさや　" + "楽しい　気持ちを　エネルギーに　している。　" + "カラの　中に　ためた　幸せを　分けている。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/175.png");
		return data;
	}

	@RequestMapping({ "/pokemon/176", "/pokemon/トゲチック", "/pokemon/Togetic" })
	public PokemonData poke176() {
		PokemonData data = new PokemonData();
		data.setId(176);
		data.setName("トゲチック");
		data.setFeatures("幸運を　もたらす　ポケモンと　いわれている。　" + "純粋な　心の　持ち主を　みつけると　" + "姿を　あらわし　幸せを　分け与える。");
		data.setType("フェアリー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/176.png");
		return data;
	}

	@RequestMapping({ "/pokemon/177", "/pokemon/ネイティ", "/pokemon/Natu" })
	public PokemonData poke177() {
		PokemonData data = new PokemonData();
		data.setId(177);
		data.setName("ネイティ");
		data.setFeatures("ジャンプ力の　発達した　ポケモン。　" + "大人の　背丈　以上ある　高さの　枝に　" + "ひらりと　飛び乗り　木の芽を　ついばむ。");
		data.setType("エスパー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/177.png");
		return data;
	}

	@RequestMapping({ "/pokemon/178", "/pokemon/ネイティオ", "/pokemon/Xatu" })
	public PokemonData poke178() {
		PokemonData data = new PokemonData();
		data.setId(178);
		data.setName("ネイティオ");
		data.setFeatures("日中　太陽を　見つめて　動かない。　" + "未来を　見通す　力を　持つと　信じられ　" + "聖なる　ポケモンとして　祭る　人も　いる。");
		data.setType("エスパー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/178.png");
		return data;
	}

	@RequestMapping({ "/pokemon/179", "/pokemon/メリープ", "/pokemon/Mareep" })
	public PokemonData poke179() {
		PokemonData data = new PokemonData();
		data.setId(179);
		data.setName("メリープ");
		data.setFeatures("体毛が　こすれて　静電気が　たまる。　" + "電力が　沢山　たまるほど　尻尾の　" + "先に　ついた　電球が　明るく　光る。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/179.png");
		return data;
	}

	@RequestMapping({ "/pokemon/180", "/pokemon/モココ", "/pokemon/Flaaffy" })
	public PokemonData poke180() {
		PokemonData data = new PokemonData();
		data.setId(180);
		data.setName("モココ");
		data.setFeatures("体毛の　性質が　変化するので　少ない　" + "量でも　沢山の　電気を　つくりだせる。　" + "電気を　遮る　つるつるの　肌を　持つ。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/180.png");
		return data;
	}

	@RequestMapping({ "/pokemon/181", "/pokemon/デンリュウ", "/pokemon/Ampharos" })
	public PokemonData poke181() {
		PokemonData data = new PokemonData();
		data.setId(181);
		data.setName("デンリュウ");
		data.setFeatures("デンリュウの　灯りは　宇宙からも　見える。　" + "昔の　人は　デンリュウの　灯りを　使い　" + "遠くの　仲間と　合図を　送りあっていた。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/181.png");
		return data;
	}

	@RequestMapping({ "/pokemon/182", "/pokemon/キレイハナ", "/pokemon/Bellossom" })
	public PokemonData poke182() {
		PokemonData data = new PokemonData();
		data.setId(182);
		data.setName("キレイハナ");
		data.setFeatures("より　臭い　クサイハナから　進化した　" + "ほうが　きれいな　花を　つけた　キレイハナに　なるよ。　" + "夜に　なると　花びらを　つぼめて　眠る。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/182.png");
		return data;
	}

	@RequestMapping({ "/pokemon/183", "/pokemon/マリル", "/pokemon/Marill" })
	public PokemonData poke183() {
		PokemonData data = new PokemonData();
		data.setId(183);
		data.setName("マリル");
		data.setFeatures("流れの　速い　川で　エサを　取る　ときは　" + "尻尾を　川べりの　木の　幹に　巻きつける。　" + "尻尾は　弾力があって　伸びる　仕組み。");
		data.setType("みず");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/183.png");
		return data;
	}

	@RequestMapping({ "/pokemon/184", "/pokemon/マリルリ", "/pokemon/Azumarill" })
	public PokemonData poke184() {
		PokemonData data = new PokemonData();
		data.setId(184);
		data.setName("マリルリ");
		data.setFeatures("空気の　風船を　つくる　ことが　できる。　" + "ポケモンが　おぼれていると　空気玉を　" + "出して　呼吸が　できる　ように　してあげるのだ。");
		data.setType("みず");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/184.png");
		return data;
	}

	@RequestMapping({ "/pokemon/185", "/pokemon/ウソッキー", "/pokemon/Sudowoodo" })
	public PokemonData poke185() {
		PokemonData data = new PokemonData();
		data.setId(185);
		data.setName("ウソッキー");
		data.setFeatures("敵に　襲われない　ように　木の　ふりをする。　" + "両手は　１年中　緑色なので　" + "冬は　偽物だと　すぐに　ばれてしまう。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/185.png");
		return data;
	}

	@RequestMapping({ "/pokemon/186", "/pokemon/ニョロトノ", "/pokemon/Politoed" })
	public PokemonData poke186() {
		PokemonData data = new PokemonData();
		data.setId(186);
		data.setName("ニョロトノ");
		data.setFeatures("頭の　巻き毛は　王者の　証だ。　" + "長く　きれいに　巻いている　ニョロトノほど　" + "仲間の　尊敬を　集めると　いわれている。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/186.png");
		return data;
	}

	@RequestMapping({ "/pokemon/187", "/pokemon/ハネッコ", "/pokemon/Hoppip" })
	public PokemonData poke187() {
		PokemonData data = new PokemonData();
		data.setId(187);
		data.setName("ハネッコ");
		data.setFeatures("風に　乗って　ふわふわ　漂う　ポケモン。　" + "強風の　気配を　感じると　仲間同士　" + "葉っぱを　絡め　飛ばされない　準備をする。");
		data.setType("くさ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/187.png");
		return data;
	}

	@RequestMapping({ "/pokemon/188", "/pokemon/ポポッコ", "/pokemon/Skiploom" })
	public PokemonData poke188() {
		PokemonData data = new PokemonData();
		data.setId(188);
		data.setName("ポポッコ");
		data.setFeatures("気温が　１８度を　超えると　花が　開く。　" + "温度に　より　花の　開きかたが　変わるので　" + "温度計の　代りに　することも　ある。");
		data.setType("くさ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/188.png");
		return data;
	}

	@RequestMapping({ "/pokemon/189", "/pokemon/ワタッコ", "/pokemon/Jumpluff" })
	public PokemonData poke189() {
		PokemonData data = new PokemonData();
		data.setId(189);
		data.setName("ワタッコ");
		data.setFeatures("暖かい　南風に　乗って　海を　越え　" + "外国まで　飛んでいってしまう　ポケモン。　" + "冷たい　空気に　触れると　地面に　降りる。");
		data.setType("くさ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/189.png");
		return data;
	}

	@RequestMapping({ "/pokemon/190", "/pokemon/エイパム", "/pokemon/Aipom" })
	public PokemonData poke190() {
		PokemonData data = new PokemonData();
		data.setId(190);
		data.setName("エイパム");
		data.setFeatures("器用に　動く　尻尾の　先を　手のひらの　" + "代りに　使っていたら　反対に　両手が　" + "不器用に　なってしまった　ポケモンだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/190.png");
		return data;
	}

	@RequestMapping({ "/pokemon/191", "/pokemon/ヒマナッツ", "/pokemon/Sunkern" })
	public PokemonData poke191() {
		PokemonData data = new PokemonData();
		data.setId(191);
		data.setName("ヒマナッツ");
		data.setFeatures("体に　ためた　栄養は　進化の　ときまで　" + "取っておくため　ほとんど　動こうとしない。　" + "なにも　食べずに　朝露　だけを　飲んでいる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/191.png");
		return data;
	}

	@RequestMapping({ "/pokemon/192", "/pokemon/キマワリ", "/pokemon/Sunflora" })
	public PokemonData poke192() {
		PokemonData data = new PokemonData();
		data.setId(192);
		data.setName("キマワリ");
		data.setFeatures("太陽エネルギーから　栄養を　つくりだす。　" + "気温の　高い　日中　活発に　動き　" + "太陽が　沈むと　ぱったり　動かなくなる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/192.png");
		return data;
	}

	@RequestMapping({ "/pokemon/193", "/pokemon/ヤンヤンマ", "/pokemon/Yanma" })
	public PokemonData poke193() {
		PokemonData data = new PokemonData();
		data.setId(193);
		data.setName("ヤンヤンマ");
		data.setFeatures("目玉を　動かさずに　３６０度　見渡せる。　" + "急ブレーキや　方向転換が　得意。　" + "ねらった　獲物を　素早く　追いつめていく。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/193.png");
		return data;
	}

	@RequestMapping({ "/pokemon/194", "/pokemon/ウパー", "/pokemon/Wooper" })
	public PokemonData poke194() {
		PokemonData data = new PokemonData();
		data.setId(194);
		data.setName("ウパー");
		data.setFeatures("普段は　水の　中で　暮らしているが　エサを　" + "探すときなど　たまに　地上に　出てくる。　" + "陸では　毒の　粘液で　体を　覆う。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/194.png");
		return data;
	}

	@RequestMapping({ "/pokemon/195", "/pokemon/ヌオー", "/pokemon/Quagsire" })
	public PokemonData poke195() {
		PokemonData data = new PokemonData();
		data.setId(195);
		data.setName("ヌオー");
		data.setFeatures("水の　中で　口を　開けて　エサが　偶然　" + "飛び込んで　くるのを　ただただ　待っている。　" + "動かないので　あまり　お腹が　空かないのだ。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/195.png");
		return data;
	}

	@RequestMapping({ "/pokemon/196", "/pokemon/エーフィ", "/pokemon/Espeon" })
	public PokemonData poke196() {
		PokemonData data = new PokemonData();
		data.setId(196);
		data.setName("エーフィ");
		data.setFeatures("認めた　トレーナーには　極めて　忠実。　" + "トレーナーを　危険から　守る　ために　" + "予知能力が　発達したと　いわれている。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/196.png");
		return data;
	}

	@RequestMapping({ "/pokemon/197", "/pokemon/ブラッキー", "/pokemon/Umbreon" })
	public PokemonData poke197() {
		PokemonData data = new PokemonData();
		data.setId(197);
		data.setName("ブラッキー");
		data.setFeatures("月の　波動を　受けて　進化した　ポケモン。　" + "暗闇に　じっと　潜み　相手を　うかがう。　" + "襲いかかる　とき　体の　輪っかが　光る。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/197.png");
		return data;
	}

	@RequestMapping({ "/pokemon/198", "/pokemon/ヤミカラス", "/pokemon/Murkrow" })
	public PokemonData poke198() {
		PokemonData data = new PokemonData();
		data.setId(198);
		data.setName("ヤミカラス");
		data.setFeatures("不幸を　運ぶと　いわれ　恐れられていた。　" + "キラキラ　光る　ものに　興味を　示し　" + "女性の　指輪を　取っていこうとする。");
		data.setType("あく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/198.png");
		return data;
	}

	@RequestMapping({ "/pokemon/199", "/pokemon/ヤドキング", "/pokemon/Slowking" })
	public PokemonData poke199() {
		PokemonData data = new PokemonData();
		data.setId(199);
		data.setName("ヤドキング");
		data.setFeatures("世界の　不思議を　解明　するため　毎日　" + "研究　しているが　頭の　シェルダーが　" + "外れると　全部　忘れてしまう　らしい。");
		data.setType("みず");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/199.png");
		return data;
	}

	@RequestMapping({ "/pokemon/200", "/pokemon/ムウマ", "/pokemon/Misdreavus" })
	public PokemonData poke200() {
		PokemonData data = new PokemonData();
		data.setId(200);
		data.setName("ムウマ");
		data.setFeatures("すすり泣く　ような　鳴き声で　怖がらせる。　" + "相手の　怖がる　心を　赤い　玉で　" + "吸収して　栄養に　している　らしい。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/200.png");
		return data;
	}

	@RequestMapping({ "/pokemon/201", "/pokemon/アンノーン", "/pokemon/Unown" })
	public PokemonData poke201() {
		PokemonData data = new PokemonData();
		data.setId(201);
		data.setName("アンノーン");
		data.setFeatures("古代の　文字に　似た　姿の　ポケモン。　" + "先に　生まれたのは　文字か　アンノーンなのか。　" + "研究中だが　いまだに　謎である。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/201.png");
		return data;
	}

	@RequestMapping({ "/pokemon/202", "/pokemon/ソーナンス", "/pokemon/Wobbuffet" })
	public PokemonData poke202() {
		PokemonData data = new PokemonData();
		data.setId(202);
		data.setName("ソーナンス");
		data.setFeatures("ひたすら　我慢する　ポケモンだが　尻尾を　" + "攻撃される　ことだけは　我慢　出来ない。　" + "相手を　道連れにする　チャンスを　伺う。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/202.png");
		return data;
	}

	@RequestMapping({ "/pokemon/203", "/pokemon/キリンリキ", "/pokemon/Girafarig" })
	public PokemonData poke203() {
		PokemonData data = new PokemonData();
		data.setId(203);
		data.setName("キリンリキ");
		data.setFeatures("尻尾の　脳は　考えごとが　出来ないほど　" + "小さいけど　眠らなくても　平気　なので　" + "２４時間　あたりを　見張り続けて　いるぞ。");
		data.setType("ノーマル");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/203.png");
		return data;
	}

	@RequestMapping({ "/pokemon/204", "/pokemon/クヌギダマ", "/pokemon/Pineco" })
	public PokemonData poke204() {
		PokemonData data = new PokemonData();
		data.setId(204);
		data.setName("クヌギダマ");
		data.setFeatures("木の　枝に　ぶら下がり　獲物を　待っている。　" + "木を　揺らされて　食事の　邪魔を　されると　" + "地面に　落ちてから　いきなり　爆発するぞ。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/204.png");
		return data;
	}

	@RequestMapping({ "/pokemon/205", "/pokemon/フォレトス", "/pokemon/Forretress" })
	public PokemonData poke205() {
		PokemonData data = new PokemonData();
		data.setId(205);
		data.setName("フォレトス");
		data.setFeatures("鋼鉄の　カラの　中に　本体が　いる。　" + "獲物を　捕まえる　ときに　カラが　開くが　" + "あまりの　速さに　中身は　見えないのだ。");
		data.setType("むし");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/205.png");
		return data;
	}

	@RequestMapping({ "/pokemon/206", "/pokemon/ノコッチ", "/pokemon/Dunsparce" })
	public PokemonData poke206() {
		PokemonData data = new PokemonData();
		data.setId(206);
		data.setName("ノコッチ");
		data.setFeatures("ドリルの　シッポを　使って　後ろ向きに　" + "地面を　掘り進み　複雑な　形の　" + "巣穴を　地中　深くに　つくる　ポケモン。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/206.png");
		return data;
	}

	@RequestMapping({ "/pokemon/207", "/pokemon/グライガー", "/pokemon/Gligar" })
	public PokemonData poke207() {
		PokemonData data = new PokemonData();
		data.setId(207);
		data.setName("グライガー");
		data.setFeatures("音を　立てず　滑る　ように　滑空する。　" + "両腕の　大きな　ツメと　足の　ツメで　" + "獲物の　顔に　しがみつき　毒針を　刺す。");
		data.setType("じめん");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/207.png");
		return data;
	}

	@RequestMapping({ "/pokemon/208", "/pokemon/ハガネール", "/pokemon/Steelix" })
	public PokemonData poke208() {
		PokemonData data = new PokemonData();
		data.setId(208);
		data.setName("ハガネール");
		data.setFeatures("イワークよりも　深い　地中に　すんでいる。　" + "地球の　中心に　向かって　掘り進み　" + "深さ　１キロに　達する　ことも　ある。");
		data.setType("はがね");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/208.png");
		return data;
	}

	@RequestMapping({ "/pokemon/209", "/pokemon/ブルー", "/pokemon/Snubbull" })
	public PokemonData poke209() {
		PokemonData data = new PokemonData();
		data.setId(209);
		data.setName("ブルー");
		data.setFeatures("キバを　むき出して　怖い　顔を　すれば　" + "小さな　ポケモンなら　おびえて　逃げ出す。　" + "逃げられた　ブルーは　ちょっと　寂しそう。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/209.png");
		return data;
	}

	@RequestMapping({ "/pokemon/210", "/pokemon/グランブル", "/pokemon/Granbull" })
	public PokemonData poke210() {
		PokemonData data = new PokemonData();
		data.setId(210);
		data.setName("グランブル");
		data.setFeatures("下アゴが　とても　発達した　ポケモン。　" + "キバが　重たいので　首を　傾げている。　" + "驚かさなければ　無暗に　かみつかない。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/210.png");
		return data;
	}

	@RequestMapping({ "/pokemon/211", "/pokemon/ハリーセン", "/pokemon/Qwilfish" })
	public PokemonData poke211() {
		PokemonData data = new PokemonData();
		data.setId(211);
		data.setName("ハリーセン");
		data.setFeatures("飲み込んだ　水の　力を　利用して　" + "全身の　毒針を　一斉に　打ち出す。　" + "泳ぐのは　ちょっと　苦手な　ポケモンだ。");
		data.setType("みず");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/211.png");
		return data;
	}

	@RequestMapping({ "/pokemon/212", "/pokemon/ハッサム", "/pokemon/Scizor" })
	public PokemonData poke212() {
		PokemonData data = new PokemonData();
		data.setId(212);
		data.setName("ハッサム");
		data.setFeatures("鋼の　硬さを　持つ　体は　ちょっとや　" + "そっとの　攻撃では　びくとも　しないぞ。　" + "ハネを　羽ばたかせ　体温を　調節する。");
		data.setType("むし");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/212.png");
		return data;
	}

	@RequestMapping({ "/pokemon/213", "/pokemon/ツボツボ", "/pokemon/Shuckle" })
	public PokemonData poke213() {
		PokemonData data = new PokemonData();
		data.setId(213);
		data.setName("ツボツボ");
		data.setFeatures("岩の　下で　甲羅の　中に　たくわえた　" + "きのみを　食べながら　身を　潜めている。　" + "体液と　混ざり　きのみは　ジュースに　なる。");
		data.setType("むし");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/213.png");
		return data;
	}

	@RequestMapping({ "/pokemon/214", "/pokemon/ヘラクロス", "/pokemon/Heracross" })
	public PokemonData poke214() {
		PokemonData data = new PokemonData();
		data.setId(214);
		data.setName("ヘラクロス");
		data.setFeatures("手足の　鋭い　ツメが　地面や　樹木に　" + "深く　食い込むので　自慢の　ツノで　相手を　" + "投げ飛ばす　とき　思いっきり　踏ん張れるのだ。");
		data.setType("むし");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/214.png");
		return data;
	}

	@RequestMapping({ "/pokemon/215", "/pokemon/ニューラ", "/pokemon/Sneasel" })
	public PokemonData poke215() {
		PokemonData data = new PokemonData();
		data.setId(215);
		data.setName("ニューラ");
		data.setFeatures("手足の　カギヅメを　突き立てて　木を　登る。　" + "親の　いない　すきを　ねらって　木の　上に　" + "ある　巣　から　タマゴを　盗んで　食べる。");
		data.setType("あく");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/215.png");
		return data;
	}

	@RequestMapping({ "/pokemon/216", "/pokemon/ヒメグマ", "/pokemon/Teddiursa" })
	public PokemonData poke216() {
		PokemonData data = new PokemonData();
		data.setId(216);
		data.setName("ヒメグマ");
		data.setFeatures("ハチミツの　染み込んだ　手の平を　なめている。　" + "ヒメグマの　ハチミツは　果物と　スピアーの　" + "集めた　花粉が　ブレンドされて　つくられる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/216.png");
		return data;
	}

	@RequestMapping({ "/pokemon/217", "/pokemon/リングマ", "/pokemon/Ursaring" })
	public PokemonData poke217() {
		PokemonData data = new PokemonData();
		data.setId(217);
		data.setName("リングマ");
		data.setFeatures("森の　中には　リングマが　エサ集めを　する　" + "大木や　小川が　あちこちに　あると　いう。　" + "毎日　エサを　集めて　森を　歩く。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/217.png");
		return data;
	}

	@RequestMapping({ "/pokemon/218", "/pokemon/マグマッグ", "/pokemon/Slugma" })
	public PokemonData poke218() {
		PokemonData data = new PokemonData();
		data.setId(218);
		data.setName("マグマッグ");
		data.setFeatures("体の　中では　血液の　かわりに　" + "必要な　栄養と　酸素を　運ぶために　" + "灼熱の　マグマが　循環している。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/218.png");
		return data;
	}

	@RequestMapping({ "/pokemon/219", "/pokemon/マグカルゴ", "/pokemon/Magcargo" })
	public PokemonData poke219() {
		PokemonData data = new PokemonData();
		data.setId(219);
		data.setName("マグカルゴ");
		data.setFeatures("体温が　約１万度も　あるので　雨粒に　" + "打たれると　蒸気が　もうもうと　立ち込めて　" + "あたりは　深い　霧に　覆われると　いう。");
		data.setType("ほのお");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/219.png");
		return data;
	}

	@RequestMapping({ "/pokemon/220", "/pokemon/ウリムー", "/pokemon/Swinub" })
	public PokemonData poke220() {
		PokemonData data = new PokemonData();
		data.setId(220);
		data.setName("ウリムー");
		data.setFeatures("地面に　鼻を　擦りつけて　エサを　探す。　" + "枯草の　下に　生えた　キノコが　好物。　" + "たまに　温泉を　掘り当てる　ことが　あるよ。");
		data.setType("こおり");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/220.png");
		return data;
	}

	@RequestMapping({ "/pokemon/221", "/pokemon/イノムー", "/pokemon/Piloswine" })
	public PokemonData poke221() {
		PokemonData data = new PokemonData();
		data.setId(221);
		data.setName("イノムー");
		data.setFeatures("凍える　寒さにも　耐えられる　ように　" + "厚くて　長い　毛皮に　覆われている。　" + "氷に　埋まった　エサを　キバで　掘り出す。");
		data.setType("こおり");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/221.png");
		return data;
	}

	@RequestMapping({ "/pokemon/222", "/pokemon/サニーゴ", "/pokemon/Corsola" })
	public PokemonData poke222() {
		PokemonData data = new PokemonData();
		data.setId(222);
		data.setName("サニーゴ");
		data.setFeatures("暖かい　海に　集まった　サニーゴは　" + "小さい　ポケモンたちの　隠れ家に　なる。　" + "水温が　下がると　南へ　移動する。");
		data.setType("みず");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/222.png");
		return data;
	}

	@RequestMapping({ "/pokemon/223", "/pokemon/テッポウオ", "/pokemon/Remoraid" })
	public PokemonData poke223() {
		PokemonData data = new PokemonData();
		data.setId(223);
		data.setName("テッポウオ");
		data.setFeatures("飲んだ　水を　腹筋を　使い　勢いよく　" + "吹き出して　空を　飛ぶ　獲物を　仕留める。　" + "進化が　近づくと　川を　下っていく。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/223.png");
		return data;
	}

	@RequestMapping({ "/pokemon/224", "/pokemon/オクタン", "/pokemon/Octillery" })
	public PokemonData poke224() {
		PokemonData data = new PokemonData();
		data.setId(224);
		data.setName("オクタン");
		data.setFeatures("吸盤の　腕で　相手に　絡みつく。　" + "動けなくなった　ところを　仕留めるのだ。　" + "かなわない　ときは　スミを　吐いて　逃げる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/224.png");
		return data;
	}

	@RequestMapping({ "/pokemon/225", "/pokemon/デリバード", "/pokemon/Delibird" })
	public PokemonData poke225() {
		PokemonData data = new PokemonData();
		data.setId(225);
		data.setName("デリバード");
		data.setFeatures("尻尾で　エサを　包み　持ち運ぶ　ポケモン。　" + "デリバードに　エサを　分けてもらった　おかげで　" + "エベレストを　登り切れた　冒険家が　いた。");
		data.setType("こおり");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/225.png");
		return data;
	}

	@RequestMapping({ "/pokemon/226", "/pokemon/マンタイン", "/pokemon/Mantine" })
	public PokemonData poke226() {
		PokemonData data = new PokemonData();
		data.setId(226);
		data.setName("マンタイン");
		data.setFeatures("晴れた　日には　海の　上を　優雅に　跳ねる　" + "マンタインの　群れを　見ることが　できるよ。　" + "テッポウオが　くっついていても　気にしない。");
		data.setType("みず");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/226.png");
		return data;
	}

	@RequestMapping({ "/pokemon/227", "/pokemon/エアームド", "/pokemon/Skarmory" })
	public PokemonData poke227() {
		PokemonData data = new PokemonData();
		data.setId(227);
		data.setName("エアームド");
		data.setFeatures("戦いを　繰り返して　ボロボロに　なった　" + "鋼の　ハネは　１年に　１回　生えかわり　" + "元通りの　切れ味を　取り戻すのだ。");
		data.setType("はがね");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/227.png");
		return data;
	}

	@RequestMapping({ "/pokemon/228", "/pokemon/デルビル", "/pokemon/Houndour" })
	public PokemonData poke228() {
		PokemonData data = new PokemonData();
		data.setId(228);
		data.setName("デルビル");
		data.setFeatures("様々な　鳴き声を　使いわけ　仲間と　" + "連絡を　取りあい　獲物を　追い込んでいく。　" + "チームワークの　見事さは　ポケモン随一。");
		data.setType("あく");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/228.png");
		return data;
	}

	@RequestMapping({ "/pokemon/229", "/pokemon/ヘルガー", "/pokemon/Houndoom" })
	public PokemonData poke229() {
		PokemonData data = new PokemonData();
		data.setId(229);
		data.setName("ヘルガー");
		data.setFeatures("頭の　ツノが　大きく　反り返って　いる　" + "ヘルガーが　グループの　リーダー的　存在。　" + "仲間　同士で　争い　リーダーが　決まる。");
		data.setType("あく");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/229.png");
		return data;
	}

	@RequestMapping({ "/pokemon/230", "/pokemon/キングドラ", "/pokemon/Kingdra" })
	public PokemonData poke230() {
		PokemonData data = new PokemonData();
		data.setId(230);
		data.setName("キングドラ");
		data.setFeatures("生き物の　すまない　海底で　眠っている。　" + "台風が　やってくると　目を　覚まして　" + "獲物を　探しに　うろつき回ると　いわれる。");
		data.setType("みず");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/230.png");
		return data;
	}

	@RequestMapping({ "/pokemon/231", "/pokemon/ゴマゾウ", "/pokemon/Phanpy" })
	public PokemonData poke231() {
		PokemonData data = new PokemonData();
		data.setId(231);
		data.setName("ゴマゾウ");
		data.setFeatures("長い　鼻を　使って　水浴びを　する。　" + "仲間が　集まってくると　水を　掛け合う。　" + "ずぶぬれの　体を　水辺で　乾かすよ。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/231.png");
		return data;
	}

	@RequestMapping({ "/pokemon/232", "/pokemon/ドンファン", "/pokemon/Donphan" })
	public PokemonData poke232() {
		PokemonData data = new PokemonData();
		data.setId(232);
		data.setName("ドンファン");
		data.setFeatures("硬い　体で　ぶつかれば　家も　壊れる。　" + "その　力を　使って　山道を　ふさいだ　" + "土砂崩れを　どかす　仕事を　手伝うよ。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/232.png");
		return data;
	}

	@RequestMapping({ "/pokemon/233", "/pokemon/ポリゴン２", "/pokemon/Porygon2" })
	public PokemonData poke233() {
		PokemonData data = new PokemonData();
		data.setId(233);
		data.setName("ポリゴン２");
		data.setFeatures("人間が　科学の　力で　つくりだした。　" + "人工　知能を　持たせたので　新しい　" + "仕草や　感情を　ひとりで　覚えていく。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/233.png");
		return data;
	}

	@RequestMapping({ "/pokemon/234", "/pokemon/オドシシ", "/pokemon/Stantler" })
	public PokemonData poke234() {
		PokemonData data = new PokemonData();
		data.setId(234);
		data.setName("オドシシ");
		data.setFeatures("見事な　形の　ツノは　美術品　として　" + "高く　売れた　ために　絶滅　寸前まで　" + "乱獲された　ことのある　ポケモン。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/234.png");
		return data;
	}

	@RequestMapping({ "/pokemon/235", "/pokemon/ドーブル", "/pokemon/Smeargle" })
	public PokemonData poke235() {
		PokemonData data = new PokemonData();
		data.setId(235);
		data.setName("ドーブル");
		data.setFeatures("尻尾の　先から　にじみ出る　体液で　" + "縄張りの　周りに　自分の　マークを　描く。　" + "５０００　種類の　マークが　見つかっている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/235.png");
		return data;
	}

	@RequestMapping({ "/pokemon/236", "/pokemon/バルキー", "/pokemon/Tyrogue" })
	public PokemonData poke236() {
		PokemonData data = new PokemonData();
		data.setId(236);
		data.setName("バルキー");
		data.setFeatures("毎日　トレーニング　しないと　ストレスが　" + "たまってしまうので　トレーナーは　育てる　とき　" + "スケジュール管理に　工夫が　必要だ。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/236.png");
		return data;
	}

	@RequestMapping({ "/pokemon/237", "/pokemon/カポエラー", "/pokemon/Hitmontop" })
	public PokemonData poke237() {
		PokemonData data = new PokemonData();
		data.setId(237);
		data.setName("カポエラー");
		data.setFeatures("高速　回転しながら　放つ　キックは　" + "攻撃と　防御を　兼ねた　見事な　技。　" + "歩く　よりも　回転した　ほうが　速い。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/237.png");
		return data;
	}

	@RequestMapping({ "/pokemon/238", "/pokemon/ムチュール", "/pokemon/Smoochum" })
	public PokemonData poke238() {
		PokemonData data = new PokemonData();
		data.setId(238);
		data.setName("ムチュール");
		data.setFeatures("元気　いっぱい　動き回るが　よく　転ぶ。　" + "むっくり　起き上がると　湖の　水面に　" + "顔を　映して　汚れていないか　調べる。");
		data.setType("こおり");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/238.png");
		return data;
	}

	@RequestMapping({ "/pokemon/239", "/pokemon/エレキッド", "/pokemon/Elekid" })
	public PokemonData poke239() {
		PokemonData data = new PokemonData();
		data.setId(239);
		data.setName("エレキッド");
		data.setFeatures("金属に　触って　体に　ためた　電気が　" + "放電　してしまうと　両腕を　ぐるぐる　" + "回して　再び　電気を　ためる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/239.png");
		return data;
	}

	@RequestMapping({ "/pokemon/240", "/pokemon/ブビィ", "/pokemon/Magby" })
	public PokemonData poke240() {
		PokemonData data = new PokemonData();
		data.setId(240);
		data.setName("ブビィ");
		data.setFeatures("黄色い　炎を　口から　吹いている　ときは　" + "健康な　証拠だが　疲れていると　黒い　" + "煙が　混ざる　ように　なるぞ。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/240.png");
		return data;
	}

	@RequestMapping({ "/pokemon/241", "/pokemon/ミルタンク", "/pokemon/Miltank" })
	public PokemonData poke241() {
		PokemonData data = new PokemonData();
		data.setId(241);
		data.setName("ミルタンク");
		data.setFeatures("毎日　２０リットルの　ミルクを　だす。　" + "甘い　ミルクは　大人も　子どもも　大好き。　" + "苦手な　人は　ヨーグルトにして　食べている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/241.png");
		return data;
	}

	@RequestMapping({ "/pokemon/242", "/pokemon/ハピナス", "/pokemon/Blissey" })
	public PokemonData poke242() {
		PokemonData data = new PokemonData();
		data.setId(242);
		data.setName("ハピナス");
		data.setFeatures("ふわふわの　体毛で　悲しんでいる　心を　" + "キャッチすると　どんなに　遠くでも　駆けつけて　" + "笑顔に　なる　しあわせタマゴを　分けてあげる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/242.png");
		return data;
	}

	@RequestMapping({ "/pokemon/243", "/pokemon/ライコウ", "/pokemon/Raikou" })
	public PokemonData poke243() {
		PokemonData data = new PokemonData();
		data.setId(243);
		data.setName("ライコウ");
		data.setFeatures("雷の　スピードを　宿した　ポケモン。　" + "その　遠ぼえは　雷が　落ちた　ときの　" + "ように　空気を　震わせ　大地を　揺るがす。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/243.png");
		return data;
	}

	@RequestMapping({ "/pokemon/244", "/pokemon/エンテイ", "/pokemon/Entei" })
	public PokemonData poke244() {
		PokemonData data = new PokemonData();
		data.setId(244);
		data.setName("エンテイ");
		data.setFeatures("マグマの　情熱を　宿した　ポケモン。　" + "火山の　噴火から　生まれたと　考えられ　" + "すべてを　焼き尽くす　炎を　噴き上げる。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/244.png");
		return data;
	}

	@RequestMapping({ "/pokemon/245", "/pokemon/スイクン", "/pokemon/Suicune" })
	public PokemonData poke245() {
		PokemonData data = new PokemonData();
		data.setId(245);
		data.setName("スイクン");
		data.setFeatures("わき水の　優しさを　宿した　ポケモン。　" + "滑る　ような　身のこなしで　大地を　走り　" + "濁った　水を　清める　力を　持つ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/245.png");
		return data;
	}

	@RequestMapping({ "/pokemon/246", "/pokemon/ヨーギラス", "/pokemon/Larvitar" })
	public PokemonData poke246() {
		PokemonData data = new PokemonData();
		data.setId(246);
		data.setName("ヨーギラス");
		data.setFeatures("地中　深くで　生まれる　ヨーギラスは　" + "土を　食べ尽くして　地上へ　出ないと　" + "親の　顔を　見る　ことが　できないのだ。");
		data.setType("いわ");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/246.png");
		return data;
	}

	@RequestMapping({ "/pokemon/247", "/pokemon/サナギラス", "/pokemon/Pupitar" })
	public PokemonData poke247() {
		PokemonData data = new PokemonData();
		data.setId(247);
		data.setName("サナギラス");
		data.setFeatures("体内で　つくりだした　ガスを　圧縮して　" + "勢いよく　噴射する　ことで　飛んでいく。　" + "鋼鉄に　ぶつかっても　平気な　ボディだ。");
		data.setType("いわ");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/247.png");
		return data;
	}

	@RequestMapping({ "/pokemon/248", "/pokemon/バンギラス", "/pokemon/Tyranitar" })
	public PokemonData poke248() {
		PokemonData data = new PokemonData();
		data.setId(248);
		data.setName("バンギラス");
		data.setFeatures("自分の　すみかを　つくる　ために　山を　一つ　" + "崩してしまう　ほどの　強い　パワーを　持つ。　" + "戦う　相手を　求めて　山を　さまよう。");
		data.setType("いわ");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/248.png");
		return data;
	}

	@RequestMapping({ "/pokemon/249", "/pokemon/ルギア", "/pokemon/Lugia" })
	public PokemonData poke249() {
		PokemonData data = new PokemonData();
		data.setId(249);
		data.setName("ルギア");
		data.setFeatures("翼を　軽く　羽ばたかせた　だけで　民家を　" + "吹き飛ばす　破壊力を　持っている　ために　" + "海底で　人知れず　暮らす　ように　なった。");
		data.setType("エスパー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/249.png");
		return data;
	}

	@RequestMapping({ "/pokemon/250", "/pokemon/ホウオウ", "/pokemon/Ho-Oh" })
	public PokemonData poke250() {
		PokemonData data = new PokemonData();
		data.setId(250);
		data.setName("ホウオウ");
		data.setFeatures("光の　当たる　角度に　よって　七色に　" + "輝く　ハネは　幸せを　もたらすと　いう。　" + "虹の　ふもとに　すむと　いわれている。");
		data.setType("ほのお");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/250.png");
		return data;
	}

	@RequestMapping({ "/pokemon/251", "/pokemon/セレビィ", "/pokemon/Celebi" })
	public PokemonData poke251() {
		PokemonData data = new PokemonData();
		data.setId(251);
		data.setName("セレビィ");
		data.setFeatures("時を　越え　未来から　やってきた　ポケモン。　" + "セレビィが　姿を　現す　限り　明るい　" + "未来が　待っていると　考えられている。");
		data.setType("エスパー");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/251.png");
		return data;
	}

	@RequestMapping({ "/pokemon/252", "/pokemon/キモリ", "/pokemon/Treecko" })
	public PokemonData poke252() {
		PokemonData data = new PokemonData();
		data.setId(252);
		data.setName("キモリ");
		data.setFeatures("沈着　冷静　何事にも　動じない。　" + "体の　大きな　ポケモンに　にらまれても　" + "一歩も　引かずに　にらみかえすぞ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/252.png");
		return data;
	}

	@RequestMapping({ "/pokemon/253", "/pokemon/ジュプトル", "/pokemon/Grovyle" })
	public PokemonData poke253() {
		PokemonData data = new PokemonData();
		data.setId(253);
		data.setName("ジュプトル");
		data.setFeatures("枝から　枝へ　身軽に　飛び回る。　" + "どんなに　素早い　ポケモンも　森の　中で　" + "ジュプトルを　捕まえる　ことは　不可能だ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/253.png");
		return data;
	}

	@RequestMapping({ "/pokemon/254", "/pokemon/ジュカイン", "/pokemon/Sceptile" })
	public PokemonData poke254() {
		PokemonData data = new PokemonData();
		data.setId(254);
		data.setName("ジュカイン");
		data.setFeatures("背中の　タネには　樹木を　元気にする　" + "栄養が　沢山　詰まっていると　いわれる。　" + "森の　木を　大事に　育てている　ポケモン。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/254.png");
		return data;
	}

	@RequestMapping({ "/pokemon/255", "/pokemon/アチャモ", "/pokemon/Torchic" })
	public PokemonData poke255() {
		PokemonData data = new PokemonData();
		data.setId(255);
		data.setName("アチャモ");
		data.setFeatures("体内に　炎を　燃やす　場所が　あるので　" + "抱きしめると　ぽかぽか　とっても　暖かい。　" + "全身　ふかふかの　羽毛に　覆われている。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/255.png");
		return data;
	}

	@RequestMapping({ "/pokemon/256", "/pokemon/ワカシャモ", "/pokemon/Combusken" })
	public PokemonData poke256() {
		PokemonData data = new PokemonData();
		data.setId(256);
		data.setName("ワカシャモ");
		data.setFeatures("クチバシから　吐きだす　灼熱の　炎と　" + "破壊力　抜群の　キックで　戦う。　" + "鳴き声が　大きいので　とても　やかましい。");
		data.setType("ほのお");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/256.png");
		return data;
	}

	@RequestMapping({ "/pokemon/257", "/pokemon/バシャーモ", "/pokemon/Blaziken" })
	public PokemonData poke257() {
		PokemonData data = new PokemonData();
		data.setId(257);
		data.setName("バシャーモ");
		data.setFeatures("強靭な　足腰を　持ち　３０階　建ての　" + "ビルも　楽々　飛び越す　ことが　できる。　" + "炎の　パンチで　相手を　黒焦げに　する。");
		data.setType("ほのお");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/257.png");
		return data;
	}

	@RequestMapping({ "/pokemon/258", "/pokemon/ミズゴロウ", "/pokemon/Mudkip" })
	public PokemonData poke258() {
		PokemonData data = new PokemonData();
		data.setId(258);
		data.setName("ミズゴロウ");
		data.setFeatures("水中では　ほっぺの　エラで　呼吸する。　" + "ピンチに　なると　体より　大きな　岩を　" + "粉々に　砕く　パワーを　発揮する。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/258.png");
		return data;
	}

	@RequestMapping({ "/pokemon/259", "/pokemon/ヌマクロー", "/pokemon/Marshtomp" })
	public PokemonData poke259() {
		PokemonData data = new PokemonData();
		data.setId(259);
		data.setName("ヌマクロー");
		data.setFeatures("水中を　泳ぐより　泥の　中を　" + "進む　ほうが　断然　速く　移動できる。　" + "足腰が　発達して　２本足で　歩く。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/259.png");
		return data;
	}

	@RequestMapping({ "/pokemon/260", "/pokemon/ラグラージ", "/pokemon/Swampert" })
	public PokemonData poke260() {
		PokemonData data = new PokemonData();
		data.setId(260);
		data.setName("ラグラージ");
		data.setFeatures("ラグラージは　波音や　潮風の　わずかな　" + "違いを　ヒレで　感じ　嵐を　予感する。　" + "嵐になると　岩を　積み上げ　巣を　守る。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/260.png");
		return data;
	}

	@RequestMapping({ "/pokemon/261", "/pokemon/ポチエナ", "/pokemon/Poochyena" })
	public PokemonData poke261() {
		PokemonData data = new PokemonData();
		data.setId(261);
		data.setName("ポチエナ");
		data.setFeatures("なんでも　食べる　雑食性の　ポケモン。　" + "体に　比べ　大きな　キバが　特徴。　" + "尻尾の　毛を　逆立てて　敵を　威嚇する。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/261.png");
		return data;
	}

	@RequestMapping({ "/pokemon/262", "/pokemon/グラエナ", "/pokemon/Mightyena" })
	public PokemonData poke262() {
		PokemonData data = new PokemonData();
		data.setId(262);
		data.setName("グラエナ");
		data.setFeatures("グループで　行動していた　野生の　血が　" + "残っているので　優れた　トレーナー　だけを　" + "リーダーと　認めて　命令に　従う。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/262.png");
		return data;
	}

	@RequestMapping({ "/pokemon/263", "/pokemon/ジグザグマ", "/pokemon/Zigzagoon" })
	public PokemonData poke263() {
		PokemonData data = new PokemonData();
		data.setId(263);
		data.setName("ジグザグマ");
		data.setFeatures("背中の　硬い　毛を　樹木に　こすりつけ　" + "自分の　縄張りで　ある　印を　つける。　" + "死んだ　ふりを　して　敵の　目を　誤魔化すぞ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/263.png");
		return data;
	}

	@RequestMapping({ "/pokemon/264", "/pokemon/マッスグマ", "/pokemon/Linoone" })
	public PokemonData poke264() {
		PokemonData data = new PokemonData();
		data.setId(264);
		data.setName("マッスグマ");
		data.setFeatures("獲物　目掛けて　一直線に　突っ走る。　" + "時速　１００キロを　超える　スピードを　出すが　" + "一度　急停止　しないと　曲がれないのだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/264.png");
		return data;
	}

	@RequestMapping({ "/pokemon/265", "/pokemon/ケムッソ", "/pokemon/Wurmple" })
	public PokemonData poke265() {
		PokemonData data = new PokemonData();
		data.setId(265);
		data.setName("ケムッソ");
		data.setFeatures("エサにしようと　捕まえにきた　オオスバメに　" + "お尻の　トゲを　向けて　抵抗する。　" + "染み出した　毒で　相手を　弱らせるぞ。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/265.png");
		return data;
	}

	@RequestMapping({ "/pokemon/266", "/pokemon/カラサリス", "/pokemon/Silcoon" })
	public PokemonData poke266() {
		PokemonData data = new PokemonData();
		data.setId(266);
		data.setName("カラサリス");
		data.setFeatures("進化するまで　なにも　食べずに　耐えていると　" + "考えられていたが　どうやら　糸に　ついた　" + "雨水で　乾きを　癒しているらしい。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/266.png");
		return data;
	}

	@RequestMapping({ "/pokemon/267", "/pokemon/アゲハント", "/pokemon/Beautifly" })
	public PokemonData poke267() {
		PokemonData data = new PokemonData();
		data.setId(267);
		data.setName("アゲハント");
		data.setFeatures("くるりと　巻いた　針の　ような　長い　口は　" + "花粉を　集める　ときに　とても　便利。　" + "春風に　乗って　花粉を　集めてまわる。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/267.png");
		return data;
	}

	@RequestMapping({ "/pokemon/268", "/pokemon/マユルド", "/pokemon/Cascoon" })
	public PokemonData poke268() {
		PokemonData data = new PokemonData();
		data.setId(268);
		data.setName("マユルド");
		data.setFeatures("動くと　強い　体に　進化　できないので　" + "どんなに　痛めつけられても　じっと　している。　" + "そのとき　受けた　痛みは　ずっと　忘れない。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/268.png");
		return data;
	}

	@RequestMapping({ "/pokemon/269", "/pokemon/ドクケイル", "/pokemon/Dustox" })
	public PokemonData poke269() {
		PokemonData data = new PokemonData();
		data.setId(269);
		data.setName("ドクケイル");
		data.setFeatures("羽ばたくと　細かい　粉が　舞い上がる。　" + "吸いこむと　プロレスラーも　寝込む　猛毒だ。　" + "触角の　レーダーで　エサを　探す。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/269.png");
		return data;
	}

	@RequestMapping({ "/pokemon/270", "/pokemon/ハスボー", "/pokemon/Lotad" })
	public PokemonData poke270() {
		PokemonData data = new PokemonData();
		data.setId(270);
		data.setName("ハスボー");
		data.setFeatures("元々は　地上で　生活していたが　" + "頭の　葉っぱが　重くなったので　水に　" + "浮かんで　暮らすようになったと　いわれている。");
		data.setType("みず");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/270.png");
		return data;
	}

	@RequestMapping({ "/pokemon/271", "/pokemon/ハスブレロ", "/pokemon/Lombre" })
	public PokemonData poke271() {
		PokemonData data = new PokemonData();
		data.setId(271);
		data.setName("ハスブレロ");
		data.setFeatures("体中　ヌルヌルした　粘液で　覆われ　" + "その　手で　触られると　とても　気持ち悪い。　" + "人間の　子どもと　よく　間違えられる。");
		data.setType("みず");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/271.png");
		return data;
	}

	@RequestMapping({ "/pokemon/272", "/pokemon/ルンパッパ", "/pokemon/Ludicolo" })
	public PokemonData poke272() {
		PokemonData data = new PokemonData();
		data.setId(272);
		data.setName("ルンパッパ");
		data.setFeatures("陽気な　リズムを　聞くと　体の　細胞が　" + "活発に　活動を　始める　体質。　" + "戦いでも　すごい　パワーを　発揮するぞ。");
		data.setType("みず");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/272.png");
		return data;
	}

	@RequestMapping({ "/pokemon/273", "/pokemon/タネボー", "/pokemon/Seedot" })
	public PokemonData poke273() {
		PokemonData data = new PokemonData();
		data.setId(273);
		data.setName("タネボー");
		data.setFeatures("枝に　ぶら下がる　姿は　きのみ　そっくり。　" + "いきなり　動いて　ポケモンを　ビックリさせる。　" + "１日　１回　葉っぱで　体を　磨くよ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/273.png");
		return data;
	}

	@RequestMapping({ "/pokemon/274", "/pokemon/コノハナ", "/pokemon/Nuzleaf" })
	public PokemonData poke274() {
		PokemonData data = new PokemonData();
		data.setId(274);
		data.setName("コノハナ");
		data.setFeatures("頭の　葉っぱを　抜いて　草笛を　つくる。　" + "コノハナが　奏でる　草笛の　音色は　" + "森で　迷った　人を　不安にさせる。");
		data.setType("くさ");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/274.png");
		return data;
	}

	@RequestMapping({ "/pokemon/275", "/pokemon/ダーテング", "/pokemon/Shiftry" })
	public PokemonData poke275() {
		PokemonData data = new PokemonData();
		data.setId(275);
		data.setName("ダーテング");
		data.setFeatures("大きな　団扇は　風速　３０メートルの　" + "強風を　起こし　なんでも　吹き飛ばす。　" + "森の　奥で　ひっそり　暮らす　ポケモンだ。");
		data.setType("くさ");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/275.png");
		return data;
	}

	@RequestMapping({ "/pokemon/276", "/pokemon/スバメ", "/pokemon/Taillow" })
	public PokemonData poke276() {
		PokemonData data = new PokemonData();
		data.setId(276);
		data.setName("スバメ");
		data.setFeatures("巣立ちを　終えたばかり　なので　夜に　なると　" + "寂しく　なって　泣いてしまう　ことも　ある。　" + "森に　すむ　ケムッソを　捕まえて　食べる。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/276.png");
		return data;
	}

	@RequestMapping({ "/pokemon/277", "/pokemon/オオスバメ", "/pokemon/Swellow" })
	public PokemonData poke277() {
		PokemonData data = new PokemonData();
		data.setId(277);
		data.setName("オオスバメ");
		data.setFeatures("ツヤの　ある　羽の　手入れは　怠らない。　" + "オオスバメが　２匹　集まると　必ず　" + "お互いの　羽を　きれいに　手入れするぞ。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/277.png");
		return data;
	}

	@RequestMapping({ "/pokemon/278", "/pokemon/キャモメ", "/pokemon/Wingull" })
	public PokemonData poke278() {
		PokemonData data = new PokemonData();
		data.setId(278);
		data.setName("キャモメ");
		data.setFeatures("海から　吹く　上昇　気流に　乗り　" + "細長い　翼を　伸ばして　滑空する。　" + "長い　くちばしは　エサを　取るときに　便利。");
		data.setType("みず");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/278.png");
		return data;
	}

	@RequestMapping({ "/pokemon/279", "/pokemon/ペリッパー", "/pokemon/Pelipper" })
	public PokemonData poke279() {
		PokemonData data = new PokemonData();
		data.setId(279);
		data.setName("ペリッパー");
		data.setFeatures("海面　すれすれを　飛び　エサを　探す。　" + "大きな　クチバシを　海の　中へ　入れて　" + "エサを　すくい取り　一飲みで　食べるぞ。");
		data.setType("みず");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/279.png");
		return data;
	}

	@RequestMapping({ "/pokemon/280", "/pokemon/ラルトス", "/pokemon/Ralts" })
	public PokemonData poke280() {
		PokemonData data = new PokemonData();
		data.setId(280);
		data.setName("ラルトス");
		data.setFeatures("人の　感情を　察知する　力を　持ち　" + "トレーナーが　明るい　気分の　ときには　" + "一緒に　なって　喜ぶ　ポケモンだ。");
		data.setType("エスパー");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/280.png");
		return data;
	}

	@RequestMapping({ "/pokemon/281", "/pokemon/キルリア", "/pokemon/Kirlia" })
	public PokemonData poke281() {
		PokemonData data = new PokemonData();
		data.setId(281);
		data.setName("キルリア");
		data.setFeatures("頭の　ツノで　増幅された　サイコパワーが　" + "使われるとき　周りの　空間が　ねじ曲がり　" + "現実には　ない　景色が　見えると　いう。");
		data.setType("エスパー");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/281.png");
		return data;
	}

	@RequestMapping({ "/pokemon/282", "/pokemon/サーナイト", "/pokemon/Gardevoir" })
	public PokemonData poke282() {
		PokemonData data = new PokemonData();
		data.setId(282);
		data.setName("サーナイト");
		data.setFeatures("サイコパワーで　空間を　ねじ曲げ　小さな　" + "ブラックホールを　つくりだす　力を　持つ。　" + "命懸けで　トレーナーを　守る　ポケモン。");
		data.setType("エスパー");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/282.png");
		return data;
	}

	@RequestMapping({ "/pokemon/283", "/pokemon/アメタマ", "/pokemon/Surskit" })
	public PokemonData poke283() {
		PokemonData data = new PokemonData();
		data.setId(283);
		data.setName("アメタマ");
		data.setFeatures("危険を　感じると　頭の　先っぽから　" + "水あめのような　甘い　液体を　出す。　" + "これが　好物の　ポケモンも　いるよ。");
		data.setType("むし");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/283.png");
		return data;
	}

	@RequestMapping({ "/pokemon/284", "/pokemon/アメモース", "/pokemon/Masquerain" })
	public PokemonData poke284() {
		PokemonData data = new PokemonData();
		data.setId(284);
		data.setName("アメモース");
		data.setFeatures("怒った　表情の　目玉　模様が　" + "悲しそうに　垂れ下がっている　ときは　" + "夕立ちの　降り出す　前兆と　いわれる。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/284.png");
		return data;
	}

	@RequestMapping({ "/pokemon/285", "/pokemon/キノココ", "/pokemon/Shroomish" })
	public PokemonData poke285() {
		PokemonData data = new PokemonData();
		data.setId(285);
		data.setName("キノココ");
		data.setFeatures("危険を　感じると　体を　震わせて　" + "頭の　てっぺんから　胞子を　ばらまくぞ。　" + "草木も　しおれてしまうほどの　猛毒だ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/285.png");
		return data;
	}

	@RequestMapping({ "/pokemon/286", "/pokemon/キノガッサ", "/pokemon/Breloom" })
	public PokemonData poke286() {
		PokemonData data = new PokemonData();
		data.setId(286);
		data.setName("キノガッサ");
		data.setFeatures("シッポの　タネは　毒の　胞子が　固まって　" + "できた　ものなので　食べたら　大変だ。　" + "一口で　お腹が　グルグル　鳴りだすぞ。");
		data.setType("くさ");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/286.png");
		return data;
	}

	@RequestMapping({ "/pokemon/287", "/pokemon/ナマケロ", "/pokemon/Slakoth" })
	public PokemonData poke287() {
		PokemonData data = new PokemonData();
		data.setId(287);
		data.setName("ナマケロ");
		data.setFeatures("心臓の　鼓動は　１分間に　１回。　" + "とにかく　じっと　寝そべっている　ポケモンで　" + "動く　姿を　見ることは　ほとんど　ない。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/287.png");
		return data;
	}

	@RequestMapping({ "/pokemon/288", "/pokemon/ヤルキモノ", "/pokemon/Vigoroth" })
	public PokemonData poke288() {
		PokemonData data = new PokemonData();
		data.setId(288);
		data.setName("ヤルキモノ");
		data.setFeatures("じっとしている　ことが　できない　ポケモンだ。　" + "眠ろうとしても　体の　血が　たぎってしまい　" + "森中を　駆けまわらないと　収まらない。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/288.png");
		return data;
	}

	@RequestMapping({ "/pokemon/289", "/pokemon/ケッキング", "/pokemon/Slaking" })
	public PokemonData poke289() {
		PokemonData data = new PokemonData();
		data.setId(289);
		data.setName("ケッキング");
		data.setFeatures("草原に　刻まれた　半径　１メートルの　" + "輪っかは　ケッキングが　寝そべったまま　周りの　" + "草を　食べ尽くして　できた　ものだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/289.png");
		return data;
	}

	@RequestMapping({ "/pokemon/290", "/pokemon/ツチニン", "/pokemon/Nincada" })
	public PokemonData poke290() {
		PokemonData data = new PokemonData();
		data.setId(290);
		data.setName("ツチニン");
		data.setFeatures("鋭い　ツメで　樹木の　根っこを　削り　" + "水分や　栄養を　吸収する。　" + "太陽の　光は　まぶしいので　苦手。");
		data.setType("むし");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/290.png");
		return data;
	}

	@RequestMapping({ "/pokemon/291", "/pokemon/テッカニン", "/pokemon/Ninjask" })
	public PokemonData poke291() {
		PokemonData data = new PokemonData();
		data.setId(291);
		data.setName("テッカニン");
		data.setFeatures("上手に　育てないと　いうことを　聞かず　" + "大声で　鳴き続けるので　トレーナーの　" + "腕が　試される　ポケモンと　いわれている。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/291.png");
		return data;
	}

	@RequestMapping({ "/pokemon/292", "/pokemon/ヌケニン", "/pokemon/Shedinja" })
	public PokemonData poke292() {
		PokemonData data = new PokemonData();
		data.setId(292);
		data.setName("ヌケニン");
		data.setFeatures("ツチニンが　進化したとき　なぜか　勝手に　" + "モンスターボールに　入っている　ポケモンだ。　" + "体は　まったく　動かず　息も　しない。");
		data.setType("むし");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/292.png");
		return data;
	}

	@RequestMapping({ "/pokemon/293", "/pokemon/ゴニョニョ", "/pokemon/Whismur" })
	public PokemonData poke293() {
		PokemonData data = new PokemonData();
		data.setId(293);
		data.setName("ゴニョニョ");
		data.setFeatures("一度　大声で　鳴き出すと　自分の　" + "声に　びっくりして　さらに　激しく　鳴く。　" + "鳴き止むと　疲れて　眠ってしまう。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/293.png");
		return data;
	}

	@RequestMapping({ "/pokemon/294", "/pokemon/ドゴーム", "/pokemon/Loudred" })
	public PokemonData poke294() {
		PokemonData data = new PokemonData();
		data.setId(294);
		data.setName("ドゴーム");
		data.setFeatures("足を　踏み鳴らしながら　大声を　出す。　" + "大声を　出した後は　しばらくの　間　" + "なにも　聞こえなくなってしまうのが　弱点。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/294.png");
		return data;
	}

	@RequestMapping({ "/pokemon/295", "/pokemon/バクオング", "/pokemon/Exploud" })
	public PokemonData poke295() {
		PokemonData data = new PokemonData();
		data.setId(295);
		data.setName("バクオング");
		data.setFeatures("体の　穴から　笛の　ような　音を　" + "出して　仲間に　気持ちを　伝えている。　" + "大声は　戦う　ときしか　出さないのだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/295.png");
		return data;
	}

	@RequestMapping({ "/pokemon/296", "/pokemon/マクノシタ", "/pokemon/Makuhita" })
	public PokemonData poke296() {
		PokemonData data = new PokemonData();
		data.setId(296);
		data.setName("マクノシタ");
		data.setFeatures("絶対に　あきらめない　根性を　持つ。　" + "沢山　食べ　よく　寝て　運動する　ことで　" + "体の　中に　エネルギーが　充満する。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/296.png");
		return data;
	}

	@RequestMapping({ "/pokemon/297", "/pokemon/ハリテヤマ", "/pokemon/Hariyama" })
	public PokemonData poke297() {
		PokemonData data = new PokemonData();
		data.setId(297);
		data.setName("ハリテヤマ");
		data.setFeatures("肥った　体は　筋肉の　塊。　" + "ぐぐっと　全身に　力を　込めると　" + "筋肉は　岩と　同じ　硬さになるぞ。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/297.png");
		return data;
	}

	@RequestMapping({ "/pokemon/298", "/pokemon/ルリリ", "/pokemon/Azurill" })
	public PokemonData poke298() {
		PokemonData data = new PokemonData();
		data.setId(298);
		data.setName("ルリリ");
		data.setFeatures("尻尾には　成長する　ために　必要な　" + "栄養が　たっぷり　詰まっているぞ。　" + "弾力の　ある　尻尾に　乗って　遊ぶ。");
		data.setType("ノーマル");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/298.png");
		return data;
	}

	@RequestMapping({ "/pokemon/299", "/pokemon/ノズパス", "/pokemon/Nosepass" })
	public PokemonData poke299() {
		PokemonData data = new PokemonData();
		data.setId(299);
		data.setName("ノズパス");
		data.setFeatures("磁石の　鼻を　北に　向けたまま　まったく　" + "動かないと　いわれていたが　１年に　１センチ　" + "移動　している　ことが　観測された。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/299.png");
		return data;
	}

	@RequestMapping({ "/pokemon/300", "/pokemon/エネコ", "/pokemon/Skitty" })
	public PokemonData poke300() {
		PokemonData data = new PokemonData();
		data.setId(300);
		data.setName("エネコ");
		data.setFeatures("自分の　シッポを　追いかけ回す　ポケモン。　" + "野生は　森の　樹木の　穴で　暮らす。　" + "愛くるしい　顔で　ペットとして　大人気。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/300.png");
		return data;
	}

	@RequestMapping({ "/pokemon/301", "/pokemon/エネコロロ", "/pokemon/Delcatty" })
	public PokemonData poke301() {
		PokemonData data = new PokemonData();
		data.setId(301);
		data.setName("エネコロロ");
		data.setFeatures("決まった　すみかを　持たずに　暮らす　ポケモン。　" + "他の　ポケモンが　寝床に　近寄って　きても　" + "決して　争わず　寝る　場所を　変える。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/301.png");
		return data;
	}

	@RequestMapping({ "/pokemon/302", "/pokemon/ヤミラミ", "/pokemon/Sableye" })
	public PokemonData poke302() {
		PokemonData data = new PokemonData();
		data.setId(302);
		data.setName("ヤミラミ");
		data.setFeatures("鋭い　ツメで　土を　掘り　石を　食べる。　" + "石に　含まれた　成分は　結晶となり　" + "体の　表面に　浮かび上がってくる。");
		data.setType("あく");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/302.png");
		return data;
	}

	@RequestMapping({ "/pokemon/303", "/pokemon/クチート", "/pokemon/Mawile" })
	public PokemonData poke303() {
		PokemonData data = new PokemonData();
		data.setId(303);
		data.setName("クチート");
		data.setFeatures("相手を　油断させ　大きな　あごで　がぶり。　" + "可愛い　顔に　だまされると　危険だよ。　" + "鋼の　あごは　ツノが　変形した　ものだ。");
		data.setType("はがね");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/303.png");
		return data;
	}

	@RequestMapping({ "/pokemon/304", "/pokemon/ココドラ", "/pokemon/Aron" })
	public PokemonData poke304() {
		PokemonData data = new PokemonData();
		data.setId(304);
		data.setName("ココドラ");
		data.setFeatures("鋼鉄の　体で　思いっきり　ぶつかれば　" + "大きな　ダンプカーも　一撃で　バラバラだ。　" + "壊れた　ダンプカーを　むしゃむしゃ　食べるぞ。");
		data.setType("はがね");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/304.png");
		return data;
	}

	@RequestMapping({ "/pokemon/305", "/pokemon/コドラ", "/pokemon/Lairon" })
	public PokemonData poke305() {
		PokemonData data = new PokemonData();
		data.setId(305);
		data.setName("コドラ");
		data.setFeatures("石や　水に　含まれている　鉄分を　食べる。　" + "鉄鉱石の　埋もれた　山に　巣を　つくるが　" + "鉄を　取りに来る　人間と　争いになる。");
		data.setType("はがね");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/305.png");
		return data;
	}

	@RequestMapping({ "/pokemon/306", "/pokemon/ボスゴドラ", "/pokemon/Aggron" })
	public PokemonData poke306() {
		PokemonData data = new PokemonData();
		data.setId(306);
		data.setName("ボスゴドラ");
		data.setFeatures("土砂崩れや　山火事で　山が　荒れると　" + "せっせと　土を　運び　木の　苗を　植えて　" + "自分の　縄張りを　きれいに　掃除する。");
		data.setType("はがね");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/306.png");
		return data;
	}

	@RequestMapping({ "/pokemon/307", "/pokemon/アサナン", "/pokemon/Meditite" })
	public PokemonData poke307() {
		PokemonData data = new PokemonData();
		data.setId(307);
		data.setName("アサナン");
		data.setFeatures("めいそうで　精神エネルギーを　高めている。　" + "１日に　きのみを　１個だけしか　食べない。　" + "あまり　食べない　ことも　修行の　一つ。");
		data.setType("かくとう");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/307.png");
		return data;
	}

	@RequestMapping({ "/pokemon/308", "/pokemon/チャーレム", "/pokemon/Medicham" })
	public PokemonData poke308() {
		PokemonData data = new PokemonData();
		data.setId(308);
		data.setName("チャーレム");
		data.setFeatures("ヨガの　力で　第６感が　発達して　" + "サイコパワーを　操れる　ように　なった。　" + "１ヶ月間　なにも　食べずに　めいそうする。");
		data.setType("かくとう");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/308.png");
		return data;
	}

	@RequestMapping({ "/pokemon/309", "/pokemon/ラクライ", "/pokemon/Electrike" })
	public PokemonData poke309() {
		PokemonData data = new PokemonData();
		data.setId(309);
		data.setName("ラクライ");
		data.setFeatures("空気と　体毛の　摩擦で　" + "静電気が　発生。　ラクライが　" + "走ると　バチバチと　音が　鳴る。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/309.png");
		return data;
	}

	@RequestMapping({ "/pokemon/310", "/pokemon/ライボルト", "/pokemon/Manectric" })
	public PokemonData poke310() {
		PokemonData data = new PokemonData();
		data.setId(310);
		data.setName("ライボルト");
		data.setFeatures("たてがみから　強い　電気を　発している。　" + "空気中の　電気を　たてがみに　集め　" + "頭の　上に　雷雲を　つくりだす。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/310.png");
		return data;
	}

	@RequestMapping({ "/pokemon/311", "/pokemon/プラスル", "/pokemon/Plusle" })
	public PokemonData poke311() {
		PokemonData data = new PokemonData();
		data.setId(311);
		data.setName("プラスル");
		data.setFeatures("仲間を　応援する　ときは　全身から　" + "電気の　火花を　出して　パチパチ　光る。　" + "仲間が　負けると　大声で　泣いてしまう。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/311.png");
		return data;
	}

	@RequestMapping({ "/pokemon/312", "/pokemon/マイナン", "/pokemon/Minun" })
	public PokemonData poke312() {
		PokemonData data = new PokemonData();
		data.setId(312);
		data.setName("マイナン");
		data.setFeatures("仲間の　応援が　大好きな　ポケモン。　" + "仲間が　負けそうに　なると　体から　出る　" + "火花の　数が　どんどん　増えていくよ。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/312.png");
		return data;
	}

	@RequestMapping({ "/pokemon/313", "/pokemon/バルビート", "/pokemon/Volbeat" })
	public PokemonData poke313() {
		PokemonData data = new PokemonData();
		data.setId(313);
		data.setName("バルビート");
		data.setFeatures("尻尾の　明かりを　つかって　集団で　" + "夜空に　幾何学的な　図形を　描く。　" + "イルミーゼの　出す　甘い　香りが　大好き。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/313.png");
		return data;
	}

	@RequestMapping({ "/pokemon/314", "/pokemon/イルミーゼ", "/pokemon/Illumise" })
	public PokemonData poke314() {
		PokemonData data = new PokemonData();
		data.setId(314);
		data.setName("イルミーゼ");
		data.setFeatures("バルビートを　誘導して　サインを　描く。　" + "複雑な　サインを　描く　イルミーゼほど　" + "仲間から　尊敬されると　いわれているよ。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/314.png");
		return data;
	}

	@RequestMapping({ "/pokemon/315", "/pokemon/ロゼリア", "/pokemon/Roselia" })
	public PokemonData poke315() {
		PokemonData data = new PokemonData();
		data.setId(315);
		data.setName("ロゼリア");
		data.setFeatures("ごく　まれに　珍しい　色の　花を　" + "咲かせている　ロゼリアが　いると　いわれる。　" + "頭の　トゲは　猛毒を　持っているぞ。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/315.png");
		return data;
	}

	@RequestMapping({ "/pokemon/316", "/pokemon/ゴクリン", "/pokemon/Gulpin" })
	public PokemonData poke316() {
		PokemonData data = new PokemonData();
		data.setId(316);
		data.setName("ゴクリン");
		data.setFeatures("体の　大部分が　胃袋で　できていて　" + "心臓や　脳みそは　とても　小さい。　" + "なんでも　溶かす　特殊な　胃液を　持つ。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/316.png");
		return data;
	}

	@RequestMapping({ "/pokemon/317", "/pokemon/マルノーム", "/pokemon/Swalot" })
	public PokemonData poke317() {
		PokemonData data = new PokemonData();
		data.setId(317);
		data.setName("マルノーム");
		data.setFeatures("歯が　１本も　ないので　なんでも　丸のみ。　" + "いっぱいに　開けた　口は　とても　大きく　" + "自動車の　タイヤだって　すっぽり　入るぞ。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/317.png");
		return data;
	}

	@RequestMapping({ "/pokemon/318", "/pokemon/キバニア", "/pokemon/Carvanha" })
	public PokemonData poke318() {
		PokemonData data = new PokemonData();
		data.setId(318);
		data.setName("キバニア");
		data.setFeatures("テリトリーを　荒らす　ものには　集団で　" + "襲いかかり　とがった　キバで　八つ裂きにする。　" + "１匹に　なると　途端に　弱腰に　なるぞ。");
		data.setType("みず");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/318.png");
		return data;
	}

	@RequestMapping({ "/pokemon/319", "/pokemon/サメハダー", "/pokemon/Sharpedo" })
	public PokemonData poke319() {
		PokemonData data = new PokemonData();
		data.setId(319);
		data.setName("サメハダー");
		data.setFeatures("海水を　お尻の　穴から　吹き出して　" + "時速１２０キロで　泳ぐことが　できる。　" + "長い　距離を　泳げないのが　弱点だ。");
		data.setType("みず");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/319.png");
		return data;
	}

	@RequestMapping({ "/pokemon/320", "/pokemon/ホエルコ", "/pokemon/Wailmer" })
	public PokemonData poke320() {
		PokemonData data = new PokemonData();
		data.setId(320);
		data.setName("ホエルコ");
		data.setFeatures("体に　海水を　ためると　ボールの　ように　" + "地面で　飛び跳ねることが　できるように　なる。　" + "沢山　ためると　高く　ジャンプできる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/320.png");
		return data;
	}

	@RequestMapping({ "/pokemon/321", "/pokemon/ホエルオー", "/pokemon/Wailord" })
	public PokemonData poke321() {
		PokemonData data = new PokemonData();
		data.setId(321);
		data.setName("ホエルオー");
		data.setFeatures("獲物を　追い立てる　ために　水中から　" + "ジャンプして　大きな　水しぶきを　あげる。　" + "群れで　ジャンプする　姿は　大迫力。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/321.png");
		return data;
	}

	@RequestMapping({ "/pokemon/322", "/pokemon/ドンメル", "/pokemon/Numel" })
	public PokemonData poke322() {
		PokemonData data = new PokemonData();
		data.setId(322);
		data.setName("ドンメル");
		data.setFeatures("１２００度の　マグマを　体に　ためている。　" + "水に　ぬれると　マグマが　冷えて　固まり　" + "重たくなるので　動きが　鈍って　しまう。");
		data.setType("ほのお");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/322.png");
		return data;
	}

	@RequestMapping({ "/pokemon/323", "/pokemon/バクーダ", "/pokemon/Camerupt" })
	public PokemonData poke323() {
		PokemonData data = new PokemonData();
		data.setId(323);
		data.setName("バクーダ");
		data.setFeatures("背中の　コブは　骨が　形を　変えたもの。　" + "煮えたぎった　マグマを　時々　噴き上げる。　" + "怒った　ときに　よく　噴火する　らしい。");
		data.setType("ほのお");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/323.png");
		return data;
	}

	@RequestMapping({ "/pokemon/324", "/pokemon/コータス", "/pokemon/Torkoal" })
	public PokemonData poke324() {
		PokemonData data = new PokemonData();
		data.setId(324);
		data.setName("コータス");
		data.setFeatures("甲羅の　中で　石炭を　燃やし　" + "エネルギーに　している。ピンチの　" + "ときは　黒い　ススを　噴き出す。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/324.png");
		return data;
	}

	@RequestMapping({ "/pokemon/325", "/pokemon/バネブー", "/pokemon/Spoink" })
	public PokemonData poke325() {
		PokemonData data = new PokemonData();
		data.setId(325);
		data.setName("バネブー");
		data.setFeatures("頭に　乗せた　真珠が　バネブーの　" + "サイコパワーを　高める　働きをする。　" + "大きな　真珠を　いつも　探している。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/325.png");
		return data;
	}

	@RequestMapping({ "/pokemon/326", "/pokemon/ブーピッグ", "/pokemon/Grumpig" })
	public PokemonData poke326() {
		PokemonData data = new PokemonData();
		data.setId(326);
		data.setName("ブーピッグ");
		data.setFeatures("黒真珠を　利用して　不思議な　力を　" + "使うとき　奇妙な　ステップで　踊りだす。　" + "黒真珠は　美術品の　価値を　持つ。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/326.png");
		return data;
	}

	@RequestMapping({ "/pokemon/327", "/pokemon/パッチール", "/pokemon/Spinda" })
	public PokemonData poke327() {
		PokemonData data = new PokemonData();
		data.setId(327);
		data.setName("パッチール");
		data.setFeatures("同じ　ブチ模様は　ないと　いわれている。　" + "いつも　目を　回している　ような　フラフラした　" + "動きには　敵を　惑わせる　効果が　ある。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/327.png");
		return data;
	}

	@RequestMapping({ "/pokemon/328", "/pokemon/ナックラー", "/pokemon/Trapinch" })
	public PokemonData poke328() {
		PokemonData data = new PokemonData();
		data.setId(328);
		data.setName("ナックラー");
		data.setFeatures("脱出　不可能な　穴を　砂漠に　つくり　" + "獲物が　くるのを　ひたすら　待ち構えている。　" + "水が　なくても　１週間は　へっちゃら。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/328.png");
		return data;
	}

	@RequestMapping({ "/pokemon/329", "/pokemon/ビブラーバ", "/pokemon/Vibrava" })
	public PokemonData poke329() {
		PokemonData data = new PokemonData();
		data.setId(329);
		data.setName("ビブラーバ");
		data.setFeatures("羽を　激しく　振動させて　" + "超音波を　発生。気絶した　獲物を　" + "消化液で　溶かす。");
		data.setType("じめん");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/329.png");
		return data;
	}

	@RequestMapping({ "/pokemon/330", "/pokemon/フライゴン", "/pokemon/Flygon" })
	public PokemonData poke330() {
		PokemonData data = new PokemonData();
		data.setId(330);
		data.setName("フライゴン");
		data.setFeatures("羽ばたきで　起こす　砂嵐の　中から　" + "歌声の　ような　羽音　だけが　聞こえるため　" + "フライゴンは　砂漠の　精霊と　いわれた。");
		data.setType("じめん");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/330.png");
		return data;
	}

	@RequestMapping({ "/pokemon/331", "/pokemon/サボネア", "/pokemon/Cacnea" })
	public PokemonData poke331() {
		PokemonData data = new PokemonData();
		data.setId(331);
		data.setName("サボネア");
		data.setFeatures("雨の　少ない　厳しい　環境　ほど　" + "きれいで　香りの　強い　花を　咲かせる。　" + "トゲの　ついた　腕を　振り回して　戦う。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/331.png");
		return data;
	}

	@RequestMapping({ "/pokemon/332", "/pokemon/ノクタス", "/pokemon/Cacturne" })
	public PokemonData poke332() {
		PokemonData data = new PokemonData();
		data.setId(332);
		data.setName("ノクタス");
		data.setFeatures("真夜中　砂漠を　歩く　旅人の　後ろを　" + "ぞろぞろと　集団で　くっついて　歩く。　" + "疲れて　動けなく　なるのを　待っているのだ。");
		data.setType("くさ");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/332.png");
		return data;
	}

	@RequestMapping({ "/pokemon/333", "/pokemon/チルット", "/pokemon/Swablu" })
	public PokemonData poke333() {
		PokemonData data = new PokemonData();
		data.setId(333);
		data.setName("チルット");
		data.setFeatures("汚れたものを　見ると　綿の　ような　翼で　" + "せっせと　ふき取る　きれい好きな　ポケモンだ。　" + "翼が　汚れると　川で　水浴びを　する。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/333.png");
		return data;
	}

	@RequestMapping({ "/pokemon/334", "/pokemon/チルタリス", "/pokemon/Altaria" })
	public PokemonData poke334() {
		PokemonData data = new PokemonData();
		data.setId(334);
		data.setName("チルタリス");
		data.setFeatures("美しい　ソプラノで　歌う　ポケモン。　" + "綿雲の　ような　翼で　上昇　" + "気流を　受けて　大空へ　舞い上がる。");
		data.setType("ドラゴン");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/334.png");
		return data;
	}

	@RequestMapping({ "/pokemon/335", "/pokemon/ザングース", "/pokemon/Zangoose" })
	public PokemonData poke335() {
		PokemonData data = new PokemonData();
		data.setId(335);
		data.setName("ザングース");
		data.setFeatures("普段は　４本足で　行動するが　怒ると　" + "後足で　立ち　前足の　ツメが　飛び出す。　" + "ハブネークとは　先祖から　続く　ライバルだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/335.png");
		return data;
	}

	@RequestMapping({ "/pokemon/336", "/pokemon/ハブネーク", "/pokemon/Seviper" })
	public PokemonData poke336() {
		PokemonData data = new PokemonData();
		data.setId(336);
		data.setName("ハブネーク");
		data.setFeatures("刀の　ような　尻尾は　敵を　切り裂くのと　" + "同時に　染み出した　猛毒を　浴びせるぞ。　" + "宿敵　ザングースと　戦い　続ける。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/336.png");
		return data;
	}

	@RequestMapping({ "/pokemon/337", "/pokemon/ルナトーン", "/pokemon/Lunatone" })
	public PokemonData poke337() {
		PokemonData data = new PokemonData();
		data.setId(337);
		data.setName("ルナトーン");
		data.setFeatures("満月の　時期　活発になる　習性。　" + "空中に　浮いて　移動し　赤い　瞳は　" + "見たものの　体を　すくませる　迫力。");
		data.setType("いわ");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/337.png");
		return data;
	}

	@RequestMapping({ "/pokemon/338", "/pokemon/ソルロック", "/pokemon/Solrock" })
	public PokemonData poke338() {
		PokemonData data = new PokemonData();
		data.setId(338);
		data.setName("ソルロック");
		data.setFeatures("太陽　光線が　パワーの　源。　" + "相手の　心を　読み取ると　いわれている。　" + "体を　回転させて　高熱を　放つ。");
		data.setType("いわ");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/338.png");
		return data;
	}

	@RequestMapping({ "/pokemon/339", "/pokemon/ドジョッチ", "/pokemon/Barboach" })
	public PokemonData poke339() {
		PokemonData data = new PokemonData();
		data.setId(339);
		data.setName("ドジョッチ");
		data.setFeatures("体が　ヌルヌルの　膜で　覆われているので　" + "敵に　捕まれても　ヌルリと　逃げ出せるのだ。　" + "ヌルヌルが　乾くと　体が　弱ってしまう。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/339.png");
		return data;
	}

	@RequestMapping({ "/pokemon/340", "/pokemon/ナマズン", "/pokemon/Whiscash" })
	public PokemonData poke340() {
		PokemonData data = new PokemonData();
		data.setId(340);
		data.setName("ナマズン");
		data.setFeatures("大暴れ　すると　沼の　周囲　５キロの　" + "範囲で　地震の　ような　揺れが　起こる。　" + "本当の　地震を　予知する　力も　持つ。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/340.png");
		return data;
	}

	@RequestMapping({ "/pokemon/341", "/pokemon/ヘイガニ", "/pokemon/Corphish" })
	public PokemonData poke341() {
		PokemonData data = new PokemonData();
		data.setId(341);
		data.setName("ヘイガニ");
		data.setFeatures("鋭い　ハサミで　獲物を　捕まえる。　" + "好き　嫌いが　ないので　なんでも　食べるぞ。　" + "汚い　水でも　へっちゃらな　ポケモン。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/341.png");
		return data;
	}

	@RequestMapping({ "/pokemon/342", "/pokemon/シザリガー", "/pokemon/Crawdaunt" })
	public PokemonData poke342() {
		PokemonData data = new PokemonData();
		data.setId(342);
		data.setName("シザリガー");
		data.setFeatures("脱皮した　直後は　甲羅が　柔らかい。　" + "甲羅が　硬くなるまで　敵の　攻撃を　" + "避けるため　川底の　穴に　隠れている。");
		data.setType("みず");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/342.png");
		return data;
	}

	@RequestMapping({ "/pokemon/343", "/pokemon/ヤジロン", "/pokemon/Baltoy" })
	public PokemonData poke343() {
		PokemonData data = new PokemonData();
		data.setId(343);
		data.setName("ヤジロン");
		data.setFeatures("仲間を　見つけると　すぐに　集まって　きて　" + "一斉に　鳴き声を　あげるので　うるさい。　" + "一本足で　器用に　立ったまま　眠る。");
		data.setType("じめん");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/343.png");
		return data;
	}

	@RequestMapping({ "/pokemon/344", "/pokemon/ネンドール", "/pokemon/Claydol" })
	public PokemonData poke344() {
		PokemonData data = new PokemonData();
		data.setId(344);
		data.setName("ネンドール");
		data.setFeatures("２万年前に　栄えた　古代　文明の　" + "泥人形から　生まれた　ナゾの　ポケモン。　" + "両手から　ビームを　発射するぞ。");
		data.setType("じめん");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/344.png");
		return data;
	}

	@RequestMapping({ "/pokemon/345", "/pokemon/リリーラ", "/pokemon/Lileep" })
	public PokemonData poke345() {
		PokemonData data = new PokemonData();
		data.setId(345);
		data.setName("リリーラ");
		data.setFeatures("化石から　再生した　古代の　ポケモン。　" + "岩に　くっつき　歩く　ことが　できない。　" + "２つの　目で　じっと　獲物を　探している。");
		data.setType("いわ");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/345.png");
		return data;
	}

	@RequestMapping({ "/pokemon/346", "/pokemon/ユレイドル", "/pokemon/Cradily" })
	public PokemonData poke346() {
		PokemonData data = new PokemonData();
		data.setId(346);
		data.setName("ユレイドル");
		data.setFeatures("体が　錘替わりに　なっているので　" + "海が　荒れても　流される　ことは　ない。　" + "触手から　強い　消化液を　出す。");
		data.setType("いわ");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/346.png");
		return data;
	}

	@RequestMapping({ "/pokemon/347", "/pokemon/アノプス", "/pokemon/Anorith" })
	public PokemonData poke347() {
		PokemonData data = new PokemonData();
		data.setId(347);
		data.setName("アノプス");
		data.setFeatures("ポケモンの　先祖の　一種と　いわれている。　" + "体の　横に　ついた　８枚の　羽を　" + "くねらせて　太古の　海を　泳いでいた。");
		data.setType("いわ");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/347.png");
		return data;
	}

	@RequestMapping({ "/pokemon/348", "/pokemon/アーマルド", "/pokemon/Armaldo" })
	public PokemonData poke348() {
		PokemonData data = new PokemonData();
		data.setId(348);
		data.setName("アーマルド");
		data.setFeatures("大昔　絶滅した　ポケモンの　一種。　" + "地上で　暮らすとき　便利な　ように　" + "２本の　足で　歩くように　なったと　いう。");
		data.setType("いわ");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/348.png");
		return data;
	}

	@RequestMapping({ "/pokemon/349", "/pokemon/ヒンバス", "/pokemon/Feebas" })
	public PokemonData poke349() {
		PokemonData data = new PokemonData();
		data.setId(349);
		data.setName("ヒンバス");
		data.setFeatures("体は　ボロボロだが　どこでも　生きていける　" + "しぶとい　生命力を　持つ　ポケモン。　" + "しかし　ノロマなので　すぐに　捕まってしまう。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/349.png");
		return data;
	}

	@RequestMapping({ "/pokemon/350", "/pokemon/ミロカロス", "/pokemon/Milotic" })
	public PokemonData poke350() {
		PokemonData data = new PokemonData();
		data.setId(350);
		data.setName("ミロカロス");
		data.setFeatures("最も　美しい　ポケモンとも　" + "呼ばれ　多くの　芸術家に　" + "インスピレーションを　与えてきた。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/350.png");
		return data;
	}

	@RequestMapping({ "/pokemon/351", "/pokemon/ポワルン", "/pokemon/Castform" })
	public PokemonData poke351() {
		PokemonData data = new PokemonData();
		data.setId(351);
		data.setName("ポワルン");
		data.setFeatures("自然の　力を　受けて　太陽　雨水　" + "雪雲に　姿を　変える　ポケモン。　" + "気象が　変わると　気性も　変わるぞ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/351.png");
		return data;
	}

	@RequestMapping({ "/pokemon/352", "/pokemon/カクレオン", "/pokemon/Kecleon" })
	public PokemonData poke352() {
		PokemonData data = new PokemonData();
		data.setId(352);
		data.setName("カクレオン");
		data.setFeatures("体を　景色と　同じ　色に　変えて　" + "獲物に　気づかれない　ように　忍びよる。　" + "長く　伸びる　ベロで　素早く　捕まえる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/352.png");
		return data;
	}

	@RequestMapping({ "/pokemon/353", "/pokemon/カゲボウズ", "/pokemon/Shuppet" })
	public PokemonData poke353() {
		PokemonData data = new PokemonData();
		data.setId(353);
		data.setName("カゲボウズ");
		data.setFeatures("人の　心に　ある　うらみや　ねたみ　などの　" + "感情を　食べて　成長する　ポケモン。　" + "恨む　心を　探して　街を　さまよう。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/353.png");
		return data;
	}

	@RequestMapping({ "/pokemon/354", "/pokemon/ジュペッタ", "/pokemon/Banette" })
	public PokemonData poke354() {
		PokemonData data = new PokemonData();
		data.setId(354);
		data.setName("ジュペッタ");
		data.setFeatures("捨てられた　ぬいぐるみの　綿に　のろいの　" + "エネルギーが　染み込んで　ポケモンに　なった。　" + "口を　開けると　エネルギーが　逃げてしまう。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/354.png");
		return data;
	}

	@RequestMapping({ "/pokemon/355", "/pokemon/ヨマワル", "/pokemon/Duskull" })
	public PokemonData poke355() {
		PokemonData data = new PokemonData();
		data.setId(355);
		data.setName("ヨマワル");
		data.setFeatures("真夜中　闇に　紛れて　さまよっている。　" + "ママに　しかられるような　悪い子は　ヨマワルに　" + "さらわれるという　言い伝えが　残っている。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/355.png");
		return data;
	}

	@RequestMapping({ "/pokemon/356", "/pokemon/サマヨール", "/pokemon/Dusclops" })
	public PokemonData poke356() {
		PokemonData data = new PokemonData();
		data.setId(356);
		data.setName("サマヨール");
		data.setFeatures("どんな　大きさの　ものも　吸いこんで　しまう。　" + "怪しげな　手の　動きと　一つ目の　力で　" + "相手を　催眠　状態にして　操る。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/356.png");
		return data;
	}

	@RequestMapping({ "/pokemon/357", "/pokemon/トロピウス", "/pokemon/Tropius" })
	public PokemonData poke357() {
		PokemonData data = new PokemonData();
		data.setId(357);
		data.setName("トロピウス");
		data.setFeatures("南国の　子どもたちは　トロピウスの　首に　" + "なった　果物の　フサを　おやつに　食べるよ。　" + "背中の　葉っぱを　羽ばたかせて　空を　飛ぶ。");
		data.setType("くさ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/357.png");
		return data;
	}

	@RequestMapping({ "/pokemon/358", "/pokemon/チリーン", "/pokemon/Chimecho" })
	public PokemonData poke358() {
		PokemonData data = new PokemonData();
		data.setId(358);
		data.setName("チリーン");
		data.setFeatures("風が　強くなると　木の　枝や　軒下に　" + "頭の　吸盤で　ぶら下がり　鳴き出す。　" + "長い　シッポで　きのみを　つまんで　食べる。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/358.png");
		return data;
	}

	@RequestMapping({ "/pokemon/359", "/pokemon/アブソル", "/pokemon/Absol" })
	public PokemonData poke359() {
		PokemonData data = new PokemonData();
		data.setId(359);
		data.setName("アブソル");
		data.setFeatures("自然災害を　キャッチする　力を　持つ。　" + "険しい　山岳地帯に　生息し　" + "滅多に　山の　ふもとには　降りてこない。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/359.png");
		return data;
	}

	@RequestMapping({ "/pokemon/360", "/pokemon/ソーナノ", "/pokemon/Wynaut" })
	public PokemonData poke360() {
		PokemonData data = new PokemonData();
		data.setId(360);
		data.setName("ソーナノ");
		data.setFeatures("月の夜　仲間たちと　おしくらまんじゅう。　" + "ぎゅうぎゅう　押されて　我慢強くなる。　" + "強烈な　カウンターを　繰り出す　訓練。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/360.png");
		return data;
	}

	@RequestMapping({ "/pokemon/361", "/pokemon/ユキワラシ", "/pokemon/Snorunt" })
	public PokemonData poke361() {
		PokemonData data = new PokemonData();
		data.setId(361);
		data.setName("ユキワラシ");
		data.setFeatures("雪や　氷だけを　食べて　暮らしている。　" + "ユキワラシの　訪れた　家は　代々　" + "栄えるという　言い伝えが　残っている。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/361.png");
		return data;
	}

	@RequestMapping({ "/pokemon/362", "/pokemon/オニゴーリ", "/pokemon/Glalie" })
	public PokemonData poke362() {
		PokemonData data = new PokemonData();
		data.setId(362);
		data.setName("オニゴーリ");
		data.setFeatures("氷を　自在に　扱う　力を　持つ。　" + "獲物を　一瞬で　凍らせて　動けなく　" + "なった　ところを　美味しく　頂くのだ。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/362.png");
		return data;
	}

	@RequestMapping({ "/pokemon/363", "/pokemon/タマザラシ", "/pokemon/Spheal" })
	public PokemonData poke363() {
		PokemonData data = new PokemonData();
		data.setId(363);
		data.setName("タマザラシ");
		data.setFeatures("いつも　転がって　移動する　ポケモンだ。　" + "流氷の　季節に　氷の　上を　" + "転がり　海を　渡る　姿を　見かける。");
		data.setType("こおり");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/363.png");
		return data;
	}

	@RequestMapping({ "/pokemon/364", "/pokemon/トドグラー", "/pokemon/Sealeo" })
	public PokemonData poke364() {
		PokemonData data = new PokemonData();
		data.setId(364);
		data.setName("トドグラー");
		data.setFeatures("しょっちゅう　鼻で　なにかを　回している。　" + "回しながら　臭いや　感触を　確かめて　" + "好きな　ものと　嫌いな　ものを　分けるのだ。");
		data.setType("こおり");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/364.png");
		return data;
	}

	@RequestMapping({ "/pokemon/365", "/pokemon/トドゼルガ", "/pokemon/Walrein" })
	public PokemonData poke365() {
		PokemonData data = new PokemonData();
		data.setId(365);
		data.setName("トドゼルガ");
		data.setFeatures("大きな　キバで　氷山を　砕きながら　" + "氷点下の　海を　泳ぎ回る。　" + "ぶ厚い　脂肪が　攻撃を　跳ね返す。");
		data.setType("こおり");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/365.png");
		return data;
	}

	@RequestMapping({ "/pokemon/366", "/pokemon/パールル", "/pokemon/Clamperl" })
	public PokemonData poke366() {
		PokemonData data = new PokemonData();
		data.setId(366);
		data.setName("パールル");
		data.setFeatures("硬い　貝殻に　守られて　成長する。　" + "本体が　カラに　収まり　切らなくなると　" + "進化の　瞬間が　近づいた　証拠。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/366.png");
		return data;
	}

	@RequestMapping({ "/pokemon/367", "/pokemon/ハンテール", "/pokemon/Huntail" })
	public PokemonData poke367() {
		PokemonData data = new PokemonData();
		data.setId(367);
		data.setName("ハンテール");
		data.setFeatures("魚の　形をした　シッポで　おびき寄せ　" + "大きな　口で　エサを　丸のみ　する。　" + "ヘビのように　体を　くねらせて　泳ぐ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/367.png");
		return data;
	}

	@RequestMapping({ "/pokemon/368", "/pokemon/サクラビス", "/pokemon/Gorebyss" })
	public PokemonData poke368() {
		PokemonData data = new PokemonData();
		data.setId(368);
		data.setName("サクラビス");
		data.setFeatures("泳ぐ　姿は　優雅で　とても　きれいだが　" + "獲物を　見つけると　細い　口を　体に　" + "刺し込んで　体液を　ずるずる　すするぞ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/368.png");
		return data;
	}

	@RequestMapping({ "/pokemon/369", "/pokemon/ジーランス", "/pokemon/Relicanth" })
	public PokemonData poke369() {
		PokemonData data = new PokemonData();
		data.setId(369);
		data.setName("ジーランス");
		data.setFeatures("深海　調査で　発見された　珍種。　" + "ごつごつした　岩の　ような　うろこで　覆われ　" + "海底の　水圧に　耐える　体を　持つ。");
		data.setType("みず");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/369.png");
		return data;
	}

	@RequestMapping({ "/pokemon/370", "/pokemon/ラブカス", "/pokemon/Luvdisc" })
	public PokemonData poke370() {
		PokemonData data = new PokemonData();
		data.setId(370);
		data.setName("ラブカス");
		data.setFeatures("ハート型の　体は　愛情の　シンボル。　" + "ラブカスに　出会った　カップルは　永遠の　" + "愛が　約束されると　いわれているよ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/370.png");
		return data;
	}

	@RequestMapping({ "/pokemon/371", "/pokemon/タツベイ", "/pokemon/Bagon" })
	public PokemonData poke371() {
		PokemonData data = new PokemonData();
		data.setId(371);
		data.setName("タツベイ");
		data.setFeatures("大空を　飛ぶことを　夢見ている　ポケモン。　" + "飛べない　悔しさを　晴らす　ように　大岩に　" + "石頭を　打ちつけては　コナゴナに　砕く。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/371.png");
		return data;
	}

	@RequestMapping({ "/pokemon/372", "/pokemon/コモルー", "/pokemon/Shelgon" })
	public PokemonData poke372() {
		PokemonData data = new PokemonData();
		data.setId(372);
		data.setName("コモルー");
		data.setFeatures("体を　覆っているのは　ホネのような　もの。　" + "とても　硬く　敵の　攻撃を　跳ね返す。　" + "洞穴で　身を　潜め　進化を　待っている。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/372.png");
		return data;
	}

	@RequestMapping({ "/pokemon/373", "/pokemon/ボーマンダ", "/pokemon/Salamence" })
	public PokemonData poke373() {
		PokemonData data = new PokemonData();
		data.setId(373);
		data.setName("ボーマンダ");
		data.setFeatures("夢にまで　見た　翼が　やっと　生えてきた。　" + "うれしい　気持ちを　現すため　大空を　" + "飛び回り　炎を　吐いて　喜んでいる。");
		data.setType("ドラゴン");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/373.png");
		return data;
	}

	@RequestMapping({ "/pokemon/374", "/pokemon/ダンバル", "/pokemon/Beldum" })
	public PokemonData poke374() {
		PokemonData data = new PokemonData();
		data.setId(374);
		data.setName("ダンバル");
		data.setFeatures("体から　出ている　磁力と　地球の　" + "磁力を　反発させて　宙に　浮かぶ。　" + "お尻の　ツメを　崖に　食い込ませて　眠る。");
		data.setType("はがね");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/374.png");
		return data;
	}

	@RequestMapping({ "/pokemon/375", "/pokemon/メタング", "/pokemon/Metang" })
	public PokemonData poke375() {
		PokemonData data = new PokemonData();
		data.setId(375);
		data.setName("メタング");
		data.setFeatures("２匹の　ダンバルが　合体したとき　２つの　" + "脳が　磁力の　神経で　結ばれる。　" + "腕を　後ろへ　まわし　高速で　移動。");
		data.setType("はがね");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/375.png");
		return data;
	}

	@RequestMapping({ "/pokemon/376", "/pokemon/メタグロス", "/pokemon/Metagross" })
	public PokemonData poke376() {
		PokemonData data = new PokemonData();
		data.setId(376);
		data.setName("メタグロス");
		data.setFeatures("２匹の　メタングが　合体した　姿。　" + "巨体で　獲物を　抑えつけながら　" + "お腹に　ある　大きな　口で　食べるのだ。");
		data.setType("はがね");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/376.png");
		return data;
	}

	@RequestMapping({ "/pokemon/377", "/pokemon/レジロック", "/pokemon/Regirock" })
	public PokemonData poke377() {
		PokemonData data = new PokemonData();
		data.setId(377);
		data.setName("レジロック");
		data.setFeatures("体を　つくっている　岩石は　すべて　" + "違う　土地から　掘り出された　ものであると　" + "最近の　研究で　判明した。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/377.png");
		return data;
	}

	@RequestMapping({ "/pokemon/378", "/pokemon/レジアイス", "/pokemon/Regice" })
	public PokemonData poke378() {
		PokemonData data = new PokemonData();
		data.setId(378);
		data.setName("レジアイス");
		data.setFeatures("マイナス２００度の　冷気が　体を　包む。　" + "近づいた　だけでも　凍りついて　しまうぞ。　" + "マグマでも　溶けない　氷の　体を　持つ。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/378.png");
		return data;
	}

	@RequestMapping({ "/pokemon/379", "/pokemon/レジスチル", "/pokemon/Registeel" })
	public PokemonData poke379() {
		PokemonData data = new PokemonData();
		data.setId(379);
		data.setName("レジスチル");
		data.setFeatures("昔　人によって　封印された　ポケモン。　" + "体を　つくる　金属は　地球上に　" + "存在しない　物質と　考えられている。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/379.png");
		return data;
	}

	@RequestMapping({ "/pokemon/380", "/pokemon/ラティアス", "/pokemon/Latias" })
	public PokemonData poke380() {
		PokemonData data = new PokemonData();
		data.setId(380);
		data.setName("ラティアス");
		data.setFeatures("知能が　高く　人の　言葉を　理解する。　" + "ガラスの　ような　羽毛で　体を　包み込み　" + "光を　屈折させて　姿を　変える。");
		data.setType("ドラゴン");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/380.png");
		return data;
	}

	@RequestMapping({ "/pokemon/381", "/pokemon/ラティオス", "/pokemon/Latios" })
	public PokemonData poke381() {
		PokemonData data = new PokemonData();
		data.setId(381);
		data.setName("ラティオス");
		data.setFeatures("優しい　心の　持ち主にしか　なつかない。　" + "腕を　折り畳むと　空気抵抗が　減って　" + "ジェット機　よりも　速く　空を　飛べるぞ。");
		data.setType("ドラゴン");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/381.png");
		return data;
	}

	@RequestMapping({ "/pokemon/382", "/pokemon/カイオーガ", "/pokemon/Kyogre" })
	public PokemonData poke382() {
		PokemonData data = new PokemonData();
		data.setId(382);
		data.setName("カイオーガ");
		data.setFeatures("海の　化身　と伝わる　ポケモン。　" + "自然のエネルギーを　求めて　グラードンと　" + "争いを　繰り返したという　伝説が　ある。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/382.png");
		return data;
	}

	@RequestMapping({ "/pokemon/383", "/pokemon/グラードン", "/pokemon/Groudon" })
	public PokemonData poke383() {
		PokemonData data = new PokemonData();
		data.setId(383);
		data.setName("グラードン");
		data.setFeatures("自然のエネルギーに　よって　ゲンシカイキし　" + "本来の　姿を　取り戻す。その力は　" + "マグマを　生みだし　大地を　広げる。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/383.png");
		return data;
	}

	@RequestMapping({ "/pokemon/384", "/pokemon/レックウザ", "/pokemon/Rayquaza" })
	public PokemonData poke384() {
		PokemonData data = new PokemonData();
		data.setId(384);
		data.setName("レックウザ");
		data.setFeatures("オゾン層を　飛び続け　エサとなる　" + "隕石を　くらう。体内に　たまった　" + "隕石の　エネルギーで　メガシンカする。");
		data.setType("ドラゴン");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/384.png");
		return data;
	}

	@RequestMapping({ "/pokemon/385", "/pokemon/ジラーチ", "/pokemon/Jirachi" })
	public PokemonData poke385() {
		PokemonData data = new PokemonData();
		data.setId(385);
		data.setName("ジラーチ");
		data.setFeatures("清らかな　声で　歌を　聞かせて　あげると　" + "１０００年の　眠りから　目を　覚ます。　" + "人の　願いを　なんでも　かなえると　いう。");
		data.setType("はがね");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/385.png");
		return data;
	}

	@RequestMapping({ "/pokemon/386", "/pokemon/デオキシス", "/pokemon/Deoxys" })
	public PokemonData poke386() {
		PokemonData data = new PokemonData();
		data.setId(386);
		data.setName("デオキシス");
		data.setFeatures("宇宙ウィルスから　誕生した　ポケモン。　" + "知能が　高く　超能力を　操る。　" + "胸の　水晶体から　レーザーを　出す。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/386.png");
		return data;
	}

	@RequestMapping({ "/pokemon/387", "/pokemon/ナエトル", "/pokemon/Turtwig" })
	public PokemonData poke387() {
		PokemonData data = new PokemonData();
		data.setId(387);
		data.setName("ナエトル");
		data.setFeatures("全身で　光合成を　して　" + "酸素を　作る。のどが　渇くと　" + "頭の　葉っぱが　しおれてしまう。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/387.png");
		return data;
	}

	@RequestMapping({ "/pokemon/388", "/pokemon/ハヤシガメ", "/pokemon/Grotle" })
	public PokemonData poke388() {
		PokemonData data = new PokemonData();
		data.setId(388);
		data.setName("ハヤシガメ");
		data.setFeatures("きれいな　水が　わき出る　場所を　" + "知っていて　仲間の　ポケモンを　" + "背中に　乗せて　そこまで　運ぶ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/388.png");
		return data;
	}

	@RequestMapping({ "/pokemon/389", "/pokemon/ドダイトス", "/pokemon/Torterra" })
	public PokemonData poke389() {
		PokemonData data = new PokemonData();
		data.setId(389);
		data.setName("ドダイトス");
		data.setFeatures("小さな　ポケモンたちが　集まり　" + "動かない　ドダイトスの　背中で　" + "巣作りを　はじめることがある。");
		data.setType("くさ");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/389.png");
		return data;
	}

	@RequestMapping({ "/pokemon/390", "/pokemon/ヒコザル", "/pokemon/Chimchar" })
	public PokemonData poke390() {
		PokemonData data = new PokemonData();
		data.setId(390);
		data.setName("ヒコザル");
		data.setFeatures("お腹で　作られた　ガスが　" + "お尻で　燃えている。体調が　悪いと　" + "炎が　弱くなる。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/390.png");
		return data;
	}

	@RequestMapping({ "/pokemon/391", "/pokemon/モウカザル", "/pokemon/Monferno" })
	public PokemonData poke391() {
		PokemonData data = new PokemonData();
		data.setId(391);
		data.setName("モウカザル");
		data.setFeatures("天井や　壁を　利用して　" + "空中殺法を　繰り出す。　" + "尻尾の　炎も　武器の　ひとつ。");
		data.setType("ほのお");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/391.png");
		return data;
	}

	@RequestMapping({ "/pokemon/392", "/pokemon/ゴウカザル", "/pokemon/Infernape" })
	public PokemonData poke392() {
		PokemonData data = new PokemonData();
		data.setId(392);
		data.setName("ゴウカザル");
		data.setFeatures("素早さで　相手を　翻弄する。　" + "両手　両足を　使った　" + "独特の　戦い方を　する。");
		data.setType("ほのお");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/392.png");
		return data;
	}

	@RequestMapping({ "/pokemon/393", "/pokemon/ポッチャマ", "/pokemon/Piplup" })
	public PokemonData poke393() {
		PokemonData data = new PokemonData();
		data.setId(393);
		data.setName("ポッチャマ");
		data.setFeatures("プライドが　高く　人から　" + "食べ物を　もらう　ことを　嫌う。　" + "長い　産毛が　寒さを　防ぐ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/393.png");
		return data;
	}

	@RequestMapping({ "/pokemon/394", "/pokemon/ポッタイシ", "/pokemon/Prinplup" })
	public PokemonData poke394() {
		PokemonData data = new PokemonData();
		data.setId(394);
		data.setName("ポッタイシ");
		data.setFeatures("仲間を　作らずに　暮らす。　" + "翼の　強烈な　一撃は　" + "大木を　真っ二つに　へし折る。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/394.png");
		return data;
	}

	@RequestMapping({ "/pokemon/395", "/pokemon/エンペルト", "/pokemon/Empoleon" })
	public PokemonData poke395() {
		PokemonData data = new PokemonData();
		data.setId(395);
		data.setName("エンペルト");
		data.setFeatures("クチバシから　伸びている　３本の　" + "ツノは　強さの　象徴。　" + "リーダーが　一番　大きい。");
		data.setType("みず");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/395.png");
		return data;
	}

	@RequestMapping({ "/pokemon/396", "/pokemon/ムックル", "/pokemon/Starly" })
	public PokemonData poke396() {
		PokemonData data = new PokemonData();
		data.setId(396);
		data.setName("ムックル");
		data.setFeatures("むしポケモンを　ねらって　野山を　" + "大勢の　群れで　飛び回る。　" + "鳴き声が　とても　やかましい。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/396.png");
		return data;
	}

	@RequestMapping({ "/pokemon/397", "/pokemon/ムクバード", "/pokemon/Staravia" })
	public PokemonData poke397() {
		PokemonData data = new PokemonData();
		data.setId(397);
		data.setName("ムクバード");
		data.setFeatures("森や　草原に　生息。　" + "グループが　出くわすと　なわばりを　" + "かけた　争いが　はじまる。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/397.png");
		return data;
	}

	@RequestMapping({ "/pokemon/398", "/pokemon/ムクホーク", "/pokemon/Staraptor" })
	public PokemonData poke398() {
		PokemonData data = new PokemonData();
		data.setId(398);
		data.setName("ムクホーク");
		data.setFeatures("ムクホークに　なると　群れから　" + "離れて　１匹で　生きていく。　" + "強靭な　翼を　持っている。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/398.png");
		return data;
	}

	@RequestMapping({ "/pokemon/399", "/pokemon/ビッパ", "/pokemon/Bidoof" })
	public PokemonData poke399() {
		PokemonData data = new PokemonData();
		data.setId(399);
		data.setName("ビッパ");
		data.setFeatures("いつも　大木や　石を　かじって　" + "丈夫な　前歯を　削っている。　" + "水辺に　巣を　作り　暮らす。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/399.png");
		return data;
	}

	@RequestMapping({ "/pokemon/400", "/pokemon/ビーダル", "/pokemon/Bibarel" })
	public PokemonData poke400() {
		PokemonData data = new PokemonData();
		data.setId(400);
		data.setName("ビーダル");
		data.setFeatures("川を　木の幹や　泥の　ダムで　" + "せき止めて　住処を　作る。　" + "働き者として　知られている。");
		data.setType("ノーマル");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/400.png");
		return data;
	}

	@RequestMapping({ "/pokemon/401", "/pokemon/コロボーシ", "/pokemon/Kricketot" })
	public PokemonData poke401() {
		PokemonData data = new PokemonData();
		data.setId(401);
		data.setName("コロボーシ");
		data.setFeatures("触覚　同士が　ぶつかると　" + "コロン　コロンと　木琴に　似た　" + "音色を　奏でる。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/401.png");
		return data;
	}

	@RequestMapping({ "/pokemon/402", "/pokemon/コロトック", "/pokemon/Kricketune" })
	public PokemonData poke402() {
		PokemonData data = new PokemonData();
		data.setId(402);
		data.setName("コロトック");
		data.setFeatures("感情を　メロディで　表す。　" + "メロディの　法則性を　" + "学者たちが　研究している。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/402.png");
		return data;
	}

	@RequestMapping({ "/pokemon/403", "/pokemon/コリンク", "/pokemon/Shinx" })
	public PokemonData poke403() {
		PokemonData data = new PokemonData();
		data.setId(403);
		data.setName("コリンク");
		data.setFeatures("危険を　感じると　全身の　" + "体毛が　光る。相手が　目を　" + "くらませている　あいだに　逃げる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/403.png");
		return data;
	}

	@RequestMapping({ "/pokemon/404", "/pokemon/ルクシオ", "/pokemon/Luxio" })
	public PokemonData poke404() {
		PokemonData data = new PokemonData();
		data.setId(404);
		data.setName("ルクシオ");
		data.setFeatures("１発で　気絶させるほどの　電流を　" + "ツメから　流す。　" + "数匹の　グループで　暮らす。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/404.png");
		return data;
	}

	@RequestMapping({ "/pokemon/405", "/pokemon/レントラー", "/pokemon/Luxray" })
	public PokemonData poke405() {
		PokemonData data = new PokemonData();
		data.setId(405);
		data.setName("レントラー");
		data.setFeatures("レントラーの　透視能力は　" + "危険な　ものを　発見するとき　" + "とても　役に立つのだ。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/405.png");
		return data;
	}

	@RequestMapping({ "/pokemon/406", "/pokemon/スボミー", "/pokemon/Budew" })
	public PokemonData poke406() {
		PokemonData data = new PokemonData();
		data.setId(406);
		data.setName("スボミー");
		data.setFeatures("冬の　間は　つぼみを　閉ざして　" + "寒さに　耐える。春になると　" + "つぼみを　開き　花粉を　飛ばす。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/406.png");
		return data;
	}

	@RequestMapping({ "/pokemon/407", "/pokemon/ロズレイド", "/pokemon/Roserade" })
	public PokemonData poke407() {
		PokemonData data = new PokemonData();
		data.setId(407);
		data.setName("ロズレイド");
		data.setFeatures("ダンサーのような　身のこなしで　" + "毒の　トゲが　びっしりと　並んだ　" + "ムチを　操り　攻撃する。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/407.png");
		return data;
	}

	@RequestMapping({ "/pokemon/408", "/pokemon/ズガイドス", "/pokemon/Cranidos" })
	public PokemonData poke408() {
		PokemonData data = new PokemonData();
		data.setId(408);
		data.setName("ズガイドス");
		data.setFeatures("およそ　１億年前の　ポケモン。　" + "ジャングルで　生まれ育ち　邪魔な　" + "樹木は　頭突きで　へしおった。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/408.png");
		return data;
	}

	@RequestMapping({ "/pokemon/409", "/pokemon/ラムパルド", "/pokemon/Rampardos" })
	public PokemonData poke409() {
		PokemonData data = new PokemonData();
		data.setId(409);
		data.setName("ラムパルド");
		data.setFeatures("鉄のように　硬い　頭蓋骨。　" + "ジャングルの　木々を　なぎ倒し　" + "獲物を　捕らえる　暴れん坊。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/409.png");
		return data;
	}

	@RequestMapping({ "/pokemon/410", "/pokemon/タテトプス", "/pokemon/Shieldon" })
	public PokemonData poke410() {
		PokemonData data = new PokemonData();
		data.setId(410);
		data.setName("タテトプス");
		data.setFeatures("１億年前の　地層から　" + "掘り出された　化石から　生まれた。　" + "とても　頑丈な　顔を　持つ。");
		data.setType("いわ");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/410.png");
		return data;
	}

	@RequestMapping({ "/pokemon/411", "/pokemon/トリデプス", "/pokemon/Bastiodon" })
	public PokemonData poke411() {
		PokemonData data = new PokemonData();
		data.setId(411);
		data.setName("トリデプス");
		data.setFeatures("正面からの　攻撃は　" + "すべて　跳ね返す。草や　木の実を　" + "食べる　おとなしい　性格。");
		data.setType("いわ");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/411.png");
		return data;
	}

	@RequestMapping({ "/pokemon/412", "/pokemon/ミノムッチ", "/pokemon/Burmy" })
	public PokemonData poke412() {
		PokemonData data = new PokemonData();
		data.setId(412);
		data.setName("ミノムッチ");
		data.setFeatures("戦いで　ミノが　壊れてしまうと　" + "近くにある　材料で　" + "ミノを　すぐに　作り直す。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/412.png");
		return data;
	}

	@RequestMapping({ "/pokemon/413", "/pokemon/ミノマダム", "/pokemon/Wormadam" })
	public PokemonData poke413() {
		PokemonData data = new PokemonData();
		data.setId(413);
		data.setName("ミノマダム");
		data.setFeatures("ミノムッチから　進化したとき　" + "ミノが　体の　一部に　なった。　" + "一生　ミノを　脱ぐことはない。");
		data.setType("むし");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/413.png");
		return data;
	}

	@RequestMapping({ "/pokemon/414", "/pokemon/ガーメイル", "/pokemon/Mothim" })
	public PokemonData poke414() {
		PokemonData data = new PokemonData();
		data.setId(414);
		data.setName("ガーメイル");
		data.setFeatures("夜中　活発に　飛び回り　" + "眠っている　ミツハニーの　巣から　" + "ミツを　奪って　逃げる。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/414.png");
		return data;
	}

	@RequestMapping({ "/pokemon/415", "/pokemon/ミツハニー", "/pokemon/Combee" })
	public PokemonData poke415() {
		PokemonData data = new PokemonData();
		data.setId(415);
		data.setName("ミツハニー");
		data.setFeatures("集めた　ミツを　住処に　運ぶ。　" + "夜には　たくさんの　ミツハニーが　" + "重なって　ハチの巣になり　眠る。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/415.png");
		return data;
	}

	@RequestMapping({ "/pokemon/416", "/pokemon/ビークイン", "/pokemon/Vespiquen" })
	public PokemonData poke416() {
		PokemonData data = new PokemonData();
		data.setId(416);
		data.setName("ビークイン");
		data.setFeatures("胴体が　子供たちの　巣穴に　" + "なっている。ミツハニーの　集めた　" + "ミツで　子供たちを　育てる。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/416.png");
		return data;
	}

	@RequestMapping({ "/pokemon/417", "/pokemon/パチリス", "/pokemon/Pachirisu" })
	public PokemonData poke417() {
		PokemonData data = new PokemonData();
		data.setId(417);
		data.setName("パチリス");
		data.setFeatures("たまった　電気を　分け与えようと　" + "ほほ袋を　こすり合わせる　" + "パチリスを　見かけることも　ある。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/417.png");
		return data;
	}

	@RequestMapping({ "/pokemon/418", "/pokemon/ブイゼル", "/pokemon/Buizel" })
	public PokemonData poke418() {
		PokemonData data = new PokemonData();
		data.setId(418);
		data.setName("ブイゼル");
		data.setFeatures("首の　浮き袋を　ふくらませ　" + "水面から　顔を　だして　" + "辺りの　様子を　うかがっている。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/418.png");
		return data;
	}

	@RequestMapping({ "/pokemon/419", "/pokemon/フローゼル", "/pokemon/Floatzel" })
	public PokemonData poke419() {
		PokemonData data = new PokemonData();
		data.setId(419);
		data.setName("フローゼル");
		data.setFeatures("水中の　獲物を　追いかける　うちに　" + "浮き袋が　発達した。　" + "ゴムボートのように　人を　乗せる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/419.png");
		return data;
	}

	@RequestMapping({ "/pokemon/420", "/pokemon/チェリンボ", "/pokemon/Cherubi" })
	public PokemonData poke420() {
		PokemonData data = new PokemonData();
		data.setId(420);
		data.setName("チェリンボ");
		data.setFeatures("日の光で　赤く　色づく。　" + "栄養分が　吸われて　小さい　玉が　" + "しぼむと　進化が　近い。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/420.png");
		return data;
	}

	@RequestMapping({ "/pokemon/421", "/pokemon/チェリム", "/pokemon/Cherrim" })
	public PokemonData poke421() {
		PokemonData data = new PokemonData();
		data.setId(421);
		data.setName("チェリム");
		data.setFeatures("強い　日差しを　感じとると　" + "閉ざしていた　花びらを　広げ　" + "全身で　日光を　浴びる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/421.png");
		return data;
	}

	@RequestMapping({ "/pokemon/422", "/pokemon/カラナクシ", "/pokemon/Shellos" })
	public PokemonData poke422() {
		PokemonData data = new PokemonData();
		data.setId(422);
		data.setName("カラナクシ");
		data.setFeatures("住む　場所の　環境に　よって　" + "体の　形や　色が　" + "変化しやすい　ポケモンだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/422.png");
		return data;
	}

	@RequestMapping({ "/pokemon/423", "/pokemon/トリトドン", "/pokemon/Gastrodon" })
	public PokemonData poke423() {
		PokemonData data = new PokemonData();
		data.setId(423);
		data.setName("トリトドン");
		data.setFeatures("大昔は　丈夫な　殻で　" + "体を　守っていたらしい。　" + "海の　浅瀬に　生息する。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/423.png");
		return data;
	}

	@RequestMapping({ "/pokemon/424", "/pokemon/エテボース", "/pokemon/Ambipom" })
	public PokemonData poke424() {
		PokemonData data = new PokemonData();
		data.setId(424);
		data.setName("エテボース");
		data.setFeatures("２本の　尻尾で　木の実の　殻を　" + "器用に　むいて　食べる。本物の　" + "腕は　ほとんど　使わなくなった。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/424.png");
		return data;
	}

	@RequestMapping({ "/pokemon/425", "/pokemon/フワンテ", "/pokemon/Drifloon" })
	public PokemonData poke425() {
		PokemonData data = new PokemonData();
		data.setId(425);
		data.setName("フワンテ");
		data.setFeatures("魂の　道標と　いわれる。　" + "フワンテを　持っていた　子供は　" + "突然　消えて　いなくなる。");
		data.setType("ゴースト");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/425.png");
		return data;
	}

	@RequestMapping({ "/pokemon/426", "/pokemon/フワライド", "/pokemon/Drifblim" })
	public PokemonData poke426() {
		PokemonData data = new PokemonData();
		data.setId(426);
		data.setName("フワライド");
		data.setFeatures("昼間は　寝ぼけて　浮かんでいるが　" + "夕方　大群で　飛んでいく。　" + "行先は　だれも　知らない。");
		data.setType("ゴースト");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/426.png");
		return data;
	}

	@RequestMapping({ "/pokemon/427", "/pokemon/ミミロル", "/pokemon/Buneary" })
	public PokemonData poke427() {
		PokemonData data = new PokemonData();
		data.setId(427);
		data.setName("ミミロル");
		data.setFeatures("危険を　感じ取ると　両耳を　立てて　" + "警戒する。寒い　夜は　" + "毛皮に　顔を　埋めて　眠る。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/427.png");
		return data;
	}

	@RequestMapping({ "/pokemon/428", "/pokemon/ミミロップ", "/pokemon/Lopunny" })
	public PokemonData poke428() {
		PokemonData data = new PokemonData();
		data.setId(428);
		data.setName("ミミロップ");
		data.setFeatures("耳は　とても　デリケートらしく　" + "優しく　丁寧に　触らないと　" + "しなやかな　脚で　けられてしまう。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/428.png");
		return data;
	}

	@RequestMapping({ "/pokemon/429", "/pokemon/ムウマージ", "/pokemon/Mismagius" })
	public PokemonData poke429() {
		PokemonData data = new PokemonData();
		data.setId(429);
		data.setName("ムウマージ");
		data.setFeatures("じゅもんの　ような　怪しい　鳴き声で　" + "相手を　苦しめる。　" + "神出鬼没の　ポケモン。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/429.png");
		return data;
	}

	@RequestMapping({ "/pokemon/430", "/pokemon/ドンカラス", "/pokemon/Honchkrow" })
	public PokemonData poke430() {
		PokemonData data = new PokemonData();
		data.setId(430);
		data.setName("ドンカラス");
		data.setFeatures("夜になると　活動を　はじめる。　" + "たくさんの　ヤミカラスを　引き連れ　" + "群れを　作ることで　知られる。");
		data.setType("あく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/430.png");
		return data;
	}

	@RequestMapping({ "/pokemon/431", "/pokemon/ニャルマー", "/pokemon/Glameow" })
	public PokemonData poke431() {
		PokemonData data = new PokemonData();
		data.setId(431);
		data.setName("ニャルマー");
		data.setFeatures("ご機嫌な　ニャルマーは　尻尾で　" + "新体操の　リボンのような　" + "美しい　動きを　見せる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/431.png");
		return data;
	}

	@RequestMapping({ "/pokemon/432", "/pokemon/ブニャット", "/pokemon/Purugly" })
	public PokemonData poke432() {
		PokemonData data = new PokemonData();
		data.setId(432);
		data.setName("ブニャット");
		data.setFeatures("体を　大きく　見せて　相手を　" + "威圧するため　ふたまたの　尻尾で　" + "ウエストを　ぎゅっと　絞っている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/432.png");
		return data;
	}

	@RequestMapping({ "/pokemon/433", "/pokemon/リーシャン", "/pokemon/Chingling" })
	public PokemonData poke433() {
		PokemonData data = new PokemonData();
		data.setId(433);
		data.setName("リーシャン");
		data.setFeatures("飛び跳ねると　口の中にある　" + "玉が　あちこちに　反射して　" + "鈴のような　音色と　なる。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/433.png");
		return data;
	}

	@RequestMapping({ "/pokemon/434", "/pokemon/スカンプー", "/pokemon/Stunky" })
	public PokemonData poke434() {
		PokemonData data = new PokemonData();
		data.setId(434);
		data.setName("スカンプー");
		data.setFeatures("お尻から　強烈に　くさい　液体を　" + "飛ばして　身を　守る。　" + "においは　２４時間　消えない。");
		data.setType("どく");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/434.png");
		return data;
	}

	@RequestMapping({ "/pokemon/435", "/pokemon/スカタンク", "/pokemon/Skuntank" })
	public PokemonData poke435() {
		PokemonData data = new PokemonData();
		data.setId(435);
		data.setName("スカタンク");
		data.setFeatures("尻尾から　くさい　汁を　飛ばす。　" + "お腹で　熟成させる　時間が　" + "長いほど　においが　ひどくなる。");
		data.setType("どく");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/435.png");
		return data;
	}

	@RequestMapping({ "/pokemon/436", "/pokemon/ドーミラー", "/pokemon/Bronzor" })
	public PokemonData poke436() {
		PokemonData data = new PokemonData();
		data.setId(436);
		data.setName("ドーミラー");
		data.setFeatures("ドーミラーの　背中の　模様には　" + "神秘的な　力が　宿ると　" + "昔の　人たちは　信じていた。");
		data.setType("はがね");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/436.png");
		return data;
	}

	@RequestMapping({ "/pokemon/437", "/pokemon/ドータクン", "/pokemon/Bronzong" })
	public PokemonData poke437() {
		PokemonData data = new PokemonData();
		data.setId(437);
		data.setName("ドータクン");
		data.setFeatures("ドータクンに　祈りを　ささげると　" + "雨が　降り　作物を　育てると　" + "古代の　人々は　信じていた。");
		data.setType("はがね");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/437.png");
		return data;
	}

	@RequestMapping({ "/pokemon/438", "/pokemon/ウソハチ", "/pokemon/Bonsly" })
	public PokemonData poke438() {
		PokemonData data = new PokemonData();
		data.setId(438);
		data.setName("ウソハチ");
		data.setFeatures("乾燥した　空気を　好む。　" + "水分を　調節　するときに　" + "出す　水が　涙に　見える。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/438.png");
		return data;
	}

	@RequestMapping({ "/pokemon/439", "/pokemon/マネネ", "/pokemon/Mime Jr." })
	public PokemonData poke439() {
		PokemonData data = new PokemonData();
		data.setId(439);
		data.setName("マネネ");
		data.setFeatures("相手の　動きを　モノマネする　" + "習性。真似を　された　相手は　" + "目が　離せなくなる　という。");
		data.setType("エスパー");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/439.png");
		return data;
	}

	@RequestMapping({ "/pokemon/440", "/pokemon/ピンプク", "/pokemon/Happiny" })
	public PokemonData poke440() {
		PokemonData data = new PokemonData();
		data.setId(440);
		data.setName("ピンプク");
		data.setFeatures("白くて　まるい　石を　タマゴと　" + "思いこんで　大事に　持っている。　" + "巻き毛の　形を　気にしている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/440.png");
		return data;
	}

	@RequestMapping({ "/pokemon/441", "/pokemon/ペラップ", "/pokemon/Chatot" })
	public PokemonData poke441() {
		PokemonData data = new PokemonData();
		data.setId(441);
		data.setName("ペラップ");
		data.setFeatures("人の　言葉を　覚えて　鳴く。　" + "仲間が　一か所に　集まると　" + "みんな　同じ　言葉を　覚える。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/441.png");
		return data;
	}

	@RequestMapping({ "/pokemon/442", "/pokemon/ミカルゲ", "/pokemon/Spiritomb" })
	public PokemonData poke442() {
		PokemonData data = new PokemonData();
		data.setId(442);
		data.setName("ミカルゲ");
		data.setFeatures("５００年前に　悪さをしたため　" + "要石の　ひび割れに　" + "体を　つなぎとめられてしまった。");
		data.setType("ゴースト");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/442.png");
		return data;
	}

	@RequestMapping({ "/pokemon/443", "/pokemon/フカマル", "/pokemon/Gible" })
	public PokemonData poke443() {
		PokemonData data = new PokemonData();
		data.setId(443);
		data.setName("フカマル");
		data.setFeatures("洞窟の　小さな　横穴を　" + "ねぐらにする。獲物が　近づくと　" + "素早く　飛び出して　捕まえる。");
		data.setType("ドラゴン");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/443.png");
		return data;
	}

	@RequestMapping({ "/pokemon/444", "/pokemon/ガバイト", "/pokemon/Gabite" })
	public PokemonData poke444() {
		PokemonData data = new PokemonData();
		data.setId(444);
		data.setName("ガバイト");
		data.setFeatures("巣穴を　広げるとき　地中から　" + "出てきた　宝石の　原石を　" + "巣に　ためる　習性を　持つ。");
		data.setType("ドラゴン");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/444.png");
		return data;
	}

	@RequestMapping({ "/pokemon/445", "/pokemon/ガブリアス", "/pokemon/Garchomp" })
	public PokemonData poke445() {
		PokemonData data = new PokemonData();
		data.setId(445);
		data.setName("ガブリアス");
		data.setFeatures("ジェット戦闘機に　負けない　" + "スピードで　空を　飛ぶ。　" + "ねらった　獲物は　逃がさない。");
		data.setType("ドラゴン");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/445.png");
		return data;
	}

	@RequestMapping({ "/pokemon/446", "/pokemon/ゴンベ", "/pokemon/Munchlax" })
	public PokemonData poke446() {
		PokemonData data = new PokemonData();
		data.setId(446);
		data.setName("ゴンベ");
		data.setFeatures("ボサボサの　体毛の　中に　" + "食べ物を　隠して　持ち歩く。　" + "食べる　ときは　ゴクリと　まる飲み。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/446.png");
		return data;
	}

	@RequestMapping({ "/pokemon/447", "/pokemon/リオル", "/pokemon/Riolu" })
	public PokemonData poke447() {
		PokemonData data = new PokemonData();
		data.setId(447);
		data.setName("リオル");
		data.setFeatures("体から　発する　波動は　" + "怖いとき　悲しいときに　強まり　" + "ピンチを　仲間に　伝える。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/447.png");
		return data;
	}

	@RequestMapping({ "/pokemon/448", "/pokemon/ルカリオ", "/pokemon/Lucario" })
	public PokemonData poke448() {
		PokemonData data = new PokemonData();
		data.setId(448);
		data.setName("ルカリオ");
		data.setFeatures("あらゆる　ものが　出す　波動を　" + "読みとることで　１キロ先に　いる　" + "相手の　気持ちも　理解できる。");
		data.setType("かくとう");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/448.png");
		return data;
	}

	@RequestMapping({ "/pokemon/449", "/pokemon/ヒポポタス", "/pokemon/Hippopotas" })
	public PokemonData poke449() {
		PokemonData data = new PokemonData();
		data.setId(449);
		data.setName("ヒポポタス");
		data.setFeatures("全身に　砂を　まとうことで　" + "ばい菌から　体を　守る。　" + "水に　ぬれることが　苦手。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/449.png");
		return data;
	}

	@RequestMapping({ "/pokemon/450", "/pokemon/カバルドン", "/pokemon/Hippowdon" })
	public PokemonData poke450() {
		PokemonData data = new PokemonData();
		data.setId(450);
		data.setName("カバルドン");
		data.setFeatures("体内に　ためた　砂を　体の　穴から　" + "噴き上げて　巨大な　" + "竜巻を　作り　攻撃する。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/450.png");
		return data;
	}

	@RequestMapping({ "/pokemon/451", "/pokemon/スコルピ", "/pokemon/Skorupi" })
	public PokemonData poke451() {
		PokemonData data = new PokemonData();
		data.setId(451);
		data.setName("スコルピ");
		data.setFeatures("砂の　中に　隠れて　獲物を　" + "待ち伏せする。尻尾の　ツメから　" + "毒を　出して　獲物を　しとめる。");
		data.setType("どく");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/451.png");
		return data;
	}

	@RequestMapping({ "/pokemon/452", "/pokemon/ドラピオン", "/pokemon/Drapion" })
	public PokemonData poke452() {
		PokemonData data = new PokemonData();
		data.setId(452);
		data.setName("ドラピオン");
		data.setFeatures("両腕の　ツメは　自動車を　" + "スクラップにする　破壊力。　" + "ツメの　先から　毒を　出す。");
		data.setType("どく");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/452.png");
		return data;
	}

	@RequestMapping({ "/pokemon/453", "/pokemon/グレッグル", "/pokemon/Croagunk" })
	public PokemonData poke453() {
		PokemonData data = new PokemonData();
		data.setId(453);
		data.setName("グレッグル");
		data.setFeatures("毒袋を　ふくらませて　鳴らし　" + "辺りに　不気味な　音を　響かせ　" + "相手が　ひるむと　どくづきをする。");
		data.setType("どく");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/453.png");
		return data;
	}

	@RequestMapping({ "/pokemon/454", "/pokemon/ドクロッグ", "/pokemon/Toxicroak" })
	public PokemonData poke454() {
		PokemonData data = new PokemonData();
		data.setId(454);
		data.setName("ドクロッグ");
		data.setFeatures("こぶしの　トゲからは　" + "かすり傷でも　命を　落とすほどの　" + "猛毒を　分泌する。");
		data.setType("どく");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/454.png");
		return data;
	}

	@RequestMapping({ "/pokemon/455", "/pokemon/マスキッパ", "/pokemon/Carnivine" })
	public PokemonData poke455() {
		PokemonData data = new PokemonData();
		data.setId(455);
		data.setName("マスキッパ");
		data.setFeatures("湿地帯に　生える　木に巻きつき　" + "甘い香りの　だえきで　獲物を　" + "誘き寄せては　ひとくちで　食べる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/455.png");
		return data;
	}

	@RequestMapping({ "/pokemon/456", "/pokemon/ケイコウオ", "/pokemon/Finneon" })
	public PokemonData poke456() {
		PokemonData data = new PokemonData();
		data.setId(456);
		data.setName("ケイコウオ");
		data.setFeatures("太陽を　いっぱいに　浴びた　" + "尾びれの　模様は　暗くなると　" + "鮮やかな　色で　光り出す。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/456.png");
		return data;
	}

	@RequestMapping({ "/pokemon/457", "/pokemon/ネオラント", "/pokemon/Lumineon" })
	public PokemonData poke457() {
		PokemonData data = new PokemonData();
		data.setId(457);
		data.setName("ネオラント");
		data.setFeatures("天敵に　見つからないように　" + "胸の　２枚の　ヒレを　使い　" + "海底を　這って　移動する。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/457.png");
		return data;
	}

	@RequestMapping({ "/pokemon/458", "/pokemon/タマンタ", "/pokemon/Mantyke" })
	public PokemonData poke458() {
		PokemonData data = new PokemonData();
		data.setId(458);
		data.setName("タマンタ");
		data.setFeatures("海面の　近くを　泳ぐため　" + "船の　上から　背中の　模様を　" + "観察する　ことが　できる。");
		data.setType("みず");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/458.png");
		return data;
	}

	@RequestMapping({ "/pokemon/459", "/pokemon/ユキカブリ", "/pokemon/Snover" })
	public PokemonData poke459() {
		PokemonData data = new PokemonData();
		data.setId(459);
		data.setName("ユキカブリ");
		data.setFeatures("春になると　アイスキャンディーの　" + "ような　食感の　木の実が　" + "お腹の　まわりに　生る。");
		data.setType("くさ");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/459.png");
		return data;
	}

	@RequestMapping({ "/pokemon/460", "/pokemon/ユキノオー", "/pokemon/Abomasnow" })
	public PokemonData poke460() {
		PokemonData data = new PokemonData();
		data.setId(460);
		data.setName("ユキノオー");
		data.setFeatures("万年雪が　積もる　山脈で　" + "静かに　暮らす。ブリザードを　" + "発生させて　姿を　隠す。");
		data.setType("くさ");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/460.png");
		return data;
	}

	@RequestMapping({ "/pokemon/461", "/pokemon/マニューラ", "/pokemon/Weavile" })
	public PokemonData poke461() {
		PokemonData data = new PokemonData();
		data.setId(461);
		data.setName("マニューラ");
		data.setFeatures("寒い　地域で　暮らす　ポケモン。　" + "４、５匹の　グループは　見事な　" + "連係で　獲物を　追いつめる。");
		data.setType("あく");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/461.png");
		return data;
	}

	@RequestMapping({ "/pokemon/462", "/pokemon/ジバコイル", "/pokemon/Magnezone" })
	public PokemonData poke462() {
		PokemonData data = new PokemonData();
		data.setId(462);
		data.setName("ジバコイル");
		data.setFeatures("特殊な　磁場の　影響で　" + "レアコイルが　進化した。３つの　" + "ユニットから　磁力を　出す。");
		data.setType("でんき");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/462.png");
		return data;
	}

	@RequestMapping({ "/pokemon/463", "/pokemon/ベロベルト", "/pokemon/Lickilicky" })
	public PokemonData poke463() {
		PokemonData data = new PokemonData();
		data.setId(463);
		data.setName("ベロベルト");
		data.setFeatures("だえきには　どんな　物も　溶かす　" + "成分が　たっぷり　含まれており　" + "なめられると　いつまでも　しびれる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/463.png");
		return data;
	}

	@RequestMapping({ "/pokemon/464", "/pokemon/ドサイドン", "/pokemon/Rhyperior" })
	public PokemonData poke464() {
		PokemonData data = new PokemonData();
		data.setId(464);
		data.setName("ドサイドン");
		data.setFeatures("岩を　手のひらの　穴に　つめて　" + "筋肉の　力で　発射する。　" + "まれに　イシツブテを　飛ばす。");
		data.setType("じめん");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/464.png");
		return data;
	}

	@RequestMapping({ "/pokemon/465", "/pokemon/モジャンボ", "/pokemon/Tangrowth" })
	public PokemonData poke465() {
		PokemonData data = new PokemonData();
		data.setId(465);
		data.setName("モジャンボ");
		data.setFeatures("暖かい　季節に　なると　" + "目玉も　隠れてしまうほど　" + "植物の　ツルが　伸び続ける。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/465.png");
		return data;
	}

	@RequestMapping({ "/pokemon/466", "/pokemon/エレキブル", "/pokemon/Electivire" })
	public PokemonData poke466() {
		PokemonData data = new PokemonData();
		data.setId(466);
		data.setName("エレキブル");
		data.setFeatures("２本の　尻尾の　先を　相手に　" + "押し当てて　２万ボルト以上の　" + "電流を　流して　攻撃。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/466.png");
		return data;
	}

	@RequestMapping({ "/pokemon/467", "/pokemon/ブーバーン", "/pokemon/Magmortar" })
	public PokemonData poke467() {
		PokemonData data = new PokemonData();
		data.setId(467);
		data.setName("ブーバーン");
		data.setFeatures("摂氏２０００度の　火の玉を　" + "腕の　先から　撃ち出す。　" + "口から　吐く　息も　燃えている。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/467.png");
		return data;
	}

	@RequestMapping({ "/pokemon/468", "/pokemon/トゲキッス", "/pokemon/Togekiss" })
	public PokemonData poke468() {
		PokemonData data = new PokemonData();
		data.setId(468);
		data.setName("トゲキッス");
		data.setFeatures("争い事や　もめ事が　起こる　" + "場所には　姿を　見せない。　" + "近ごろは　ほとんど　見かけない。");
		data.setType("フェアリー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/468.png");
		return data;
	}

	@RequestMapping({ "/pokemon/469", "/pokemon/メガヤンマ", "/pokemon/Yanmega" })
	public PokemonData poke469() {
		PokemonData data = new PokemonData();
		data.setId(469);
		data.setName("メガヤンマ");
		data.setFeatures("６本の　脚で　大人を　抱えて　" + "楽々と　飛ぶ　ことが　できる。　" + "尻尾の　羽で　バランスを　とる。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/469.png");
		return data;
	}

	@RequestMapping({ "/pokemon/470", "/pokemon/リーフィア", "/pokemon/Leafeon" })
	public PokemonData poke470() {
		PokemonData data = new PokemonData();
		data.setId(470);
		data.setName("リーフィア");
		data.setFeatures("植物のように　光合成を　するため　" + "リーフィアの　まわりは　" + "澄んだ　空気に　包まれている。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/470.png");
		return data;
	}

	@RequestMapping({ "/pokemon/471", "/pokemon/グレイシア", "/pokemon/Glaceon" })
	public PokemonData poke471() {
		PokemonData data = new PokemonData();
		data.setId(471);
		data.setName("グレイシア");
		data.setFeatures("体温を　さげることで　全身の　" + "体毛を　凍らせて　鋭く　" + "とがった　針のようにして　飛ばす。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/471.png");
		return data;
	}

	@RequestMapping({ "/pokemon/472", "/pokemon/グライオン", "/pokemon/Gliscor" })
	public PokemonData poke472() {
		PokemonData data = new PokemonData();
		data.setId(472);
		data.setName("グライオン");
		data.setFeatures("羽音を　立てずに　空を　飛ぶ。　" + "長い　尻尾で　獲物を　捕まえ　" + "キバで　急所を　一突き。");
		data.setType("じめん");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/472.png");
		return data;
	}

	@RequestMapping({ "/pokemon/473", "/pokemon/マンムー", "/pokemon/Mamoswine" })
	public PokemonData poke473() {
		PokemonData data = new PokemonData();
		data.setId(473);
		data.setName("マンムー");
		data.setFeatures("氷で　できた　立派な　キバ。　" + "氷河期が　終わり　暖かく　" + "なったため　数が　減ってしまった。");
		data.setType("こおり");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/473.png");
		return data;
	}

	@RequestMapping({ "/pokemon/474", "/pokemon/ポリゴンＺ", "/pokemon/Porygon-Z" })
	public PokemonData poke474() {
		PokemonData data = new PokemonData();
		data.setId(474);
		data.setName("ポリゴンＺ");
		data.setFeatures("異次元空間を　自由に　" + "移動できるように　プログラムを　" + "修正したが　ミスした　らしい。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/474.png");
		return data;
	}

	@RequestMapping({ "/pokemon/475", "/pokemon/エルレイド", "/pokemon/Gallade" })
	public PokemonData poke475() {
		PokemonData data = new PokemonData();
		data.setId(475);
		data.setName("エルレイド");
		data.setFeatures("伸び縮みする　ヒジの　刀で　戦う。　" + "居合の　名手。　" + "礼儀正しい　ポケモン。");
		data.setType("エスパー");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/475.png");
		return data;
	}

	@RequestMapping({ "/pokemon/476", "/pokemon/ダイノーズ", "/pokemon/Probopass" })
	public PokemonData poke476() {
		PokemonData data = new PokemonData();
		data.setId(476);
		data.setName("ダイノーズ");
		data.setFeatures("チビノーズと　呼ばれる　小さな　" + "３つの　ユニットを　磁力で　" + "自由自在に　操っている。");
		data.setType("いわ");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/476.png");
		return data;
	}

	@RequestMapping({ "/pokemon/477", "/pokemon/ヨノワール", "/pokemon/Dusknoir" })
	public PokemonData poke477() {
		PokemonData data = new PokemonData();
		data.setId(477);
		data.setName("ヨノワール");
		data.setFeatures("頭の　アンテナで　霊界からの　" + "電波を　受信。指示を　受けて　" + "人を　霊界へ　連れて行くのだ。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/477.png");
		return data;
	}

	@RequestMapping({ "/pokemon/478", "/pokemon/ユキメノコ", "/pokemon/Froslass" })
	public PokemonData poke478() {
		PokemonData data = new PokemonData();
		data.setId(478);
		data.setName("ユキメノコ");
		data.setFeatures("雪山で　遭難した　女性の　" + "生まれ変わりという　言い伝えが　" + "雪の　多い　土地に　残る。");
		data.setType("こおり");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/478.png");
		return data;
	}

	@RequestMapping({ "/pokemon/479", "/pokemon/ロトム", "/pokemon/Rotom" })
	public PokemonData poke479() {
		PokemonData data = new PokemonData();
		data.setId(479);
		data.setName("ロトム");
		data.setFeatures("特殊な　モーターを　動かす　" + "動力源として　長い　あいだ　" + "研究されていた　ポケモン。");
		data.setType("でんき");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/479.png");
		return data;
	}

	@RequestMapping({ "/pokemon/480", "/pokemon/ユクシー", "/pokemon/Uxie" })
	public PokemonData poke480() {
		PokemonData data = new PokemonData();
		data.setId(480);
		data.setName("ユクシー");
		data.setFeatures("ユクシーの　誕生により　" + "人々の　生活を　豊かにする　" + "知恵が　生まれたと　言われている。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/480.png");
		return data;
	}

	@RequestMapping({ "/pokemon/481", "/pokemon/エムリット", "/pokemon/Mesprit" })
	public PokemonData poke481() {
		PokemonData data = new PokemonData();
		data.setId(481);
		data.setName("エムリット");
		data.setFeatures("湖の　底で　眠っているが　" + "魂が　抜け出して　水面を　" + "飛び回ると　言われている。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/481.png");
		return data;
	}

	@RequestMapping({ "/pokemon/482", "/pokemon/アグノム", "/pokemon/Azelf" })
	public PokemonData poke482() {
		PokemonData data = new PokemonData();
		data.setId(482);
		data.setName("アグノム");
		data.setFeatures("ユクシー　エムリット　アグノムは　" + "同じ　タマゴから　生まれた　" + "ポケモンと　考えられている。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/482.png");
		return data;
	}

	@RequestMapping({ "/pokemon/483", "/pokemon/ディアルガ", "/pokemon/Dialga" })
	public PokemonData poke483() {
		PokemonData data = new PokemonData();
		data.setId(483);
		data.setName("ディアルガ");
		data.setFeatures("時間を　操る　力を　持つ。　" + "シンオウ地方では　神様と　呼ばれ　" + "神話に　登場する。");
		data.setType("はがね");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/483.png");
		return data;
	}

	@RequestMapping({ "/pokemon/484", "/pokemon/パルキア", "/pokemon/Palkia" })
	public PokemonData poke484() {
		PokemonData data = new PokemonData();
		data.setId(484);
		data.setName("パルキア");
		data.setFeatures("空間を　ゆがめる　能力を　持ち　" + "シンオウ地方の　神話では　" + "神様として　描かれている。");
		data.setType("みず");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/484.png");
		return data;
	}

	@RequestMapping({ "/pokemon/485", "/pokemon/ヒードラン", "/pokemon/Heatran" })
	public PokemonData poke485() {
		PokemonData data = new PokemonData();
		data.setId(485);
		data.setName("ヒードラン");
		data.setFeatures("マグマのように　燃えたぎる　" + "血液が　体を　流れている。　" + "火山の　洞穴に　生息する。");
		data.setType("ほのお");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/485.png");
		return data;
	}

	@RequestMapping({ "/pokemon/486", "/pokemon/レジギガス", "/pokemon/Regigigas" })
	public PokemonData poke486() {
		PokemonData data = new PokemonData();
		data.setId(486);
		data.setName("レジギガス");
		data.setFeatures("縄で　縛った　大陸を　" + "引っ張って　動かしたという　" + "伝説が　残されている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/486.png");
		return data;
	}

	@RequestMapping({ "/pokemon/487", "/pokemon/ギラティナ", "/pokemon/Giratina" })
	public PokemonData poke487() {
		PokemonData data = new PokemonData();
		data.setId(487);
		data.setName("ギラティナ");
		data.setFeatures("暴れ者　ゆえ　追い出されたが　" + "破れた世界と　言われる　場所で　" + "静かに　元の世界を　見ていた。");
		data.setType("ゴースト");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/487.png");
		return data;
	}

	@RequestMapping({ "/pokemon/488", "/pokemon/クレセリア", "/pokemon/Cresselia" })
	public PokemonData poke488() {
		PokemonData data = new PokemonData();
		data.setId(488);
		data.setName("クレセリア");
		data.setFeatures("クレセリアの　羽を　持って　寝ると　" + "楽しい　夢が　見られると　いう。　" + "三日月の化身　と　呼ばれている。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/488.png");
		return data;
	}

	@RequestMapping({ "/pokemon/489", "/pokemon/フィオネ", "/pokemon/Phione" })
	public PokemonData poke489() {
		PokemonData data = new PokemonData();
		data.setId(489);
		data.setName("フィオネ");
		data.setFeatures("暖かい　海を　漂っている。　" + "どんな　遠くに　流されても　" + "生まれた　場所に　かならず戻る。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/489.png");
		return data;
	}

	@RequestMapping({ "/pokemon/490", "/pokemon/マナフィ", "/pokemon/Manaphy" })
	public PokemonData poke490() {
		PokemonData data = new PokemonData();
		data.setId(490);
		data.setName("マナフィ");
		data.setFeatures("どんな　ポケモンとでも　心を　" + "通い合わせる　ことが　できる　" + "不思議な　能力を　持っている。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/490.png");
		return data;
	}

	@RequestMapping({ "/pokemon/491", "/pokemon/ダークライ", "/pokemon/Darkrai" })
	public PokemonData poke491() {
		PokemonData data = new PokemonData();
		data.setId(491);
		data.setName("ダークライ");
		data.setFeatures("人々を　深い　眠りに　誘い　" + "夢を　見せる　能力を　持つ。　" + "新月の　夜に　活動する。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/491.png");
		return data;
	}

	@RequestMapping({ "/pokemon/492", "/pokemon/シェイミ", "/pokemon/Shaymin" })
	public PokemonData poke492() {
		PokemonData data = new PokemonData();
		data.setId(492);
		data.setName("シェイミ");
		data.setFeatures("グラシデアの花が　咲く　季節　" + "感謝の　心を　届けるために　" + "飛び立つと　言われている。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/492.png");
		return data;
	}

	@RequestMapping({ "/pokemon/493", "/pokemon/アルセウス", "/pokemon/Arceus" })
	public PokemonData poke493() {
		PokemonData data = new PokemonData();
		data.setId(493);
		data.setName("アルセウス");
		data.setFeatures("宇宙が　まだ　ない　ころに　" + "最初に　生まれた　ポケモンと　" + "神話の　中で　語られている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/493.png");
		return data;
	}

	@RequestMapping({ "/pokemon/494", "/pokemon/ビクティニ", "/pokemon/Victini" })
	public PokemonData poke494() {
		PokemonData data = new PokemonData();
		data.setId(494);
		data.setName("ビクティニ");
		data.setFeatures("ビクティニが　無限に　生み出す　" + "エネルギーを　分け与えてもらうと　" + "全身に　パワーが　あふれ出す。");
		data.setType("エスパー");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/494.png");
		return data;
	}

	@RequestMapping({ "/pokemon/495", "/pokemon/ツタージャ", "/pokemon/Snivy" })
	public PokemonData poke495() {
		PokemonData data = new PokemonData();
		data.setId(495);
		data.setName("ツタージャ");
		data.setFeatures("尻尾で　太陽の光を　浴びて　" + "光合成を　する。元気を　なくすと　" + "尻尾が　たれさがる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/495.png");
		return data;
	}

	@RequestMapping({ "/pokemon/496", "/pokemon/ジャノビー", "/pokemon/Servine" })
	public PokemonData poke496() {
		PokemonData data = new PokemonData();
		data.setId(496);
		data.setName("ジャノビー");
		data.setFeatures("体が　汚れると　葉っぱで　" + "光合成が　できなくなるので　" + "いつも　清潔に　している。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/496.png");
		return data;
	}

	@RequestMapping({ "/pokemon/497", "/pokemon/ジャローダ", "/pokemon/Serperior" })
	public PokemonData poke497() {
		PokemonData data = new PokemonData();
		data.setId(497);
		data.setName("ジャローダ");
		data.setFeatures("にらむだけで　相手の　動きを　" + "止めてしまう。太陽エネルギーを　" + "体内で　増幅させる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/497.png");
		return data;
	}

	@RequestMapping({ "/pokemon/498", "/pokemon/ポカブ", "/pokemon/Tepig" })
	public PokemonData poke498() {
		PokemonData data = new PokemonData();
		data.setId(498);
		data.setName("ポカブ");
		data.setFeatures("焼いた　木の実を　食べるのが　" + "大好きだが　興奮しすぎて　" + "ときどき　真っ黒焦げに　しちゃう。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/498.png");
		return data;
	}

	@RequestMapping({ "/pokemon/499", "/pokemon/チャオブー", "/pokemon/Pignite" })
	public PokemonData poke499() {
		PokemonData data = new PokemonData();
		data.setId(499);
		data.setName("チャオブー");
		data.setFeatures("体内の　炎が　燃え上がると　" + "動きの　キレと　スピードが　増す。　" + "ピンチになると　煙を　噴き出す。");
		data.setType("ほのお");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/499.png");
		return data;
	}

	@RequestMapping({ "/pokemon/500", "/pokemon/エンブオー", "/pokemon/Emboar" })
	public PokemonData poke500() {
		PokemonData data = new PokemonData();
		data.setId(500);
		data.setName("エンブオー");
		data.setFeatures("炎の　あごひげを　たくわえている。　" + "パワーと　スピードを　兼ね備えた　" + "格闘の　技を　身につけている。");
		data.setType("ほのお");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/500.png");
		return data;
	}

	@RequestMapping({ "/pokemon/501", "/pokemon/ミジュマル", "/pokemon/Oshawott" })
	public PokemonData poke501() {
		PokemonData data = new PokemonData();
		data.setId(501);
		data.setName("ミジュマル");
		data.setFeatures("お腹の　ホタチで　戦う。　" + "攻撃を　受け止めてから　すかさず　" + "切りつけて　反撃するのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/501.png");
		return data;
	}

	@RequestMapping({ "/pokemon/502", "/pokemon/フタチマル", "/pokemon/Dewott" })
	public PokemonData poke502() {
		PokemonData data = new PokemonData();
		data.setId(502);
		data.setName("フタチマル");
		data.setFeatures("きびしい　修業の　すえ　" + "フタチマルごとに　異なる　型の　" + "ホタチさばきを　習得する。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/502.png");
		return data;
	}

	@RequestMapping({ "/pokemon/503", "/pokemon/ダイケンキ", "/pokemon/Samurott" })
	public PokemonData poke503() {
		PokemonData data = new PokemonData();
		data.setId(503);
		data.setName("ダイケンキ");
		data.setFeatures("よろいに　仕込まれた　剣の　一振りで　" + "相手を　倒す。　" + "ひとにらみで　敵を　黙らせる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/503.png");
		return data;
	}

	@RequestMapping({ "/pokemon/504", "/pokemon/ミネズミ", "/pokemon/Patrat" })
	public PokemonData poke504() {
		PokemonData data = new PokemonData();
		data.setId(504);
		data.setName("ミネズミ");
		data.setFeatures("警戒心が　強く　かならず　" + "１匹は　見張りを　しているのだが　" + "後ろからの　敵には　気づかない。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/504.png");
		return data;
	}

	@RequestMapping({ "/pokemon/505", "/pokemon/ミルホッグ", "/pokemon/Watchog" })
	public PokemonData poke505() {
		PokemonData data = new PokemonData();
		data.setId(505);
		data.setName("ミルホッグ");
		data.setFeatures("ほほ袋に　ためた　木の実の　タネを　" + "飛ばして　攻撃。　" + "敵を　発見すると　尻尾を　立てる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/505.png");
		return data;
	}

	@RequestMapping({ "/pokemon/506", "/pokemon/ヨーテリー", "/pokemon/Lillipup" })
	public PokemonData poke506() {
		PokemonData data = new PokemonData();
		data.setId(506);
		data.setName("ヨーテリー");
		data.setFeatures("勇猛な　ポケモンだが　相手の　" + "強さを　確かめて　戦いを　" + "避ける　賢さも　併せ持つ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/506.png");
		return data;
	}

	@RequestMapping({ "/pokemon/507", "/pokemon/ハーデリア", "/pokemon/Herdier" })
	public PokemonData poke507() {
		PokemonData data = new PokemonData();
		data.setId(507);
		data.setName("ハーデリア");
		data.setFeatures("マントのように　体を　覆う　" + "黒い　体毛は　とても　硬い。　" + "受けた　ダメージを　減らしてくれる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/507.png");
		return data;
	}

	@RequestMapping({ "/pokemon/508", "/pokemon/ムーランド", "/pokemon/Stoutland" })
	public PokemonData poke508() {
		PokemonData data = new PokemonData();
		data.setId(508);
		data.setName("ムーランド");
		data.setFeatures("長い　体毛に　包まれると　" + "冬山でも　一晩　平気なほど　" + "暖かく　とても　心地よい。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/508.png");
		return data;
	}

	@RequestMapping({ "/pokemon/509", "/pokemon/チョロネコ", "/pokemon/Purrloin" })
	public PokemonData poke509() {
		PokemonData data = new PokemonData();
		data.setId(509);
		data.setName("チョロネコ");
		data.setFeatures("人の　物を　遊びで　盗む。　" + "盗まれた　人も　愛くるしい　仕草に　" + "つい　許してしまうのだ。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/509.png");
		return data;
	}

	@RequestMapping({ "/pokemon/510", "/pokemon/レパルダス", "/pokemon/Liepard" })
	public PokemonData poke510() {
		PokemonData data = new PokemonData();
		data.setId(510);
		data.setName("レパルダス");
		data.setFeatures("気配を　殺して　接近する。　" + "相手が　気づく　前に　背後から　" + "忍び寄り　しとめてしまうのだ。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/510.png");
		return data;
	}

	@RequestMapping({ "/pokemon/511", "/pokemon/ヤナップ", "/pokemon/Pansage" })
	public PokemonData poke511() {
		PokemonData data = new PokemonData();
		data.setId(511);
		data.setName("ヤナップ");
		data.setFeatures("木の実を　探すのが　上手で　" + "あちこちで　集めて　仲間に　" + "分け与える　優しさを　持つ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/511.png");
		return data;
	}

	@RequestMapping({ "/pokemon/512", "/pokemon/ヤナッキー", "/pokemon/Simisage" })
	public PokemonData poke512() {
		PokemonData data = new PokemonData();
		data.setId(512);
		data.setName("ヤナッキー");
		data.setFeatures("気性が　激しく　トゲの　ついた　" + "尻尾を　振り回して　戦う。　" + "頭の　葉っぱは　とても　苦い。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/512.png");
		return data;
	}

	@RequestMapping({ "/pokemon/513", "/pokemon/バオップ", "/pokemon/Pansear" })
	public PokemonData poke513() {
		PokemonData data = new PokemonData();
		data.setId(513);
		data.setName("バオップ");
		data.setFeatures("火山の　洞穴で　暮らす。　" + "頭の　ふさの　中が　燃えていて　" + "３００度の　高温になる。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/513.png");
		return data;
	}

	@RequestMapping({ "/pokemon/514", "/pokemon/バオッキー", "/pokemon/Simisear" })
	public PokemonData poke514() {
		PokemonData data = new PokemonData();
		data.setId(514);
		data.setName("バオッキー");
		data.setFeatures("興奮すると　頭や　尻尾から　" + "火の粉が　舞いあがって　熱くなる。　" + "なぜか　甘いものが　大好物。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/514.png");
		return data;
	}

	@RequestMapping({ "/pokemon/515", "/pokemon/ヒヤップ", "/pokemon/Panpour" })
	public PokemonData poke515() {
		PokemonData data = new PokemonData();
		data.setId(515);
		data.setName("ヒヤップ");
		data.setFeatures("頭の　ふさに　ためた　水は　" + "栄養　たっぷり。　" + "植物に　かけると　大きく　育つのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/515.png");
		return data;
	}

	@RequestMapping({ "/pokemon/516", "/pokemon/ヒヤッキー", "/pokemon/Simipour" })
	public PokemonData poke516() {
		PokemonData data = new PokemonData();
		data.setId(516);
		data.setName("ヒヤッキー");
		data.setFeatures("水が　きれいな　場所を　好む。　" + "頭に　ためこんだ　水が減ると　" + "尻尾から　吸いあげて　補給。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/516.png");
		return data;
	}

	@RequestMapping({ "/pokemon/517", "/pokemon/ムンナ", "/pokemon/Munna" })
	public PokemonData poke517() {
		PokemonData data = new PokemonData();
		data.setId(517);
		data.setName("ムンナ");
		data.setFeatures("人や　ポケモンが　見た　夢を　" + "食べる。楽しい　夢を　食べると　" + "ピンク色の　けむりを　吐き出す。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/517.png");
		return data;
	}

	@RequestMapping({ "/pokemon/518", "/pokemon/ムシャーナ", "/pokemon/Musharna" })
	public PokemonData poke518() {
		PokemonData data = new PokemonData();
		data.setId(518);
		data.setName("ムシャーナ");
		data.setFeatures("おでこから　でる　ゆめのけむりは　" + "食べた　夢の　内容によって　" + "さまざまな　色に　変わるのだ。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/518.png");
		return data;
	}

	@RequestMapping({ "/pokemon/519", "/pokemon/マメパト", "/pokemon/Pidove" })
	public PokemonData poke519() {
		PokemonData data = new PokemonData();
		data.setId(519);
		data.setName("マメパト");
		data.setFeatures("街中で　暮らしている　ポケモン。　" + "人懐っこいので　公園や　広場に　" + "たくさん　集まってくる。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/519.png");
		return data;
	}

	@RequestMapping({ "/pokemon/520", "/pokemon/ハトーボー", "/pokemon/Tranquill" })
	public PokemonData poke520() {
		PokemonData data = new PokemonData();
		data.setId(520);
		data.setName("ハトーボー");
		data.setFeatures("世界の　どこに　いても　" + "自分の　巣の　場所は　わかるので　" + "トレーナーとも　はぐれたりしない。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/520.png");
		return data;
	}

	@RequestMapping({ "/pokemon/521", "/pokemon/ケンホロウ", "/pokemon/Unfezant" })
	public PokemonData poke521() {
		PokemonData data = new PokemonData();
		data.setId(521);
		data.setName("ケンホロウ");
		data.setFeatures("オスは　頭に　飾りを　持つ。　" + "トレーナー　以外の　人には　" + "けっして　懐かない　性質。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/521.png");
		return data;
	}

	@RequestMapping({ "/pokemon/522", "/pokemon/シママ", "/pokemon/Blitzle" })
	public PokemonData poke522() {
		PokemonData data = new PokemonData();
		data.setId(522);
		data.setName("シママ");
		data.setFeatures("放電すると　たてがみが　光る。　" + "たてがみが　輝く　回数や　" + "リズムで　仲間と　会話している。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/522.png");
		return data;
	}

	@RequestMapping({ "/pokemon/523", "/pokemon/ゼブライカ", "/pokemon/Zebstrika" })
	public PokemonData poke523() {
		PokemonData data = new PokemonData();
		data.setId(523);
		data.setName("ゼブライカ");
		data.setFeatures("稲妻のような　瞬発力。　" + "ゼブライカが　全速力で　走ると　" + "雷鳴が　響きわたる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/523.png");
		return data;
	}

	@RequestMapping({ "/pokemon/524", "/pokemon/ダンゴロ", "/pokemon/Roggenrola" })
	public PokemonData poke524() {
		PokemonData data = new PokemonData();
		data.setId(524);
		data.setName("ダンゴロ");
		data.setFeatures("１００年前の　大地震のときに　" + "地割れから　発見された。　" + "体内に　エネルギーコアを　持つ。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/524.png");
		return data;
	}

	@RequestMapping({ "/pokemon/525", "/pokemon/ガントル", "/pokemon/Boldore" })
	public PokemonData poke525() {
		PokemonData data = new PokemonData();
		data.setId(525);
		data.setName("ガントル");
		data.setFeatures("元気だと　コアが　飛びだしてくる。　" + "体の　向きを　変えることなく　" + "前後左右に　素早く　動ける。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/525.png");
		return data;
	}

	@RequestMapping({ "/pokemon/526", "/pokemon/ギガイアス", "/pokemon/Gigalith" })
	public PokemonData poke526() {
		PokemonData data = new PokemonData();
		data.setId(526);
		data.setName("ギガイアス");
		data.setFeatures("体内の　コアで　エネルギーを　" + "圧縮して　撃ち出す　攻撃は　" + "山を　吹き飛ばす　威力。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/526.png");
		return data;
	}

	@RequestMapping({ "/pokemon/527", "/pokemon/コロモリ", "/pokemon/Woobat" })
	public PokemonData poke527() {
		PokemonData data = new PokemonData();
		data.setId(527);
		data.setName("コロモリ");
		data.setFeatures("コロモリの　鼻を　押しつけた　" + "ところに　ハート形の　跡がつくと　" + "いいことが　起こると　言われている。");
		data.setType("エスパー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/527.png");
		return data;
	}

	@RequestMapping({ "/pokemon/528", "/pokemon/ココロモリ", "/pokemon/Swoobat" })
	public PokemonData poke528() {
		PokemonData data = new PokemonData();
		data.setId(528);
		data.setName("ココロモリ");
		data.setFeatures("オスが　メスに　求愛するとき　" + "発する　超音波を　浴びると　" + "とても　楽しい　気分になる。");
		data.setType("エスパー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/528.png");
		return data;
	}

	@RequestMapping({ "/pokemon/529", "/pokemon/モグリュー", "/pokemon/Drilbur" })
	public PokemonData poke529() {
		PokemonData data = new PokemonData();
		data.setId(529);
		data.setName("モグリュー");
		data.setFeatures("体を　スピンさせることで　" + "時速５０キロの　スピードのまま　" + "まっすぐ　地面を　掘り進む。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/529.png");
		return data;
	}

	@RequestMapping({ "/pokemon/530", "/pokemon/ドリュウズ", "/pokemon/Excadrill" })
	public PokemonData poke530() {
		PokemonData data = new PokemonData();
		data.setId(530);
		data.setName("ドリュウズ");
		data.setFeatures("地下　１００メートルに　迷路の　" + "ような　巣穴を　作る。地下鉄の　" + "トンネルに　穴を　開けてしまう。");
		data.setType("じめん");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/530.png");
		return data;
	}

	@RequestMapping({ "/pokemon/531", "/pokemon/タブンネ", "/pokemon/Audino" })
	public PokemonData poke531() {
		PokemonData data = new PokemonData();
		data.setId(531);
		data.setName("タブンネ");
		data.setFeatures("耳の　触角で　相手に　触れると　" + "心臓の　音で　" + "体調や　気持ちが　わかるのだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/531.png");
		return data;
	}

	@RequestMapping({ "/pokemon/532", "/pokemon/ドッコラー", "/pokemon/Timburr" })
	public PokemonData poke532() {
		PokemonData data = new PokemonData();
		data.setId(532);
		data.setName("ドッコラー");
		data.setFeatures("常に　角材を　持ち歩き　" + "土木工事を　手伝う。育つと　" + "大きな　角材に　持ち替える。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/532.png");
		return data;
	}

	@RequestMapping({ "/pokemon/533", "/pokemon/ドテッコツ", "/pokemon/Gurdurr" })
	public PokemonData poke533() {
		PokemonData data = new PokemonData();
		data.setId(533);
		data.setName("ドテッコツ");
		data.setFeatures("鍛え上げられた　筋肉の　体は　" + "プロレスラーが　束に　なって　" + "攻撃しても　びくとも　しない。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/533.png");
		return data;
	}

	@RequestMapping({ "/pokemon/534", "/pokemon/ローブシン", "/pokemon/Conkeldurr" })
	public PokemonData poke534() {
		PokemonData data = new PokemonData();
		data.setId(534);
		data.setName("ローブシン");
		data.setFeatures("力に　頼らず　遠心力を　" + "うまく　活かして　コンクリートを　" + "振り回す　技を　使いこなせる。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/534.png");
		return data;
	}

	@RequestMapping({ "/pokemon/535", "/pokemon/オタマロ", "/pokemon/Tympole" })
	public PokemonData poke535() {
		PokemonData data = new PokemonData();
		data.setId(535);
		data.setName("オタマロ");
		data.setFeatures("ほほを　振動させて　" + "人には　聞こえない　音波を　出す。　" + "音波の　リズムで　会話する。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/535.png");
		return data;
	}

	@RequestMapping({ "/pokemon/536", "/pokemon/ガマガル", "/pokemon/Palpitoad" })
	public PokemonData poke536() {
		PokemonData data = new PokemonData();
		data.setId(536);
		data.setName("ガマガル");
		data.setFeatures("水中と　陸地で　暮らす。　" + "長く　ねばねばする　ベロを使って　" + "相手の　動きを　封じこめる。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/536.png");
		return data;
	}

	@RequestMapping({ "/pokemon/537", "/pokemon/ガマゲロゲ", "/pokemon/Seismitoad" })
	public PokemonData poke537() {
		PokemonData data = new PokemonData();
		data.setId(537);
		data.setName("ガマゲロゲ");
		data.setFeatures("頭の　コブから　神経を　マヒさせる　" + "液体を　飛ばす。　" + "振動で　相手を　苦しめる。");
		data.setType("みず");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/537.png");
		return data;
	}

	@RequestMapping({ "/pokemon/538", "/pokemon/ナゲキ", "/pokemon/Throh" })
	public PokemonData poke538() {
		PokemonData data = new PokemonData();
		data.setId(538);
		data.setName("ナゲキ");
		data.setFeatures("自分より　大きな　相手と　" + "出会うと　無性に　投げたくなる。　" + "強くなると　帯を　取り替える。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/538.png");
		return data;
	}

	@RequestMapping({ "/pokemon/539", "/pokemon/ダゲキ", "/pokemon/Sawk" })
	public PokemonData poke539() {
		PokemonData data = new PokemonData();
		data.setId(539);
		data.setName("ダゲキ");
		data.setFeatures("帯を　締めると　気合いが　入り　" + "パンチの　破壊力が　増す。　" + "修行を　ジャマすると　怒る。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/539.png");
		return data;
	}

	@RequestMapping({ "/pokemon/540", "/pokemon/クルミル", "/pokemon/Sewaddle" })
	public PokemonData poke540() {
		PokemonData data = new PokemonData();
		data.setId(540);
		data.setName("クルミル");
		data.setFeatures("葉っぱから　服を　つくるので　" + "ファッションデザイナーから　" + "マスコットとして　人気がある。");
		data.setType("むし");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/540.png");
		return data;
	}

	@RequestMapping({ "/pokemon/541", "/pokemon/クルマユ", "/pokemon/Swadloon" })
	public PokemonData poke541() {
		PokemonData data = new PokemonData();
		data.setId(541);
		data.setName("クルマユ");
		data.setFeatures("葉っぱで　体を　包みこんで　" + "寒さを　防ぐ。手近な　落ち葉を　" + "食べながら　森を　移動する。");
		data.setType("むし");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/541.png");
		return data;
	}

	@RequestMapping({ "/pokemon/542", "/pokemon/ハハコモリ", "/pokemon/Leavanny" })
	public PokemonData poke542() {
		PokemonData data = new PokemonData();
		data.setId(542);
		data.setName("ハハコモリ");
		data.setFeatures("落ち葉が　発酵する　熱で　" + "タマゴを　温める。クルミルに　" + "葉っぱで　おくるみを　作る。");
		data.setType("むし");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/542.png");
		return data;
	}

	@RequestMapping({ "/pokemon/543", "/pokemon/フシデ", "/pokemon/Venipede" })
	public PokemonData poke543() {
		PokemonData data = new PokemonData();
		data.setId(543);
		data.setName("フシデ");
		data.setFeatures("かみついて　猛毒を　与える。　" + "天敵の　大きな　とりポケモンも　" + "体が　しびれて　動けなくなる。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/543.png");
		return data;
	}

	@RequestMapping({ "/pokemon/544", "/pokemon/ホイーガ", "/pokemon/Whirlipede" })
	public PokemonData poke544() {
		PokemonData data = new PokemonData();
		data.setId(544);
		data.setName("ホイーガ");
		data.setFeatures("普段は　動かないが　" + "襲われると　高速　回転して　走り回り　" + "体当たりで　反撃するのだ。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/544.png");
		return data;
	}

	@RequestMapping({ "/pokemon/545", "/pokemon/ペンドラー", "/pokemon/Scolipede" })
	public PokemonData poke545() {
		PokemonData data = new PokemonData();
		data.setId(545);
		data.setName("ペンドラー");
		data.setFeatures("素早い　動きで　敵を　追いつめ　" + "頭の　ツノで　攻撃する。　" + "とどめを　刺すまで　容赦しない。");
		data.setType("むし");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/545.png");
		return data;
	}

	@RequestMapping({ "/pokemon/546", "/pokemon/モンメン", "/pokemon/Cottonee" })
	public PokemonData poke546() {
		PokemonData data = new PokemonData();
		data.setId(546);
		data.setName("モンメン");
		data.setFeatures("集団で　いると　落ち着くのか　" + "仲間を　みつけると　くっついて　" + "いつのまにか　雲のように　なる。");
		data.setType("くさ");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/546.png");
		return data;
	}

	@RequestMapping({ "/pokemon/547", "/pokemon/エルフーン", "/pokemon/Whimsicott" })
	public PokemonData poke547() {
		PokemonData data = new PokemonData();
		data.setId(547);
		data.setName("エルフーン");
		data.setFeatures("どんなに　細い　すきまでも　" + "風のように　潜り抜けてしまう。　" + "白い　毛玉を　残していく。");
		data.setType("くさ");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/547.png");
		return data;
	}

	@RequestMapping({ "/pokemon/548", "/pokemon/チュリネ", "/pokemon/Petilil" })
	public PokemonData poke548() {
		PokemonData data = new PokemonData();
		data.setId(548);
		data.setName("チュリネ");
		data.setFeatures("水分と　栄養の　豊富な　" + "土を　好むので　チュリネの　住む　" + "土地は　作物の　育ちが　良い。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/548.png");
		return data;
	}

	@RequestMapping({ "/pokemon/549", "/pokemon/ドレディア", "/pokemon/Lilligant" })
	public PokemonData poke549() {
		PokemonData data = new PokemonData();
		data.setId(549);
		data.setName("ドレディア");
		data.setFeatures("美しい　花を　咲かせるのは　" + "ベテラントレーナーでも　難しい。　" + "セレブに　人気の　ポケモン。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/549.png");
		return data;
	}

	@RequestMapping({ "/pokemon/550", "/pokemon/バスラオ", "/pokemon/Basculin" })
	public PokemonData poke550() {
		PokemonData data = new PokemonData();
		data.setId(550);
		data.setName("バスラオ");
		data.setFeatures("赤と　青の　バスラオは　仲が　悪いが　" + "なぜか　色の　違う　個体が　" + "群れに　紛れこんでいる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/550.png");
		return data;
	}

	@RequestMapping({ "/pokemon/551", "/pokemon/メグロコ", "/pokemon/Sandile" })
	public PokemonData poke551() {
		PokemonData data = new PokemonData();
		data.setId(551);
		data.setName("メグロコ");
		data.setFeatures("砂漠の　砂の　中で　生活。　" + "太陽に　暖められた　砂が　" + "体温の　低下を　防ぐのだ。");
		data.setType("じめん");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/551.png");
		return data;
	}

	@RequestMapping({ "/pokemon/552", "/pokemon/ワルビル", "/pokemon/Krokorok" })
	public PokemonData poke552() {
		PokemonData data = new PokemonData();
		data.setId(552);
		data.setName("ワルビル");
		data.setFeatures("眼球を　覆う　特殊な　膜が　" + "物体の　熱を　感知するため　" + "暗闇でも　まわりが　見えるのだ。");
		data.setType("じめん");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/552.png");
		return data;
	}

	@RequestMapping({ "/pokemon/553", "/pokemon/ワルビアル", "/pokemon/Krookodile" })
	public PokemonData poke553() {
		PokemonData data = new PokemonData();
		data.setId(553);
		data.setName("ワルビアル");
		data.setFeatures("出会った　獲物は　逃がさない。　" + "自動車の　ボディを　食いちぎる　" + "強力な　アゴを　持つ。");
		data.setType("じめん");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/553.png");
		return data;
	}

	@RequestMapping({ "/pokemon/554", "/pokemon/ダルマッカ", "/pokemon/Darumaka" })
	public PokemonData poke554() {
		PokemonData data = new PokemonData();
		data.setId(554);
		data.setName("ダルマッカ");
		data.setFeatures("寝るときは　手足を　ひっこめ　" + "体内で　燃えている　６００度の　" + "炎も　小さくなり　落ち着くよ。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/554.png");
		return data;
	}

	@RequestMapping({ "/pokemon/555", "/pokemon/ヒヒダルマ", "/pokemon/Darmanitan" })
	public PokemonData poke555() {
		PokemonData data = new PokemonData();
		data.setId(555);
		data.setName("ヒヒダルマ");
		data.setFeatures("体内で　１４００度の　炎を　" + "燃やすことで　ダンプカーを　パンチで　" + "破壊するほどの　パワーを　作る。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/555.png");
		return data;
	}

	@RequestMapping({ "/pokemon/556", "/pokemon/マラカッチ", "/pokemon/Maractus" })
	public PokemonData poke556() {
		PokemonData data = new PokemonData();
		data.setId(556);
		data.setName("マラカッチ");
		data.setFeatures("乾燥した　土地で　暮らす。　" + "体を　リズミカルに　動かすと　" + "マラカスのような　音を　奏でる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/556.png");
		return data;
	}

	@RequestMapping({ "/pokemon/557", "/pokemon/イシズマイ", "/pokemon/Dwebble" })
	public PokemonData poke557() {
		PokemonData data = new PokemonData();
		data.setId(557);
		data.setName("イシズマイ");
		data.setFeatures("てごろな　サイズの　石が　あると　" + "口から　液体を　分泌して　" + "中に　入るための　穴をあける。");
		data.setType("むし");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/557.png");
		return data;
	}

	@RequestMapping({ "/pokemon/558", "/pokemon/イワパレス", "/pokemon/Crustle" })
	public PokemonData poke558() {
		PokemonData data = new PokemonData();
		data.setId(558);
		data.setName("イワパレス");
		data.setFeatures("縄張りを　取り合って　" + "イワパレス　同士が　激しく　戦う。　" + "岩を　壊されたほうが　負け。");
		data.setType("むし");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/558.png");
		return data;
	}

	@RequestMapping({ "/pokemon/559", "/pokemon/ズルッグ", "/pokemon/Scraggy" })
	public PokemonData poke559() {
		PokemonData data = new PokemonData();
		data.setId(559);
		data.setName("ズルッグ");
		data.setFeatures("頑丈な　頭蓋骨が　自慢。　" + "いきなり　頭突きを　かましてくるが　" + "重さで　自分も　フラフラしてる。");
		data.setType("あく");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/559.png");
		return data;
	}

	@RequestMapping({ "/pokemon/560", "/pokemon/ズルズキン", "/pokemon/Scrafty" })
	public PokemonData poke560() {
		PokemonData data = new PokemonData();
		data.setId(560);
		data.setName("ズルズキン");
		data.setFeatures("トサカの　大きさで　グループの　" + "リーダーを　決める。キック攻撃で　" + "コンクリートブロックを　破壊する。");
		data.setType("あく");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/560.png");
		return data;
	}

	@RequestMapping({ "/pokemon/561", "/pokemon/シンボラー", "/pokemon/Sigilyph" })
	public PokemonData poke561() {
		PokemonData data = new PokemonData();
		data.setId(561);
		data.setName("シンボラー");
		data.setFeatures("シンボラーが　飛ぶ　砂漠の下を　" + "調査すると　古代の　都市と　" + "思われる　名残りが　見つかった。");
		data.setType("エスパー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/561.png");
		return data;
	}

	@RequestMapping({ "/pokemon/562", "/pokemon/デスマス", "/pokemon/Yamask" })
	public PokemonData poke562() {
		PokemonData data = new PokemonData();
		data.setId(562);
		data.setName("デスマス");
		data.setFeatures("持っている　マスクは　" + "デスマスが　人間だった　ときの　顔。　" + "たまに　見つめては　泣いている。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/562.png");
		return data;
	}

	@RequestMapping({ "/pokemon/563", "/pokemon/デスカーン", "/pokemon/Cofagrigus" })
	public PokemonData poke563() {
		PokemonData data = new PokemonData();
		data.setId(563);
		data.setName("デスカーン");
		data.setFeatures("本物の　かんおけと　間違え　" + "近寄ってきた　墓ドロボウを　" + "体の　中に　閉じこめてしまう。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/563.png");
		return data;
	}

	@RequestMapping({ "/pokemon/564", "/pokemon/プロトーガ", "/pokemon/Tirtouga" })
	public PokemonData poke564() {
		PokemonData data = new PokemonData();
		data.setId(564);
		data.setName("プロトーガ");
		data.setFeatures("古代の　化石から　復活した。　" + "深さ　１０００メートルまで　" + "潜水することが　できる。");
		data.setType("みず");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/564.png");
		return data;
	}

	@RequestMapping({ "/pokemon/565", "/pokemon/アバゴーラ", "/pokemon/Carracosta" })
	public PokemonData poke565() {
		PokemonData data = new PokemonData();
		data.setId(565);
		data.setName("アバゴーラ");
		data.setFeatures("発達した　前足で　相手を　" + "ひっぱたき　気絶させると　殻や　" + "ホネまで　まるごと　かみくだいた。");
		data.setType("みず");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/565.png");
		return data;
	}

	@RequestMapping({ "/pokemon/566", "/pokemon/アーケン", "/pokemon/Archen" })
	public PokemonData poke566() {
		PokemonData data = new PokemonData();
		data.setId(566);
		data.setName("アーケン");
		data.setFeatures("とりポケモンの　祖先と　言われる。　" + "飛ぶことは　できず　枝から　枝へ　" + "飛び移り　生活していたらしい。");
		data.setType("いわ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/566.png");
		return data;
	}

	@RequestMapping({ "/pokemon/567", "/pokemon/アーケオス", "/pokemon/Archeops" })
	public PokemonData poke567() {
		PokemonData data = new PokemonData();
		data.setId(567);
		data.setName("アーケオス");
		data.setFeatures("飛ぶよりも　走るほうが　得意で　" + "時速４０キロで　駆けぬけた　" + "勢いで　大空に　羽ばたく。");
		data.setType("いわ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/567.png");
		return data;
	}

	@RequestMapping({ "/pokemon/568", "/pokemon/ヤブクロン", "/pokemon/Trubbish" })
	public PokemonData poke568() {
		PokemonData data = new PokemonData();
		data.setId(568);
		data.setName("ヤブクロン");
		data.setFeatures("不衛生な　場所を　好む。　" + "ゲップのように　吐き出す　ガスを　" + "吸いこむと　１週間　寝込む。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/568.png");
		return data;
	}

	@RequestMapping({ "/pokemon/569", "/pokemon/ダストダス", "/pokemon/Garbodor" })
	public PokemonData poke569() {
		PokemonData data = new PokemonData();
		data.setId(569);
		data.setName("ダストダス");
		data.setFeatures("ゴミを　吸いとっては　体内で　" + "新しい　種類の　毒ガスや　" + "毒の　液体を　生みだしている。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/569.png");
		return data;
	}

	@RequestMapping({ "/pokemon/570", "/pokemon/ゾロア", "/pokemon/Zorua" })
	public PokemonData poke570() {
		PokemonData data = new PokemonData();
		data.setId(570);
		data.setName("ゾロア");
		data.setFeatures("人や　ほかの　ポケモンに　化ける。　" + "自分の　正体を　隠すことで　" + "危険から　身を　守っているのだ。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/570.png");
		return data;
	}

	@RequestMapping({ "/pokemon/571", "/pokemon/ゾロアーク", "/pokemon/Zoroark" })
	public PokemonData poke571() {
		PokemonData data = new PokemonData();
		data.setId(571);
		data.setName("ゾロアーク");
		data.setFeatures("相手を　化かす　ことで　群れの　" + "安全を　守ってきた　ポケモン。　" + "仲間同士の　結束が　固い。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/571.png");
		return data;
	}

	@RequestMapping({ "/pokemon/572", "/pokemon/チラーミィ", "/pokemon/Minccino" })
	public PokemonData poke572() {
		PokemonData data = new PokemonData();
		data.setId(572);
		data.setName("チラーミィ");
		data.setFeatures("きれい好きな　性格の　ポケモン。　" + "尻尾を　ほうきがわりに　いつも　" + "住処の　ほこりを　払っている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/572.png");
		return data;
	}

	@RequestMapping({ "/pokemon/573", "/pokemon/チラチーノ", "/pokemon/Cinccino" })
	public PokemonData poke573() {
		PokemonData data = new PokemonData();
		data.setId(573);
		data.setName("チラチーノ");
		data.setFeatures("チラチーノの　体は　特別な　" + "油で　覆われており　パンチなど　" + "相手の　攻撃を　受け流す。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/573.png");
		return data;
	}

	@RequestMapping({ "/pokemon/574", "/pokemon/ゴチム", "/pokemon/Gothita" })
	public PokemonData poke574() {
		PokemonData data = new PokemonData();
		data.setId(574);
		data.setName("ゴチム");
		data.setFeatures("ポケモンや　トレーナーを　じっと　" + "観察する。ゴチムにしか　見えない　" + "なにかを　見つめているらしい。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/574.png");
		return data;
	}

	@RequestMapping({ "/pokemon/575", "/pokemon/ゴチミル", "/pokemon/Gothorita" })
	public PokemonData poke575() {
		PokemonData data = new PokemonData();
		data.setId(575);
		data.setName("ゴチミル");
		data.setFeatures("星明かりが　輝く　夜に　" + "寝ている　子供たちを　操って　" + "遊ぶ　話が　多く　残る。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/575.png");
		return data;
	}

	@RequestMapping({ "/pokemon/576", "/pokemon/ゴチルゼル", "/pokemon/Gothitelle" })
	public PokemonData poke576() {
		PokemonData data = new PokemonData();
		data.setId(576);
		data.setName("ゴチルゼル");
		data.setFeatures("星の　配置や　動きから　未来の　" + "できごとを　予知する　能力を　持つ。　" + "トレーナーの　寿命も　見える。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/576.png");
		return data;
	}

	@RequestMapping({ "/pokemon/577", "/pokemon/ユニラン", "/pokemon/Solosis" })
	public PokemonData poke577() {
		PokemonData data = new PokemonData();
		data.setId(577);
		data.setName("ユニラン");
		data.setFeatures("サイコパワーを　放出して　" + "襲ってきた　敵を　撃退。　" + "テレパシーで　仲間と　会話する。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/577.png");
		return data;
	}

	@RequestMapping({ "/pokemon/578", "/pokemon/ダブラン", "/pokemon/Duosion" })
	public PokemonData poke578() {
		PokemonData data = new PokemonData();
		data.setId(578);
		data.setName("ダブラン");
		data.setFeatures("分裂した　２つの　脳みそで　" + "同じことを　考えると　だせる　" + "サイコパワーは　最高と　なる。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/578.png");
		return data;
	}

	@RequestMapping({ "/pokemon/579", "/pokemon/ランクルス", "/pokemon/Reuniclus" })
	public PokemonData poke579() {
		PokemonData data = new PokemonData();
		data.setId(579);
		data.setName("ランクルス");
		data.setFeatures("ランクルス　同士が　握手すると　" + "脳みそが　ネットワークで　つながり　" + "サイコパワーが　増幅されるのだ。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/579.png");
		return data;
	}

	@RequestMapping({ "/pokemon/580", "/pokemon/コアルヒー", "/pokemon/Ducklett" })
	public PokemonData poke580() {
		PokemonData data = new PokemonData();
		data.setId(580);
		data.setName("コアルヒー");
		data.setFeatures("飛ぶよりも　泳ぐのが　得意で　" + "水中に　潜っては　大好きな　" + "水ゴケを　うれしそうに　食べる。");
		data.setType("みず");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/580.png");
		return data;
	}

	@RequestMapping({ "/pokemon/581", "/pokemon/スワンナ", "/pokemon/Swanna" })
	public PokemonData poke581() {
		PokemonData data = new PokemonData();
		data.setId(581);
		data.setName("スワンナ");
		data.setFeatures("夜明けと　ともに　スワンナたちは　" + "踊りはじめる。真ん中で　踊る　" + "スワンナが　群れの　リーダー。");
		data.setType("みず");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/581.png");
		return data;
	}

	@RequestMapping({ "/pokemon/582", "/pokemon/バニプッチ", "/pokemon/Vanillite" })
	public PokemonData poke582() {
		PokemonData data = new PokemonData();
		data.setId(582);
		data.setName("バニプッチ");
		data.setFeatures("朝日の　エネルギーを　浴びた　" + "つららが　ポケモンに　なった。　" + "雪に　体を　埋めて　眠る。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/582.png");
		return data;
	}

	@RequestMapping({ "/pokemon/583", "/pokemon/バニリッチ", "/pokemon/Vanillish" })
	public PokemonData poke583() {
		PokemonData data = new PokemonData();
		data.setId(583);
		data.setName("バニリッチ");
		data.setFeatures("雪山に　生息する　ポケモン。　" + "大昔　氷河期の　ときに　" + "南の　土地に　移動してきた。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/583.png");
		return data;
	}

	@RequestMapping({ "/pokemon/584", "/pokemon/バイバニラ", "/pokemon/Vanilluxe" })
	public PokemonData poke584() {
		PokemonData data = new PokemonData();
		data.setId(584);
		data.setName("バイバニラ");
		data.setFeatures("大量の　水を　飲みこんで　" + "体の中で　雪雲に　変える。　" + "怒ると　猛吹雪を　まきおこす。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/584.png");
		return data;
	}

	@RequestMapping({ "/pokemon/585", "/pokemon/シキジカ", "/pokemon/Deerling" })
	public PokemonData poke585() {
		PokemonData data = new PokemonData();
		data.setId(585);
		data.setName("シキジカ");
		data.setFeatures("季節の　変わり目に　なると　" + "体毛と　においが　変化する。　" + "季節を　告げる　ポケモン。");
		data.setType("ノーマル");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/585.png");
		return data;
	}

	@RequestMapping({ "/pokemon/586", "/pokemon/メブキジカ", "/pokemon/Sawsbuck" })
	public PokemonData poke586() {
		PokemonData data = new PokemonData();
		data.setId(586);
		data.setName("メブキジカ");
		data.setFeatures("季節の　移り変わりと　ともに　" + "住処を　変えるので　メブキジカが　" + "春を運ぶと　いう　人もいる。");
		data.setType("ノーマル");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/586.png");
		return data;
	}

	@RequestMapping({ "/pokemon/587", "/pokemon/エモンガ", "/pokemon/Emolga" })
	public PokemonData poke587() {
		PokemonData data = new PokemonData();
		data.setId(587);
		data.setName("エモンガ");
		data.setFeatures("ほほの　電気袋で　作った　電気を　" + "膜の　内側に　ためて　" + "滑空しながら　電気を　放つ。");
		data.setType("でんき");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/587.png");
		return data;
	}

	@RequestMapping({ "/pokemon/588", "/pokemon/カブルモ", "/pokemon/Karrablast" })
	public PokemonData poke588() {
		PokemonData data = new PokemonData();
		data.setId(588);
		data.setName("カブルモ");
		data.setFeatures("チョボマキを　襲っているときに　" + "電気エネルギーを　浴びると　" + "なぜだか　進化　してしまうのだ。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/588.png");
		return data;
	}

	@RequestMapping({ "/pokemon/589", "/pokemon/シュバルゴ", "/pokemon/Escavalier" })
	public PokemonData poke589() {
		PokemonData data = new PokemonData();
		data.setId(589);
		data.setName("シュバルゴ");
		data.setFeatures("チョボマキの　殻を　身につけて　" + "進化した　ポケモン。鋼鉄の　よろいが　" + "全身を　ガードする。");
		data.setType("むし");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/589.png");
		return data;
	}

	@RequestMapping({ "/pokemon/590", "/pokemon/タマゲタケ", "/pokemon/Foongus" })
	public PokemonData poke590() {
		PokemonData data = new PokemonData();
		data.setId(590);
		data.setName("タマゲタケ");
		data.setFeatures("モンスターボール　そっくりの　" + "模様で　ポケモンを　誘いこみ　" + "毒の胞子を　吹きかけてくる。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/590.png");
		return data;
	}

	@RequestMapping({ "/pokemon/591", "/pokemon/モロバレル", "/pokemon/Amoonguss" })
	public PokemonData poke591() {
		PokemonData data = new PokemonData();
		data.setId(591);
		data.setName("モロバレル");
		data.setFeatures("両腕の　モンスターボールに　似た　" + "カサを　ゆらゆらと　動かして　" + "獲物を　誘う　ダンスを　踊る。");
		data.setType("くさ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/591.png");
		return data;
	}

	@RequestMapping({ "/pokemon/592", "/pokemon/プルリル", "/pokemon/Frillish" })
	public PokemonData poke592() {
		PokemonData data = new PokemonData();
		data.setId(592);
		data.setName("プルリル");
		data.setFeatures("ベールの　ような　手足を　巻きつけ　" + "しびれさせると　８０００メートルの　" + "深海に　連れこんで　殺すのだ。");
		data.setType("みず");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/592.png");
		return data;
	}

	@RequestMapping({ "/pokemon/593", "/pokemon/ブルンゲル", "/pokemon/Jellicent" })
	public PokemonData poke593() {
		PokemonData data = new PokemonData();
		data.setId(593);
		data.setName("ブルンゲル");
		data.setFeatures("ブルンゲルの　住処に　迷いこんだ　" + "船は　沈められて　乗組員の　命は　" + "吸い取られて　しまうのだ。");
		data.setType("みず");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/593.png");
		return data;
	}

	@RequestMapping({ "/pokemon/594", "/pokemon/ママンボウ", "/pokemon/Alomomola" })
	public PokemonData poke594() {
		PokemonData data = new PokemonData();
		data.setId(594);
		data.setName("ママンボウ");
		data.setFeatures("傷ついたり　弱った　ポケモンを　" + "ヒレで　優しく　抱えながら　" + "特殊な　粘膜で　治すのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/594.png");
		return data;
	}

	@RequestMapping({ "/pokemon/595", "/pokemon/バチュル", "/pokemon/Joltik" })
	public PokemonData poke595() {
		PokemonData data = new PokemonData();
		data.setId(595);
		data.setName("バチュル");
		data.setFeatures("体の　大きな　ポケモンに　とりついて　" + "静電気を　吸い取り　" + "蓄電袋に　電気を　ためる。");
		data.setType("むし");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/595.png");
		return data;
	}

	@RequestMapping({ "/pokemon/596", "/pokemon/デンチュラ", "/pokemon/Galvantula" })
	public PokemonData poke596() {
		PokemonData data = new PokemonData();
		data.setId(596);
		data.setName("デンチュラ");
		data.setFeatures("敵に　襲われると　電気を　帯びた　" + "糸を　たくさん　吐き出して　" + "電気の　バリアを　作る。");
		data.setType("むし");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/596.png");
		return data;
	}

	@RequestMapping({ "/pokemon/597", "/pokemon/テッシード", "/pokemon/Ferroseed" })
	public PokemonData poke597() {
		PokemonData data = new PokemonData();
		data.setId(597);
		data.setName("テッシード");
		data.setFeatures("洞穴の　天井に　突きささり　" + "岩の　鉄分を　吸いとる。　" + "危険がせまると　トゲを　撃ち出す。");
		data.setType("くさ");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/597.png");
		return data;
	}

	@RequestMapping({ "/pokemon/598", "/pokemon/ナットレイ", "/pokemon/Ferrothorn" })
	public PokemonData poke598() {
		PokemonData data = new PokemonData();
		data.setId(598);
		data.setName("ナットレイ");
		data.setFeatures("洞穴の　天井に　はりつき　" + "下を　通る　獲物に　向かって　" + "鉄の　トゲを　打ちこみ　襲う。");
		data.setType("くさ");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/598.png");
		return data;
	}

	@RequestMapping({ "/pokemon/599", "/pokemon/ギアル", "/pokemon/Klink" })
	public PokemonData poke599() {
		PokemonData data = new PokemonData();
		data.setId(599);
		data.setName("ギアル");
		data.setFeatures("２つの　体は　組み合わせが　" + "決まっている。別の　体とは　" + "かみ合わずに　離れてしまう。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/599.png");
		return data;
	}

	@RequestMapping({ "/pokemon/600", "/pokemon/ギギアル", "/pokemon/Klang" })
	public PokemonData poke600() {
		PokemonData data = new PokemonData();
		data.setId(600);
		data.setName("ギギアル");
		data.setFeatures("ちびギアと　でかギアに　わかれた。　" + "攻撃のため　飛ばした　ちびギアが　" + "戻ってこないと　死んでしまう。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/600.png");
		return data;
	}

	@RequestMapping({ "/pokemon/601", "/pokemon/ギギギアル", "/pokemon/Klinklang" })
	public PokemonData poke601() {
		PokemonData data = new PokemonData();
		data.setId(601);
		data.setName("ギギギアル");
		data.setFeatures("赤い　コアは　エネルギータンクの　" + "役割。チャージした　エネルギーを　" + "トゲから　周囲に　撃ち出す。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/601.png");
		return data;
	}

	@RequestMapping({ "/pokemon/602", "/pokemon/シビシラス", "/pokemon/Tynamo" })
	public PokemonData poke602() {
		PokemonData data = new PokemonData();
		data.setId(602);
		data.setName("シビシラス");
		data.setFeatures("弱い　電気しか　だせないので　" + "たくさんの　シビシラスで　集まり　" + "強力な　電気を　放つ。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/602.png");
		return data;
	}

	@RequestMapping({ "/pokemon/603", "/pokemon/シビビール", "/pokemon/Eelektrik" })
	public PokemonData poke603() {
		PokemonData data = new PokemonData();
		data.setId(603);
		data.setName("シビビール");
		data.setFeatures("食欲　旺盛な　ポケモン。　" + "獲物を　見つけると　襲いかかり　" + "電気で　しびれさせてから　食べる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/603.png");
		return data;
	}

	@RequestMapping({ "/pokemon/604", "/pokemon/シビルドン", "/pokemon/Eelektross" })
	public PokemonData poke604() {
		PokemonData data = new PokemonData();
		data.setId(604);
		data.setName("シビルドン");
		data.setFeatures("腕の　力で　海から　はい出し　" + "水辺の　獲物に　襲いかかる。　" + "一瞬で　海へ　引きずりこむ。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/604.png");
		return data;
	}

	@RequestMapping({ "/pokemon/605", "/pokemon/リグレー", "/pokemon/Elgyem" })
	public PokemonData poke605() {
		PokemonData data = new PokemonData();
		data.setId(605);
		data.setName("リグレー");
		data.setFeatures("５０年前　ＵＦＯが　" + "墜落したと　うわさされる　" + "砂漠から　やってきたと　いわれる。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/605.png");
		return data;
	}

	@RequestMapping({ "/pokemon/606", "/pokemon/オーベム", "/pokemon/Beheeyem" })
	public PokemonData poke606() {
		PokemonData data = new PokemonData();
		data.setId(606);
		data.setName("オーベム");
		data.setFeatures("サイコパワーで　相手の　脳みそを　" + "操り　記憶する　映像を　" + "違う　ものに　書き換えてしまう。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/606.png");
		return data;
	}

	@RequestMapping({ "/pokemon/607", "/pokemon/ヒトモシ", "/pokemon/Litwick" })
	public PokemonData poke607() {
		PokemonData data = new PokemonData();
		data.setId(607);
		data.setName("ヒトモシ");
		data.setFeatures("ヒトモシの　灯す　明かりは　" + "人や　ポケモンの　生命力を　" + "吸い取って　燃えているのだ。");
		data.setType("ゴースト");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/607.png");
		return data;
	}

	@RequestMapping({ "/pokemon/608", "/pokemon/ランプラー", "/pokemon/Lampent" })
	public PokemonData poke608() {
		PokemonData data = new PokemonData();
		data.setId(608);
		data.setName("ランプラー");
		data.setFeatures("臨終の　際に　現れて　" + "魂が　肉体を　離れると　" + "すかさず　吸い取ってしまうのだ。");
		data.setType("ゴースト");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/608.png");
		return data;
	}

	@RequestMapping({ "/pokemon/609", "/pokemon/シャンデラ", "/pokemon/Chandelure" })
	public PokemonData poke609() {
		PokemonData data = new PokemonData();
		data.setId(609);
		data.setName("シャンデラ");
		data.setFeatures("怪しげな　炎で　燃やされた　" + "魂は　行き場を　なくし　" + "この　世を　永遠に　さまよう。");
		data.setType("ゴースト");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/609.png");
		return data;
	}

	@RequestMapping({ "/pokemon/610", "/pokemon/キバゴ", "/pokemon/Axew" })
	public PokemonData poke610() {
		PokemonData data = new PokemonData();
		data.setId(610);
		data.setName("キバゴ");
		data.setFeatures("キバで　樹木に　傷を　つけて　" + "縄張りの　目印にする。　" + "キバは　折れても　すぐに　生える。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/610.png");
		return data;
	}

	@RequestMapping({ "/pokemon/611", "/pokemon/オノンド", "/pokemon/Fraxure" })
	public PokemonData poke611() {
		PokemonData data = new PokemonData();
		data.setId(611);
		data.setName("オノンド");
		data.setFeatures("キバは　二度と　生え変わらないので　" + "戦い終わると　川原の　岩を　" + "使って　丹念に　磨きあげる。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/611.png");
		return data;
	}

	@RequestMapping({ "/pokemon/612", "/pokemon/オノノクス", "/pokemon/Haxorus" })
	public PokemonData poke612() {
		PokemonData data = new PokemonData();
		data.setId(612);
		data.setName("オノノクス");
		data.setFeatures("鉄骨を　切りつけても　刃こぼれ　" + "しない　頑丈な　キバを　持つ。　" + "硬い　よろいに　覆われている。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/612.png");
		return data;
	}

	@RequestMapping({ "/pokemon/613", "/pokemon/クマシュン", "/pokemon/Cubchoo" })
	public PokemonData poke613() {
		PokemonData data = new PokemonData();
		data.setId(613);
		data.setName("クマシュン");
		data.setFeatures("鼻水は　健康の　バロメータ。　" + "調子が　いいと　粘り強くなり　" + "氷の　技の　威力も　増す。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/613.png");
		return data;
	}

	@RequestMapping({ "/pokemon/614", "/pokemon/ツンベアー", "/pokemon/Beartic" })
	public PokemonData poke614() {
		PokemonData data = new PokemonData();
		data.setId(614);
		data.setName("ツンベアー");
		data.setFeatures("吐く　息を　凍らせて　氷の　キバや　" + "ツメを　作り　戦う。　" + "北の　寒い　土地で　暮らす。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/614.png");
		return data;
	}

	@RequestMapping({ "/pokemon/615", "/pokemon/フリージオ", "/pokemon/Cryogonal" })
	public PokemonData poke615() {
		PokemonData data = new PokemonData();
		data.setId(615);
		data.setName("フリージオ");
		data.setFeatures("氷の　結晶で　できた　" + "鎖を使い　獲物を　絡め取り　" + "マイナス１００度に　凍らせる。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/615.png");
		return data;
	}

	@RequestMapping({ "/pokemon/616", "/pokemon/チョボマキ", "/pokemon/Shelmet" })
	public PokemonData poke616() {
		PokemonData data = new PokemonData();
		data.setId(616);
		data.setName("チョボマキ");
		data.setFeatures("カブルモと　ともに　電気的な　" + "エネルギーを　浴びると　進化する。　" + "理由は　解明されていない。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/616.png");
		return data;
	}

	@RequestMapping({ "/pokemon/617", "/pokemon/アギルダー", "/pokemon/Accelgor" })
	public PokemonData poke617() {
		PokemonData data = new PokemonData();
		data.setId(617);
		data.setName("アギルダー");
		data.setFeatures("体が　乾くと　弱ってしまう。　" + "薄い　膜を　何重も　巻いて　" + "乾燥を　防いでいるのだ。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/617.png");
		return data;
	}

	@RequestMapping({ "/pokemon/618", "/pokemon/マッギョ", "/pokemon/Stunfisk" })
	public PokemonData poke618() {
		PokemonData data = new PokemonData();
		data.setId(618);
		data.setName("マッギョ");
		data.setFeatures("海辺の　泥に　埋まって　獲物を　" + "待ち構える。獲物が　触ったとき　" + "電気を　出して　しびれさせるのだ。");
		data.setType("じめん");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/618.png");
		return data;
	}

	@RequestMapping({ "/pokemon/619", "/pokemon/コジョフー", "/pokemon/Mienfoo" })
	public PokemonData poke619() {
		PokemonData data = new PokemonData();
		data.setId(619);
		data.setName("コジョフー");
		data.setFeatures("流れるような　連続　攻撃を　" + "繰り出して　敵を　圧倒する。　" + "鋭い　ツメで　敵を　切り裂く。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/619.png");
		return data;
	}

	@RequestMapping({ "/pokemon/620", "/pokemon/コジョンド", "/pokemon/Mienshao" })
	public PokemonData poke620() {
		PokemonData data = new PokemonData();
		data.setId(620);
		data.setName("コジョンド");
		data.setFeatures("両手の　体毛を　ムチのように　" + "使いこなし　連続攻撃を　" + "はじめると　だれにも　止められない。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/620.png");
		return data;
	}

	@RequestMapping({ "/pokemon/621", "/pokemon/クリムガン", "/pokemon/Druddigon" })
	public PokemonData poke621() {
		PokemonData data = new PokemonData();
		data.setId(621);
		data.setName("クリムガン");
		data.setFeatures("日光を　翼で　受けて　体を　温める。　" + "体温が　下がると　" + "動けなくなってしまう。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/621.png");
		return data;
	}

	@RequestMapping({ "/pokemon/622", "/pokemon/ゴビット", "/pokemon/Golett" })
	public PokemonData poke622() {
		PokemonData data = new PokemonData();
		data.setId(622);
		data.setName("ゴビット");
		data.setFeatures("古代の　科学力に　よって　" + "粘土から　つくられた　ポケモン。　" + "数千年　動き続ける。");
		data.setType("じめん");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/622.png");
		return data;
	}

	@RequestMapping({ "/pokemon/623", "/pokemon/ゴルーグ", "/pokemon/Golurk" })
	public PokemonData poke623() {
		PokemonData data = new PokemonData();
		data.setId(623);
		data.setName("ゴルーグ");
		data.setFeatures("マッハの　スピードで　空を　飛ぶ。　" + "胸の　封印を　はがすと　" + "エネルギーが　暴走してしまう。");
		data.setType("じめん");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/623.png");
		return data;
	}

	@RequestMapping({ "/pokemon/624", "/pokemon/コマタナ", "/pokemon/Pawniard" })
	public PokemonData poke624() {
		PokemonData data = new PokemonData();
		data.setId(624);
		data.setName("コマタナ");
		data.setFeatures("自分が　傷ついても　気にせず　" + "集団で　全身の　刃物を　" + "食いこませ　相手を　攻撃する。");
		data.setType("あく");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/624.png");
		return data;
	}

	@RequestMapping({ "/pokemon/625", "/pokemon/キリキザン", "/pokemon/Bisharp" })
	public PokemonData poke625() {
		PokemonData data = new PokemonData();
		data.setId(625);
		data.setName("キリキザン");
		data.setFeatures("大勢の　コマタナを　従えて　" + "獲物を　群れで　追いつめる。　" + "とどめは　キリキザンが　刺す。");
		data.setType("あく");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/625.png");
		return data;
	}

	@RequestMapping({ "/pokemon/626", "/pokemon/バッフロン", "/pokemon/Bouffalant" })
	public PokemonData poke626() {
		PokemonData data = new PokemonData();
		data.setId(626);
		data.setName("バッフロン");
		data.setFeatures("激しい　頭突きを　食らわせても　" + "ふさふさの　体毛が　" + "ダメージを　吸収して　くれるのだ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/626.png");
		return data;
	}

	@RequestMapping({ "/pokemon/627", "/pokemon/ワシボン", "/pokemon/Rufflet" })
	public PokemonData poke627() {
		PokemonData data = new PokemonData();
		data.setId(627);
		data.setName("ワシボン");
		data.setFeatures("強い　相手にも　見境なく　戦いを　" + "挑む。戦いを　繰り返す　ことで　" + "強くなるのだ。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/627.png");
		return data;
	}

	@RequestMapping({ "/pokemon/628", "/pokemon/ウォーグル", "/pokemon/Braviary" })
	public PokemonData poke628() {
		PokemonData data = new PokemonData();
		data.setId(628);
		data.setName("ウォーグル");
		data.setFeatures("仲間のため　危険を　かえりみず　" + "戦う。自動車を　つかんだまま　" + "大空を　舞う　ことが　できる。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/628.png");
		return data;
	}

	@RequestMapping({ "/pokemon/629", "/pokemon/バルチャイ", "/pokemon/Vullaby" })
	public PokemonData poke629() {
		PokemonData data = new PokemonData();
		data.setId(629);
		data.setName("バルチャイ");
		data.setFeatures("翼は　小さく　まだ　飛べない。　" + "バルジーナが　集めてきた　" + "ガイコツで　お尻を　守っている。");
		data.setType("あく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/629.png");
		return data;
	}

	@RequestMapping({ "/pokemon/630", "/pokemon/バルジーナ", "/pokemon/Mandibuzz" })
	public PokemonData poke630() {
		PokemonData data = new PokemonData();
		data.setId(630);
		data.setName("バルジーナ");
		data.setFeatures("空から　地上を　観察して　" + "弱った　獲物に　襲いかかる。　" + "骨で　着飾る　習性。");
		data.setType("あく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/630.png");
		return data;
	}

	@RequestMapping({ "/pokemon/631", "/pokemon/クイタラン", "/pokemon/Heatmor" })
	public PokemonData poke631() {
		PokemonData data = new PokemonData();
		data.setId(631);
		data.setName("クイタラン");
		data.setFeatures("尻尾から　取りこんだ　空気を　" + "炎に変えて　ベロのように　使い　" + "アイアントを　溶かして　食べるぞ。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/631.png");
		return data;
	}

	@RequestMapping({ "/pokemon/632", "/pokemon/アイアント", "/pokemon/Durant" })
	public PokemonData poke632() {
		PokemonData data = new PokemonData();
		data.setId(632);
		data.setName("アイアント");
		data.setFeatures("鋼の　よろいを　身にまとう。　" + "天敵の　クイタランの　攻撃を　" + "集団で　防ぎ　反撃する。");
		data.setType("むし");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/632.png");
		return data;
	}

	@RequestMapping({ "/pokemon/633", "/pokemon/モノズ", "/pokemon/Deino" })
	public PokemonData poke633() {
		PokemonData data = new PokemonData();
		data.setId(633);
		data.setName("モノズ");
		data.setFeatures("まわりの　様子が　わからないので　" + "手当り次第に　ぶつかっては　" + "動くものに　かみつき　食べまくる。");
		data.setType("あく");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/633.png");
		return data;
	}

	@RequestMapping({ "/pokemon/634", "/pokemon/ジヘッド", "/pokemon/Zweilous" })
	public PokemonData poke634() {
		PokemonData data = new PokemonData();
		data.setId(634);
		data.setName("ジヘッド");
		data.setFeatures("縄張りの　エサを　食べつくすと　" + "ほかの　土地へ　移動する。　" + "２つの　頭は　仲が　悪い。");
		data.setType("あく");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/634.png");
		return data;
	}

	@RequestMapping({ "/pokemon/635", "/pokemon/サザンドラ", "/pokemon/Hydreigon" })
	public PokemonData poke635() {
		PokemonData data = new PokemonData();
		data.setId(635);
		data.setName("サザンドラ");
		data.setFeatures("動く　ものに　反応して　" + "襲いかかり　３つの　頭で　" + "食らいつくす　恐ろしい　ポケモン。");
		data.setType("あく");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/635.png");
		return data;
	}

	@RequestMapping({ "/pokemon/636", "/pokemon/メラルバ", "/pokemon/Larvesta" })
	public PokemonData poke636() {
		PokemonData data = new PokemonData();
		data.setId(636);
		data.setName("メラルバ");
		data.setFeatures("火山の　ふもとに　生息する。　" + "５本の　ツノから　炎を　出して　" + "襲ってきた　敵を　撃退する。");
		data.setType("むし");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/636.png");
		return data;
	}

	@RequestMapping({ "/pokemon/637", "/pokemon/ウルガモス", "/pokemon/Volcarona" })
	public PokemonData poke637() {
		PokemonData data = new PokemonData();
		data.setId(637);
		data.setName("ウルガモス");
		data.setFeatures("火山灰で　地上が　真っ暗に　" + "なったとき　ウルガモスの　炎が　" + "太陽の　かわりに　なったという。");
		data.setType("むし");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/637.png");
		return data;
	}

	@RequestMapping({ "/pokemon/638", "/pokemon/コバルオン", "/pokemon/Cobalion" })
	public PokemonData poke638() {
		PokemonData data = new PokemonData();
		data.setId(638);
		data.setName("コバルオン");
		data.setFeatures("鋼の　心と　体を　持つ。　" + "人が　ポケモンを　傷つけたとき　" + "仲間とともに　人を　こらしめた。");
		data.setType("はがね");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/638.png");
		return data;
	}

	@RequestMapping({ "/pokemon/639", "/pokemon/テラキオン", "/pokemon/Terrakion" })
	public PokemonData poke639() {
		PokemonData data = new PokemonData();
		data.setId(639);
		data.setName("テラキオン");
		data.setFeatures("伝説で　語られる　ポケモン。　" + "ポケモンを　守るため　自慢の　" + "パワーで　城を　壊した。");
		data.setType("いわ");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/639.png");
		return data;
	}

	@RequestMapping({ "/pokemon/640", "/pokemon/ビリジオン", "/pokemon/Virizion" })
	public PokemonData poke640() {
		PokemonData data = new PokemonData();
		data.setId(640);
		data.setName("ビリジオン");
		data.setFeatures("素早い　身のこなしで　相手を　" + "翻弄して　ポケモンを　守ると　" + "伝説で　伝えられている。");
		data.setType("くさ");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/640.png");
		return data;
	}

	@RequestMapping({ "/pokemon/641", "/pokemon/トルネロス", "/pokemon/Tornadus" })
	public PokemonData poke641() {
		PokemonData data = new PokemonData();
		data.setId(641);
		data.setName("トルネロス");
		data.setFeatures("トルネロスの　尻尾から　噴き出した　" + "エネルギーが　大嵐を　起こす。　" + "民家を　吹き飛ばす　パワー。");
		data.setType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/641.png");
		return data;
	}

	@RequestMapping({ "/pokemon/642", "/pokemon/ボルトロス", "/pokemon/Thundurus" })
	public PokemonData poke642() {
		PokemonData data = new PokemonData();
		data.setId(642);
		data.setName("ボルトロス");
		data.setFeatures("大空を　飛び回りながら　" + "あちこちに　雷を　落として　" + "山火事を　起こすので　嫌われる。");
		data.setType("でんき");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/642.png");
		return data;
	}

	@RequestMapping({ "/pokemon/643", "/pokemon/レシラム", "/pokemon/Reshiram" })
	public PokemonData poke643() {
		PokemonData data = new PokemonData();
		data.setId(643);
		data.setName("レシラム");
		data.setFeatures("レシラムの　尻尾が　燃えると　" + "熱エネルギーで　大気が　動いて　" + "世界の　天気が　変化する。");
		data.setType("ドラゴン");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/643.png");
		return data;
	}

	@RequestMapping({ "/pokemon/644", "/pokemon/ゼクロム", "/pokemon/Zekrom" })
	public PokemonData poke644() {
		PokemonData data = new PokemonData();
		data.setId(644);
		data.setName("ゼクロム");
		data.setFeatures("尻尾で　電気を　作り出す。　" + "全身を　雷雲に　隠して　" + "イッシュ地方の　空を　飛ぶ。");
		data.setType("ドラゴン");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/644.png");
		return data;
	}

	@RequestMapping({ "/pokemon/645", "/pokemon/ランドロス", "/pokemon/Landorus" })
	public PokemonData poke645() {
		PokemonData data = new PokemonData();
		data.setId(645);
		data.setName("ランドロス");
		data.setFeatures("風や　雷を　取りこみ　変えた　" + "エネルギーが　土に　栄養を　" + "与えて　大地を　豊かに　する。");
		data.setType("じめん");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/645.png");
		return data;
	}

	@RequestMapping({ "/pokemon/646", "/pokemon/キュレム", "/pokemon/Kyurem" })
	public PokemonData poke646() {
		PokemonData data = new PokemonData();
		data.setId(646);
		data.setName("キュレム");
		data.setFeatures("強力な　冷凍エネルギーを　" + "体内で　作り出すが　漏れ出した　" + "冷気で　体が　凍っている。");
		data.setType("ドラゴン");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/646.png");
		return data;
	}

	@RequestMapping({ "/pokemon/647", "/pokemon/ケルディオ", "/pokemon/Keldeo" })
	public PokemonData poke647() {
		PokemonData data = new PokemonData();
		data.setId(647);
		data.setName("ケルディオ");
		data.setFeatures("覚悟を　決めることで　全身に　" + "力が　みなぎって　素早くなり　" + "飛び跳ねると　残像が　みえる。");
		data.setType("みず");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/647.png");
		return data;
	}

	@RequestMapping({ "/pokemon/648", "/pokemon/メロエッタ", "/pokemon/Meloetta" })
	public PokemonData poke648() {
		PokemonData data = new PokemonData();
		data.setId(648);
		data.setName("メロエッタ");
		data.setFeatures("特殊な　発声法で　歌う　メロディは　" + "聞いた者の　感情を　" + "自在に　操る。");
		data.setType("ノーマル");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/648.png");
		return data;
	}

	@RequestMapping({ "/pokemon/649", "/pokemon/ゲノセクト", "/pokemon/Genesect" })
	public PokemonData poke649() {
		PokemonData data = new PokemonData();
		data.setId(649);
		data.setName("ゲノセクト");
		data.setFeatures("３億年前に　いた　ポケモン。　" + "プラズマ団に　改造　され　" + "背中に　砲台を　つけられた。");
		data.setType("むし");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/649.png");
		return data;
	}

	@RequestMapping({ "/pokemon/650", "/pokemon/ハリマロン", "/pokemon/Chespin" })
	public PokemonData poke650() {
		PokemonData data = new PokemonData();
		data.setId(650);
		data.setName("ハリマロン");
		data.setFeatures("頭と　背中を　硬い　樹木の　殻で　" + "覆われているため　トラックが　" + "ぶつかってきても　平気なのだ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/650.png");
		return data;
	}

	@RequestMapping({ "/pokemon/651", "/pokemon/ハリボーグ", "/pokemon/Quilladin" })
	public PokemonData poke651() {
		PokemonData data = new PokemonData();
		data.setId(651);
		data.setName("ハリボーグ");
		data.setFeatures("仲間同士で　体を　ぶつけ合い　" + "足腰を　鍛える。　" + "自分からは　戦わない　優しい　性格。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/651.png");
		return data;
	}

	@RequestMapping({ "/pokemon/652", "/pokemon/ブリガロン", "/pokemon/Chesnaught" })
	public PokemonData poke652() {
		PokemonData data = new PokemonData();
		data.setId(652);
		data.setName("ブリガロン");
		data.setFeatures("顔の　前で　こぶしを　合わせて　" + "防御の　ポーズを　とると　" + "爆弾の　直撃も　耐える。");
		data.setType("くさ");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/652.png");
		return data;
	}

	@RequestMapping({ "/pokemon/653", "/pokemon/フォッコ", "/pokemon/Fennekin" })
	public PokemonData poke653() {
		PokemonData data = new PokemonData();
		data.setId(653);
		data.setName("フォッコ");
		data.setFeatures("小枝を　持ち歩き　おやつがわりに　" + "ポリポリ　食べる。耳から　熱気を　" + "噴き出して　相手を　威嚇する。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/653.png");
		return data;
	}

	@RequestMapping({ "/pokemon/654", "/pokemon/テールナー", "/pokemon/Braixen" })
	public PokemonData poke654() {
		PokemonData data = new PokemonData();
		data.setId(654);
		data.setName("テールナー");
		data.setFeatures("木の枝を　尻尾から　引き抜くとき　" + "摩擦で　着火。枝の　炎を　振って　" + "仲間に　合図を　送る。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/654.png");
		return data;
	}

	@RequestMapping({ "/pokemon/655", "/pokemon/マフォクシー", "/pokemon/Delphox" })
	public PokemonData poke655() {
		PokemonData data = new PokemonData();
		data.setId(655);
		data.setName("マフォクシー");
		data.setFeatures("摂氏３０００度の　炎の　渦を　" + "超能力で　操る。　" + "敵を　渦で　包み　焼きつくす。");
		data.setType("ほのお");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/655.png");
		return data;
	}

	@RequestMapping({ "/pokemon/656", "/pokemon/ケロマツ", "/pokemon/Froakie" })
	public PokemonData poke656() {
		PokemonData data = new PokemonData();
		data.setId(656);
		data.setName("ケロマツ");
		data.setFeatures("繊細な　泡で　体を　包み　" + "肌を　守る。のんきに　見せかけて　" + "抜け目なく　周囲を　うかがう。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/656.png");
		return data;
	}

	@RequestMapping({ "/pokemon/657", "/pokemon/ゲコガシラ", "/pokemon/Frogadier" })
	public PokemonData poke657() {
		PokemonData data = new PokemonData();
		data.setId(657);
		data.setName("ゲコガシラ");
		data.setFeatures("身軽さは　だれにも　負けない。　" + "６００メートルを　超える　タワーの　" + "天辺まで　１分で　登りきる。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/657.png");
		return data;
	}

	@RequestMapping({ "/pokemon/658", "/pokemon/ゲッコウガ", "/pokemon/Greninja" })
	public PokemonData poke658() {
		PokemonData data = new PokemonData();
		data.setId(658);
		data.setName("ゲッコウガ");
		data.setFeatures("忍者のように　神出鬼没。　" + "素早い　動きで　翻弄しつつ　" + "水の　手裏剣で　切り裂く。");
		data.setType("みず");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/658.png");
		return data;
	}

	@RequestMapping({ "/pokemon/659", "/pokemon/ホルビー", "/pokemon/Bunnelby" })
	public PokemonData poke659() {
		PokemonData data = new PokemonData();
		data.setId(659);
		data.setName("ホルビー");
		data.setFeatures("シャベルのような　耳を　持つ。　" + "穴掘りで　鍛えた　耳は　" + "太い　根っこを　断ち切る　威力だ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/659.png");
		return data;
	}

	@RequestMapping({ "/pokemon/660", "/pokemon/ホルード", "/pokemon/Diggersby" })
	public PokemonData poke660() {
		PokemonData data = new PokemonData();
		data.setId(660);
		data.setName("ホルード");
		data.setFeatures("ショベルカー並みの　パワーの　耳で　" + "硬い　岩盤も　コナゴナ。穴を　" + "掘り終えると　ダラダラと　過ごす。");
		data.setType("ノーマル");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/660.png");
		return data;
	}

	@RequestMapping({ "/pokemon/661", "/pokemon/ヤヤコマ", "/pokemon/Fletchling" })
	public PokemonData poke661() {
		PokemonData data = new PokemonData();
		data.setId(661);
		data.setName("ヤヤコマ");
		data.setFeatures("さえずる　声は　美しいが　" + "縄張りに　入った　相手は　" + "容赦しない　荒々しさだ。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/661.png");
		return data;
	}

	@RequestMapping({ "/pokemon/662", "/pokemon/ヒノヤコマ", "/pokemon/Fletchinder" })
	public PokemonData poke662() {
		PokemonData data = new PokemonData();
		data.setId(662);
		data.setName("ヒノヤコマ");
		data.setFeatures("お腹の　炎袋の　火力が　" + "強まるほど　速く　飛べるが　" + "点火するまで　時間が　かかる。");
		data.setType("ほのお");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/662.png");
		return data;
	}

	@RequestMapping({ "/pokemon/663", "/pokemon/ファイアロー", "/pokemon/Talonflame" })
	public PokemonData poke663() {
		PokemonData data = new PokemonData();
		data.setId(663);
		data.setName("ファイアロー");
		data.setFeatures("羽の　すき間から　火の粉を　" + "吹きだしながら　時速５００キロで　" + "獲物に　向かって　一直線。");
		data.setType("ほのお");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/663.png");
		return data;
	}

	@RequestMapping({ "/pokemon/664", "/pokemon/コフキムシ", "/pokemon/Scatterbug" })
	public PokemonData poke664() {
		PokemonData data = new PokemonData();
		data.setId(664);
		data.setName("コフキムシ");
		data.setFeatures("体を　覆う　粉が　体温を　" + "調節するので　どんな　気候や　風土の　" + "地域でも　暮らせる。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/664.png");
		return data;
	}

	@RequestMapping({ "/pokemon/665", "/pokemon/コフーライ", "/pokemon/Spewpa" })
	public PokemonData poke665() {
		PokemonData data = new PokemonData();
		data.setId(665);
		data.setName("コフーライ");
		data.setFeatures("硬い　体は　とりポケモンの　" + "クチバシでも　傷ひとつ　つかない。　" + "粉を　まき散らして　防戦する。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/665.png");
		return data;
	}

	@RequestMapping({ "/pokemon/666", "/pokemon/ビビヨン", "/pokemon/Vivillon" })
	public PokemonData poke666() {
		PokemonData data = new PokemonData();
		data.setId(666);
		data.setName("ビビヨン");
		data.setFeatures("住んでいる　気候や　風土によって　" + "羽の　模様が　違う　ポケモン。　" + "色鮮やかな　りんぷんを　まく。");
		data.setType("むし");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/666.png");
		return data;
	}

	@RequestMapping({ "/pokemon/667", "/pokemon/シシコ", "/pokemon/Litleo" })
	public PokemonData poke667() {
		PokemonData data = new PokemonData();
		data.setId(667);
		data.setName("シシコ");
		data.setFeatures("強くなるため　群れを　離れて　" + "１匹で　生活するようになる。　" + "血気盛んで　ケンカっ早い。");
		data.setType("ほのお");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/667.png");
		return data;
	}

	@RequestMapping({ "/pokemon/668", "/pokemon/カエンジシ", "/pokemon/Pyroar" })
	public PokemonData poke668() {
		PokemonData data = new PokemonData();
		data.setId(668);
		data.setName("カエンジシ");
		data.setFeatures("摂氏６０００度の　息を　吐き出し　" + "激しく　相手を　威嚇する。　" + "メスが　群れの　子供を　守る。");
		data.setType("ほのお");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/668.png");
		return data;
	}

	@RequestMapping({ "/pokemon/669", "/pokemon/フラベベ", "/pokemon/Flabébé" })
	public PokemonData poke669() {
		PokemonData data = new PokemonData();
		data.setId(669);
		data.setName("フラベベ");
		data.setFeatures("気に入った　花を　見つけると　" + "一生　その花と　暮らす。　" + "風に　乗って　気ままに　漂う。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/669.png");
		return data;
	}

	@RequestMapping({ "/pokemon/670", "/pokemon/フラエッテ", "/pokemon/Floette" })
	public PokemonData poke670() {
		PokemonData data = new PokemonData();
		data.setId(670);
		data.setName("フラエッテ");
		data.setFeatures("手入れの　行き届いた　花壇の　" + "花が　咲くと　姿を　現して　" + "かれんな　ダンスで　祝福する。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/670.png");
		return data;
	}

	@RequestMapping({ "/pokemon/671", "/pokemon/フラージェス", "/pokemon/Florges" })
	public PokemonData poke671() {
		PokemonData data = new PokemonData();
		data.setId(671);
		data.setName("フラージェス");
		data.setFeatures("昔の　城の　主たちは　庭を　飾るため　" + "フラージェスを　招き入れ　" + "花園を　作らせた。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/671.png");
		return data;
	}

	@RequestMapping({ "/pokemon/672", "/pokemon/メェークル", "/pokemon/Skiddo" })
	public PokemonData poke672() {
		PokemonData data = new PokemonData();
		data.setId(672);
		data.setName("メェークル");
		data.setFeatures("水と　太陽が　あれば　背中の　" + "葉っぱで　エネルギーが　作れるので　" + "エサを　食べなくても　平気なのだ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/672.png");
		return data;
	}

	@RequestMapping({ "/pokemon/673", "/pokemon/ゴーゴート", "/pokemon/Gogoat" })
	public PokemonData poke673() {
		PokemonData data = new PokemonData();
		data.setId(673);
		data.setName("ゴーゴート");
		data.setFeatures("山岳地帯で　生活する。　" + "ツノを　ぶつけ合う　力比べの　勝者が　" + "群れの　リーダーだ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/673.png");
		return data;
	}

	@RequestMapping({ "/pokemon/674", "/pokemon/ヤンチャム", "/pokemon/Pancham" })
	public PokemonData poke674() {
		PokemonData data = new PokemonData();
		data.setId(674);
		data.setName("ヤンチャム");
		data.setFeatures("一生懸命　怖い　顔で　相手を　" + "にらみつけるが　頭を　なでられると　" + "つい　にやけてしまう。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/674.png");
		return data;
	}

	@RequestMapping({ "/pokemon/675", "/pokemon/ゴロンダ", "/pokemon/Pangoro" })
	public PokemonData poke675() {
		PokemonData data = new PokemonData();
		data.setId(675);
		data.setName("ゴロンダ");
		data.setFeatures("攻撃を　受けても　ひるまずに　突進して　" + "電柱を　へし折る　" + "パワーの　腕力で　ぶちのめす。");
		data.setType("かくとう");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/675.png");
		return data;
	}

	@RequestMapping({ "/pokemon/676", "/pokemon/トリミアン", "/pokemon/Furfrou" })
	public PokemonData poke676() {
		PokemonData data = new PokemonData();
		data.setId(676);
		data.setName("トリミアン");
		data.setFeatures("大昔の　カロス地方では　" + "王様を　護衛する　役目を　" + "与えられた　ポケモン。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/676.png");
		return data;
	}

	@RequestMapping({ "/pokemon/677", "/pokemon/ニャスパー", "/pokemon/Espurr" })
	public PokemonData poke677() {
		PokemonData data = new PokemonData();
		data.setId(677);
		data.setName("ニャスパー");
		data.setFeatures("１００メートル以内の　ものを　" + "吹き飛ばす　ほどの　サイコパワーを　" + "うまく　コントロール　できないのだ。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/677.png");
		return data;
	}

	@RequestMapping({ "/pokemon/678", "/pokemon/ニャオニクス", "/pokemon/Meowstic" })
	public PokemonData poke678() {
		PokemonData data = new PokemonData();
		data.setId(678);
		data.setName("ニャオニクス");
		data.setFeatures("耳の　内側の　目玉模様から　" + "サイコパワーを　出すが　" + "あまりにも　強力なので　ふさいでいる。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/678.png");
		return data;
	}

	@RequestMapping({ "/pokemon/679", "/pokemon/ヒトツキ", "/pokemon/Honedge" })
	public PokemonData poke679() {
		PokemonData data = new PokemonData();
		data.setId(679);
		data.setName("ヒトツキ");
		data.setFeatures("剣の　柄を　握った　人の　腕に　" + "青い　布を　巻きつけて　" + "倒れるまで　命を　吸い取る。");
		data.setType("はがね");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/679.png");
		return data;
	}

	@RequestMapping({ "/pokemon/680", "/pokemon/ニダンギル", "/pokemon/Doublade" })
	public PokemonData poke680() {
		PokemonData data = new PokemonData();
		data.setId(680);
		data.setName("ニダンギル");
		data.setFeatures("２本の　剣による　" + "複雑な　連続攻撃を　防ぐことは　" + "剣の　達人でも　不可能だ。");
		data.setType("はがね");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/680.png");
		return data;
	}

	@RequestMapping({ "/pokemon/681", "/pokemon/ギルガルド", "/pokemon/Aegislash" })
	public PokemonData poke681() {
		PokemonData data = new PokemonData();
		data.setId(681);
		data.setName("ギルガルド");
		data.setFeatures("王の　素質を　持つ　人間を　" + "見抜くらしい。認められた　人は　" + "やがて　王になると　言われている。");
		data.setType("はがね");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/681.png");
		return data;
	}

	@RequestMapping({ "/pokemon/682", "/pokemon/シュシュプ", "/pokemon/Spritzee" })
	public PokemonData poke682() {
		PokemonData data = new PokemonData();
		data.setId(682);
		data.setName("シュシュプ");
		data.setFeatures("昔の　貴婦人たちは　香水の　かわりに　" + "好みの　香りを　出す　" + "シュシュプを　連れていたという。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/682.png");
		return data;
	}

	@RequestMapping({ "/pokemon/683", "/pokemon/フレフワン", "/pokemon/Aromatisse" })
	public PokemonData poke683() {
		PokemonData data = new PokemonData();
		data.setId(683);
		data.setName("フレフワン");
		data.setFeatures("においが　強すぎるため　" + "よほど　好きな　トレーナーでなければ　" + "連れて　歩くのは　キツイのだ。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/683.png");
		return data;
	}

	@RequestMapping({ "/pokemon/684", "/pokemon/ペロッパフ", "/pokemon/Swirlix" })
	public PokemonData poke684() {
		PokemonData data = new PokemonData();
		data.setId(684);
		data.setName("ペロッパフ");
		data.setFeatures("甘いもの　ばかりを　食べているので　" + "体毛が　わたあめのように　" + "甘く　ベタベタしている。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/684.png");
		return data;
	}

	@RequestMapping({ "/pokemon/685", "/pokemon/ペロリーム", "/pokemon/Slurpuff" })
	public PokemonData poke685() {
		PokemonData data = new PokemonData();
		data.setId(685);
		data.setName("ペロリーム");
		data.setFeatures("きゅうかくは　人の　１億倍以上。　" + "空気中に　漂う　わずかな　においで　" + "まわりの　様子が　すべて　わかる。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/685.png");
		return data;
	}

	@RequestMapping({ "/pokemon/686", "/pokemon/マーイーカ", "/pokemon/Inkay" })
	public PokemonData poke686() {
		PokemonData data = new PokemonData();
		data.setId(686);
		data.setName("マーイーカ");
		data.setFeatures("光の　点滅で　襲ってきた　敵の　" + "戦意を　なくしてしまう。　" + "その　すきに　姿を　くらますのだ。");
		data.setType("あく");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/686.png");
		return data;
	}

	@RequestMapping({ "/pokemon/687", "/pokemon/カラマネロ", "/pokemon/Malamar" })
	public PokemonData poke687() {
		PokemonData data = new PokemonData();
		data.setId(687);
		data.setName("カラマネロ");
		data.setFeatures("催眠術で　おびき寄せて　" + "頭の　触手で　絡め取り　" + "消化液を　浴びせて　しとめる。");
		data.setType("あく");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/687.png");
		return data;
	}

	@RequestMapping({ "/pokemon/688", "/pokemon/カメテテ", "/pokemon/Binacle" })
	public PokemonData poke688() {
		PokemonData data = new PokemonData();
		data.setId(688);
		data.setName("カメテテ");
		data.setFeatures("体を　伸ばす　反動で　岩を　" + "持ち上げて　歩く。波打ち際で　" + "流されてきた　海藻を　食べる。");
		data.setType("いわ");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/688.png");
		return data;
	}

	@RequestMapping({ "/pokemon/689", "/pokemon/ガメノデス", "/pokemon/Barbaracle" })
	public PokemonData poke689() {
		PokemonData data = new PokemonData();
		data.setId(689);
		data.setName("ガメノデス");
		data.setFeatures("手足にも　脳が　あり　" + "勝手に　動けるが　普段は　" + "頭の　ガメノデスの　命令に　従う。");
		data.setType("いわ");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/689.png");
		return data;
	}

	@RequestMapping({ "/pokemon/690", "/pokemon/クズモー", "/pokemon/Skrelp" })
	public PokemonData poke690() {
		PokemonData data = new PokemonData();
		data.setId(690);
		data.setName("クズモー");
		data.setFeatures("腐った　海藻に　そっくり。　" + "敵の　目を　ごまかしながら　" + "進化する　力を　蓄える。");
		data.setType("どく");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/690.png");
		return data;
	}

	@RequestMapping({ "/pokemon/691", "/pokemon/ドラミドロ", "/pokemon/Dragalge" })
	public PokemonData poke691() {
		PokemonData data = new PokemonData();
		data.setId(691);
		data.setName("ドラミドロ");
		data.setFeatures("ドラミドロが　住む　海域に　" + "迷いこんだ　船は　２度と　" + "生きて　戻れないと　言われている。");
		data.setType("どく");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/691.png");
		return data;
	}

	@RequestMapping({ "/pokemon/692", "/pokemon/ウデッポウ", "/pokemon/Clauncher" })
	public PokemonData poke692() {
		PokemonData data = new PokemonData();
		data.setId(692);
		data.setName("ウデッポウ");
		data.setFeatures("体内ガスの　爆発で　" + "水を　ピストルのように　発射する。　" + "至近距離なら　岩を　砕く。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/692.png");
		return data;
	}

	@RequestMapping({ "/pokemon/693", "/pokemon/ブロスター", "/pokemon/Clawitzer" })
	public PokemonData poke693() {
		PokemonData data = new PokemonData();
		data.setId(693);
		data.setName("ブロスター");
		data.setFeatures("ハサミの　後ろの　ノズルから　" + "水を　噴き出す　推進力で　" + "６０ノットの　スピードで　進む。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/693.png");
		return data;
	}

	@RequestMapping({ "/pokemon/694", "/pokemon/エリキテル", "/pokemon/Helioptile" })
	public PokemonData poke694() {
		PokemonData data = new PokemonData();
		data.setId(694);
		data.setName("エリキテル");
		data.setFeatures("頭の　両わきの　ひだには　" + "太陽の　光を　浴びると　" + "発電する　細胞が　あるのだ。");
		data.setType("でんき");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/694.png");
		return data;
	}

	@RequestMapping({ "/pokemon/695", "/pokemon/エレザード", "/pokemon/Heliolisk" })
	public PokemonData poke695() {
		PokemonData data = new PokemonData();
		data.setId(695);
		data.setName("エレザード");
		data.setFeatures("電気で　筋肉を　刺激すると　" + "１００メートルを　５秒で　走る　" + "脚力に　パワーアップする。");
		data.setType("でんき");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/695.png");
		return data;
	}

	@RequestMapping({ "/pokemon/696", "/pokemon/チゴラス", "/pokemon/Tyrunt" })
	public PokemonData poke696() {
		PokemonData data = new PokemonData();
		data.setId(696);
		data.setName("チゴラス");
		data.setFeatures("自動車を　バリバリと　かじって　" + "壊す　おおあごの　破壊力。　" + "１億年前に　生息していた。");
		data.setType("いわ");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/696.png");
		return data;
	}

	@RequestMapping({ "/pokemon/697", "/pokemon/ガチゴラス", "/pokemon/Tyrantrum" })
	public PokemonData poke697() {
		PokemonData data = new PokemonData();
		data.setId(697);
		data.setName("ガチゴラス");
		data.setFeatures("１億年前の　世界では　" + "無敵を　ほこり　王様のように　" + "ふるまっていた　ポケモン。");
		data.setType("いわ");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/697.png");
		return data;
	}

	@RequestMapping({ "/pokemon/698", "/pokemon/アマルス", "/pokemon/Amaura" })
	public PokemonData poke698() {
		PokemonData data = new PokemonData();
		data.setId(698);
		data.setName("アマルス");
		data.setFeatures("おっとりした　性格の　ポケモン。　" + "ガチゴラスなど　凶暴な　敵の　いない　" + "寒い　土地に　住んでいた。");
		data.setType("いわ");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/698.png");
		return data;
	}

	@RequestMapping({ "/pokemon/699", "/pokemon/アマルルガ", "/pokemon/Aurorus" })
	public PokemonData poke699() {
		PokemonData data = new PokemonData();
		data.setId(699);
		data.setName("アマルルガ");
		data.setFeatures("ひし形の　結晶で　" + "氷の　壁を　瞬間的に　作り　" + "敵の　攻撃を　防ぐのだ。");
		data.setType("いわ");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/699.png");
		return data;
	}

	@RequestMapping({ "/pokemon/700", "/pokemon/ニンフィア", "/pokemon/Sylveon" })
	public PokemonData poke700() {
		PokemonData data = new PokemonData();
		data.setId(700);
		data.setName("ニンフィア");
		data.setFeatures("大好きな　トレーナーの　腕に　" + "リボンのような　触覚を　巻きつけて　" + "一緒に　歩く。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/700.png");
		return data;
	}

	@RequestMapping({ "/pokemon/701", "/pokemon/ルチャブル", "/pokemon/Hawlucha" })
	public PokemonData poke701() {
		PokemonData data = new PokemonData();
		data.setId(701);
		data.setName("ルチャブル");
		data.setFeatures("翼を　使い　空中で　姿勢を　" + "コントロール。防ぎにくい　頭上から　" + "攻撃を　仕掛ける。");
		data.setType("かくとう");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/701.png");
		return data;
	}

	@RequestMapping({ "/pokemon/702", "/pokemon/デデンネ", "/pokemon/Dedenne" })
	public PokemonData poke702() {
		PokemonData data = new PokemonData();
		data.setId(702);
		data.setName("デデンネ");
		data.setFeatures("上の　ヒゲは　辺りを　探る　" + "センサーで　下に　生えた　ヒゲは　" + "電気を　放つ　器官　なのだ。");
		data.setType("でんき");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/702.png");
		return data;
	}

	@RequestMapping({ "/pokemon/703", "/pokemon/メレシー", "/pokemon/Carbink" })
	public PokemonData poke703() {
		PokemonData data = new PokemonData();
		data.setId(703);
		data.setName("メレシー");
		data.setFeatures("生まれてから　数億年の間　" + "地底で　眠っていた。　" + "洞窟を　掘ると　たまに　出てくる。");
		data.setType("いわ");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/703.png");
		return data;
	}

	@RequestMapping({ "/pokemon/704", "/pokemon/ヌメラ", "/pokemon/Goomy" })
	public PokemonData poke704() {
		PokemonData data = new PokemonData();
		data.setId(704);
		data.setName("ヌメラ");
		data.setFeatures("ヌメヌメの　粘膜で　覆われた　体は　" + "敵の　パンチや　キックを　" + "ヌルリと　滑らせてしまうのだ。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/704.png");
		return data;
	}

	@RequestMapping({ "/pokemon/705", "/pokemon/ヌメイル", "/pokemon/Sliggoo" })
	public PokemonData poke705() {
		PokemonData data = new PokemonData();
		data.setId(705);
		data.setName("ヌメイル");
		data.setFeatures("４本の　ツノは　高性能の　レーダー。　" + "耳や　鼻の　かわりに　" + "音や　においを　感じ取る。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/705.png");
		return data;
	}

	@RequestMapping({ "/pokemon/706", "/pokemon/ヌメルゴン", "/pokemon/Goodra" })
	public PokemonData poke706() {
		PokemonData data = new PokemonData();
		data.setId(706);
		data.setName("ヌメルゴン");
		data.setFeatures("伸び縮みする　ツノで　攻撃。　" + "プロボクサー　１００人分の　" + "パンチに　匹敵する　威力。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/706.png");
		return data;
	}

	@RequestMapping({ "/pokemon/707", "/pokemon/クレッフィ", "/pokemon/Klefki" })
	public PokemonData poke707() {
		PokemonData data = new PokemonData();
		data.setId(707);
		data.setName("クレッフィ");
		data.setFeatures("気に入った　カギは　絶対に　" + "手放さないので　防犯のために　" + "金庫の　カギを　持たせるのだ。");
		data.setType("はがね");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/707.png");
		return data;
	}

	@RequestMapping({ "/pokemon/708", "/pokemon/ボクレー", "/pokemon/Phantump" })
	public PokemonData poke708() {
		PokemonData data = new PokemonData();
		data.setId(708);
		data.setName("ボクレー");
		data.setFeatures("森で　さまよい　死んだ　" + "子供の　魂が　切り株に　宿り　" + "ポケモンになったと　言われている。");
		data.setType("ゴースト");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/708.png");
		return data;
	}

	@RequestMapping({ "/pokemon/709", "/pokemon/オーロット", "/pokemon/Trevenant" })
	public PokemonData poke709() {
		PokemonData data = new PokemonData();
		data.setId(709);
		data.setName("オーロット");
		data.setFeatures("根っこを　神経の　かわりにして　" + "森の　木を　操る。体に　住みついた　" + "ポケモンには　親切。");
		data.setType("ゴースト");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/709.png");
		return data;
	}

	@RequestMapping({ "/pokemon/710", "/pokemon/バケッチャ", "/pokemon/Pumpkaboo" })
	public PokemonData poke710() {
		PokemonData data = new PokemonData();
		data.setId(710);
		data.setName("バケッチャ");
		data.setFeatures("さまよう　魂を　成仏させるため　" + "死者の　住む　世界へ　" + "運んでいると　言われている。");
		data.setType("ゴースト");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/710.png");
		return data;
	}

	@RequestMapping({ "/pokemon/711", "/pokemon/パンプジン", "/pokemon/Gourgeist" })
	public PokemonData poke711() {
		PokemonData data = new PokemonData();
		data.setId(711);
		data.setName("パンプジン");
		data.setFeatures("髪の毛のような　腕で　獲物を　" + "締めつける。苦しむ　様子を　見ながら　" + "楽しそうに　歌うのだ。");
		data.setType("ゴースト");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/711.png");
		return data;
	}

	@RequestMapping({ "/pokemon/712", "/pokemon/カチコール", "/pokemon/Bergmite" })
	public PokemonData poke712() {
		PokemonData data = new PokemonData();
		data.setId(712);
		data.setName("カチコール");
		data.setFeatures("マイナス１００度の　冷気で　敵を　" + "氷漬けにする。万年雪に　覆われた　" + "山で　群れを　作る。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/712.png");
		return data;
	}

	@RequestMapping({ "/pokemon/713", "/pokemon/クレベース", "/pokemon/Avalugg" })
	public PokemonData poke713() {
		PokemonData data = new PokemonData();
		data.setId(713);
		data.setName("クレベース");
		data.setFeatures("背中に　数匹の　カチコールを　" + "乗せて　暮らす　様子は　" + "まるで　氷の　航空母艦のようだ。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/713.png");
		return data;
	}

	@RequestMapping({ "/pokemon/714", "/pokemon/オンバット", "/pokemon/Noibat" })
	public PokemonData poke714() {
		PokemonData data = new PokemonData();
		data.setId(714);
		data.setName("オンバット");
		data.setFeatures("２０万ヘルツの　超音波を　浴びると　" + "屈強な　レスラーも　目が　回り　" + "立っていられないのだ。");
		data.setType("ひこう");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/714.png");
		return data;
	}

	@RequestMapping({ "/pokemon/715", "/pokemon/オンバーン", "/pokemon/Noivern" })
	public PokemonData poke715() {
		PokemonData data = new PokemonData();
		data.setId(715);
		data.setName("オンバーン");
		data.setFeatures("耳から　発する　超音波で　" + "巨大な　岩も　粉砕する。　" + "暗闇に　紛れて　襲いかかる。");
		data.setType("ひこう");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/715.png");
		return data;
	}

	@RequestMapping({ "/pokemon/716", "/pokemon/ゼルネアス", "/pokemon/Xerneas" })
	public PokemonData poke716() {
		PokemonData data = new PokemonData();
		data.setId(716);
		data.setName("ゼルネアス");
		data.setFeatures("頭の　ツノが　七色に　輝くとき　" + "永遠の　命を　" + "分け与えると　言われている。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/716.png");
		return data;
	}

	@RequestMapping({ "/pokemon/717", "/pokemon/イベルタル", "/pokemon/Yveltal" })
	public PokemonData poke717() {
		PokemonData data = new PokemonData();
		data.setId(717);
		data.setName("イベルタル");
		data.setFeatures("寿命が　つきるとき　あらゆる　" + "生き物の　命を　吸いつくし　" + "繭の　姿に　戻るという。");
		data.setType("あく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/717.png");
		return data;
	}

	@RequestMapping({ "/pokemon/718", "/pokemon/ジガルデ", "/pokemon/Zygarde" })
	public PokemonData poke718() {
		PokemonData data = new PokemonData();
		data.setId(718);
		data.setName("ジガルデ");
		data.setFeatures("洞窟の　奥深くで　暮らし　" + "生態系を　破壊する者を　" + "監視していると　言われている。");
		data.setType("ドラゴン");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/718.png");
		return data;
	}

	@RequestMapping({ "/pokemon/719", "/pokemon/ディアンシー", "/pokemon/Diancie" })
	public PokemonData poke719() {
		PokemonData data = new PokemonData();
		data.setId(719);
		data.setName("ディアンシー");
		data.setFeatures("両手の　すきまで　空気中の　炭素を　" + "圧縮して　たくさんの　ダイヤを　" + "一瞬で　生み出す。");
		data.setType("いわ");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/719.png");
		return data;
	}

	@RequestMapping({ "/pokemon/720", "/pokemon/フーパ", "/pokemon/Hoopa" })
	public PokemonData poke720() {
		PokemonData data = new PokemonData();
		data.setId(720);
		data.setName("フーパ");
		data.setFeatures("６つの　リングと　６つの　巨大な腕で　" + "あらゆるものを　奪うと　いわれる。　" + "力を　封じられ　小さな姿に　変えられた。");
		data.setType("エスパー");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/720.png");
		return data;
	}

	@RequestMapping({ "/pokemon/721", "/pokemon/ボルケニオン", "/pokemon/Volcanion" })
	public PokemonData poke721() {
		PokemonData data = new PokemonData();
		data.setId(721);
		data.setName("ボルケニオン");
		data.setFeatures("背中の　アームから　" + "体内の　水蒸気を　噴射する。　" + "山　ひとつ　吹き飛ばす　威力。");
		data.setType("ほのお");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/721.png");
		return data;
	}

	@RequestMapping({ "/pokemon/722", "/pokemon/モクロー", "/pokemon/Rowlet" })
	public PokemonData poke722() {
		PokemonData data = new PokemonData();
		data.setId(722);
		data.setName("モクロー");
		data.setFeatures("一切　音を　立てず　滑空し　" + "敵に　急接近。　気づかぬ間に　" + "強烈な　蹴りを　浴びせる。");
		data.setType("くさ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/722.png");
		return data;
	}

	@RequestMapping({ "/pokemon/723", "/pokemon/フクスロー", "/pokemon/Dartrix" })
	public PokemonData poke723() {
		PokemonData data = new PokemonData();
		data.setId(723);
		data.setName("フクスロー");
		data.setFeatures("刃羽根と　呼ばれる　鋭い　羽根を　" + "敵や　獲物に　投げつける。　" + "ほぼ　百発百中　だ。");
		data.setType("くさ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/723.png");
		return data;
	}

	@RequestMapping({ "/pokemon/724", "/pokemon/ジュナイパー", "/pokemon/Decidueye" })
	public PokemonData poke724() {
		PokemonData data = new PokemonData();
		data.setId(724);
		data.setName("ジュナイパー");
		data.setFeatures("基本的に　用心深く　" + "クールだが　不意を　つかれると　" + "大パニックに　陥ってしまう。");
		data.setType("くさ");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/724.png");
		return data;
	}

	@RequestMapping({ "/pokemon/725", "/pokemon/ニャビー", "/pokemon/Litten" })
	public PokemonData poke725() {
		PokemonData data = new PokemonData();
		data.setId(725);
		data.setName("ニャビー");
		data.setFeatures("感情を　ださず　独りで　" + "いることを　好む。　信頼を　" + "得るまでには　時間が　かかるぞ。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/725.png");
		return data;
	}

	@RequestMapping({ "/pokemon/726", "/pokemon/ニャヒート", "/pokemon/Torracat" })
	public PokemonData poke726() {
		PokemonData data = new PokemonData();
		data.setId(726);
		data.setName("ニャヒート");
		data.setFeatures("前足の　力が　自慢。　" + "パンチの　一撃で　鉄の棒も　" + "へし曲げて　しまうのだ。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/726.png");
		return data;
	}

	@RequestMapping({ "/pokemon/727", "/pokemon/ガオガエン", "/pokemon/Incineroar" })
	public PokemonData poke727() {
		PokemonData data = new PokemonData();
		data.setId(727);
		data.setName("ガオガエン");
		data.setFeatures("強烈な　パンチや　キックを　" + "お見舞いしたあと　へその　あたりから　" + "炎を　吹き出し　止めを　刺す。");
		data.setType("ほのお");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/727.png");
		return data;
	}

	@RequestMapping({ "/pokemon/728", "/pokemon/アシマリ", "/pokemon/Popplio" })
	public PokemonData poke728() {
		PokemonData data = new PokemonData();
		data.setId(728);
		data.setName("アシマリ");
		data.setFeatures("水の　バルーンを　操る。　" + "大きな　バルーンを　作るため　" + "コツコツ　練習を　繰り返す。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/728.png");
		return data;
	}

	@RequestMapping({ "/pokemon/729", "/pokemon/オシャマリ", "/pokemon/Brionne" })
	public PokemonData poke729() {
		PokemonData data = new PokemonData();
		data.setId(729);
		data.setName("オシャマリ");
		data.setFeatures("仲間を　思う　気持ちが　強い。　" + "トレーナーが　落ち込んでいると　" + "ダンスを　踊って　励まそうとする。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/729.png");
		return data;
	}

	@RequestMapping({ "/pokemon/730", "/pokemon/アシレーヌ", "/pokemon/Primarina" })
	public PokemonData poke730() {
		PokemonData data = new PokemonData();
		data.setId(730);
		data.setName("アシレーヌ");
		data.setFeatures("歌声を　活かし　戦う。　" + "毎日の　のどの　メンテナンスは　" + "トレーナーの　大切な　役目。");
		data.setType("みず");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/730.png");
		return data;
	}

	@RequestMapping({ "/pokemon/731", "/pokemon/ツツケラ", "/pokemon/Pikipek" })
	public PokemonData poke731() {
		PokemonData data = new PokemonData();
		data.setId(731);
		data.setName("ツツケラ");
		data.setFeatures("きのみが　餌。　喰らった後の　" + "タネを　弾として　口から　" + "発射し　攻撃に　利用。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/731.png");
		return data;
	}

	@RequestMapping({ "/pokemon/732", "/pokemon/ケララッパ", "/pokemon/Trumbeak" })
	public PokemonData poke732() {
		PokemonData data = new PokemonData();
		data.setId(732);
		data.setName("ケララッパ");
		data.setFeatures("クチバシを　反り返らせ　色んな　" + "音で　鳴く。　かなり　うるさいので　" + "周りの　御宅には　嫌われるぞ。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/732.png");
		return data;
	}

	@RequestMapping({ "/pokemon/733", "/pokemon/ドデカバシ", "/pokemon/Toucannon" })
	public PokemonData poke733() {
		PokemonData data = new PokemonData();
		data.setId(733);
		data.setName("ドデカバシ");
		data.setFeatures("体内の　ガスを　クチバシの　中で　" + "爆発させ　木のタネを　発射。　" + "大岩も　粉々にする　パワー。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/733.png");
		return data;
	}

	@RequestMapping({ "/pokemon/734", "/pokemon/ヤングース", "/pokemon/Yungoos" })
	public PokemonData poke734() {
		PokemonData data = new PokemonData();
		data.setId(734);
		data.setName("ヤングース");
		data.setFeatures("なんでも　食べるが　新鮮で　" + "生きているものが　いいので　" + "獲物を　探して　道を　練り歩く。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/734.png");
		return data;
	}

	@RequestMapping({ "/pokemon/735", "/pokemon/デカグース", "/pokemon/Gumshoos" })
	public PokemonData poke735() {
		PokemonData data = new PokemonData();
		data.setId(735);
		data.setName("デカグース");
		data.setFeatures("コラッタや　ラッタが　好物なのに　" + "昼行性のため　出会えない。　" + "忍耐強さが　自慢の　ポケモン。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/735.png");
		return data;
	}

	@RequestMapping({ "/pokemon/736", "/pokemon/アゴジムシ", "/pokemon/Grubbin" })
	public PokemonData poke736() {
		PokemonData data = new PokemonData();
		data.setId(736);
		data.setName("アゴジムシ");
		data.setFeatures("とりポケモンに　襲われないよう　" + "でんきポケモンが　棲む　場所に　" + "集まっていることが　多い。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/736.png");
		return data;
	}

	@RequestMapping({ "/pokemon/737", "/pokemon/デンヂムシ", "/pokemon/Charjabug" })
	public PokemonData poke737() {
		PokemonData data = new PokemonData();
		data.setId(737);
		data.setName("デンヂムシ");
		data.setFeatures("喰らった　餌を　消化　するとき　" + "発生した　電気エネルギーを　" + "電気袋に　溜め込んでいる。");
		data.setType("むし");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/737.png");
		return data;
	}

	@RequestMapping({ "/pokemon/738", "/pokemon/クワガノン", "/pokemon/Vikavolt" })
	public PokemonData poke738() {
		PokemonData data = new PokemonData();
		data.setId(738);
		data.setName("クワガノン");
		data.setFeatures("アクロバティックな　飛行で　敵を　" + "かく乱。　ひるんだ　隙を　ついて　" + "電撃ビームを　お見舞いする。");
		data.setType("むし");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/738.png");
		return data;
	}

	@RequestMapping({ "/pokemon/739", "/pokemon/マケンカニ", "/pokemon/Crabrawler" })
	public PokemonData poke739() {
		PokemonData data = new PokemonData();
		data.setId(739);
		data.setName("マケンカニ");
		data.setFeatures("なぐり過ぎで　ハサミは　よく　もげるが　" + "すぐに　生える。　ハサミの　中味は　" + "少ないが　コクがあって　うまいぞ。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/739.png");
		return data;
	}

	@RequestMapping({ "/pokemon/740", "/pokemon/ケケンカニ", "/pokemon/Crabominable" })
	public PokemonData poke740() {
		PokemonData data = new PokemonData();
		data.setId(740);
		data.setName("ケケンカニ");
		data.setFeatures("とにかく　見境なく　なぐる。　" + "いざと　なったら　ハサミを　自切し　" + "ロケットのように　発射し　なぐる。");
		data.setType("かくとう");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/740.png");
		return data;
	}

	@RequestMapping({ "/pokemon/741", "/pokemon/オドリドリ", "/pokemon/Oricorio" })
	public PokemonData poke741() {
		PokemonData data = new PokemonData();
		data.setId(741);
		data.setName("オドリドリ");
		data.setFeatures("くれないのミツを　吸った　オドリドリ。　" + "情熱的な　ステップで　敵の　" + "身も　心も　焼き尽くす。");
		data.setType("ほのお");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/741.png");
		return data;
	}

	@RequestMapping({ "/pokemon/742", "/pokemon/アブリー", "/pokemon/Cutiefly" })
	public PokemonData poke742() {
		PokemonData data = new PokemonData();
		data.setId(742);
		data.setName("アブリー");
		data.setFeatures("花に　似た　オーラを　持つ　人の　" + "頭の　上には　たくさんの　" + "アブリーが　集まってくるよ。");
		data.setType("むし");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/742.png");
		return data;
	}

	@RequestMapping({ "/pokemon/743", "/pokemon/アブリボン", "/pokemon/Ribombee" })
	public PokemonData poke743() {
		PokemonData data = new PokemonData();
		data.setId(743);
		data.setName("アブリボン");
		data.setFeatures("アブリボンの　花粉団子は　" + "栄養満点の　ものも　ある。　" + "サプリメントとして　売られることも。");
		data.setType("むし");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/743.png");
		return data;
	}

	@RequestMapping({ "/pokemon/744", "/pokemon/イワンコ", "/pokemon/Rockruff" })
	public PokemonData poke744() {
		PokemonData data = new PokemonData();
		data.setId(744);
		data.setName("イワンコ");
		data.setFeatures("昔から　人と　暮らしてきた。　" + "トレーナーが　悲しんでいると　" + "それを　察して　側を　離れない。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/744.png");
		return data;
	}

	@RequestMapping({ "/pokemon/745", "/pokemon/ルガルガン", "/pokemon/Lycanroc" })
	public PokemonData poke745() {
		PokemonData data = new PokemonData();
		data.setId(745);
		data.setName("ルガルガン");
		data.setFeatures("小さいころから　しっかり　育てると　" + "絶対　トレーナーを　裏切らない　" + "頼もしい　相棒に　なる。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/745.png");
		return data;
	}

	@RequestMapping({ "/pokemon/746", "/pokemon/ヨワシ", "/pokemon/Wishiwashi" })
	public PokemonData poke746() {
		PokemonData data = new PokemonData();
		data.setId(746);
		data.setName("ヨワシ");
		data.setFeatures("とても　弱く　とても　美味しいので　" + "常に　誰からも　狙われているが　" + "いじめていると　ひどい目に　あうぞ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/746.png");
		return data;
	}

	@RequestMapping({ "/pokemon/747", "/pokemon/ヒドイデ", "/pokemon/Mareanie" })
	public PokemonData poke747() {
		PokemonData data = new PokemonData();
		data.setId(747);
		data.setName("ヒドイデ");
		data.setFeatures("海底や　海岸を　はいまわる。　" + "サニーゴの　頭に　生える　" + "サンゴが　大好物だぞ。");
		data.setType("どく");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/747.png");
		return data;
	}

	@RequestMapping({ "/pokemon/748", "/pokemon/ドヒドイデ", "/pokemon/Toxapex" })
	public PokemonData poke748() {
		PokemonData data = new PokemonData();
		data.setId(748);
		data.setName("ドヒドイデ");
		data.setFeatures("ドヒドイデの　毒に　やられると　" + "３日３晩　激痛に　苦しみ　" + "助かっても　後遺症が　残る。");
		data.setType("どく");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/748.png");
		return data;
	}

	@RequestMapping({ "/pokemon/749", "/pokemon/ドロバンコ", "/pokemon/Mudbray" })
	public PokemonData poke749() {
		PokemonData data = new PokemonData();
		data.setId(749);
		data.setName("ドロバンコ");
		data.setFeatures("かなりの　力持ち。　自分の　" + "体重の　５０倍の　荷物を　" + "乗せられても　まるで　平気だ。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/749.png");
		return data;
	}

	@RequestMapping({ "/pokemon/750", "/pokemon/バンバドロ", "/pokemon/Mudsdale" })
	public PokemonData poke750() {
		PokemonData data = new PokemonData();
		data.setId(750);
		data.setName("バンバドロ");
		data.setFeatures("泥を　まとった　重たい　キックが　" + "得意　攻撃。　大型トラックも　" + "簡単に　スクラップに　するぞ。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/750.png");
		return data;
	}

	@RequestMapping({ "/pokemon/751", "/pokemon/シズクモ", "/pokemon/Dewpider" })
	public PokemonData poke751() {
		PokemonData data = new PokemonData();
		data.setId(751);
		data.setName("シズクモ");
		data.setFeatures("獲物や　敵を　見つけると　" + "頭に　被った　水泡を　" + "弾いて　水を　ぶつけるぞ。");
		data.setType("みず");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/751.png");
		return data;
	}

	@RequestMapping({ "/pokemon/752", "/pokemon/オニシズクモ", "/pokemon/Araquanid" })
	public PokemonData poke752() {
		PokemonData data = new PokemonData();
		data.setId(752);
		data.setName("オニシズクモ");
		data.setFeatures("見かけに　よらず　面倒見が　いい。　" + "弱く　小さな　仲間を　見つけると　" + "水泡の　中に　入れて　守る。");
		data.setType("みず");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/752.png");
		return data;
	}

	@RequestMapping({ "/pokemon/753", "/pokemon/カリキリ", "/pokemon/Fomantis" })
	public PokemonData poke753() {
		PokemonData data = new PokemonData();
		data.setId(753);
		data.setName("カリキリ");
		data.setFeatures("爽やかで　甘い香りが　する。　" + "カリキリが　隠れている　草むらには　" + "よく　アブリーが　群れている。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/753.png");
		return data;
	}

	@RequestMapping({ "/pokemon/754", "/pokemon/ラランテス", "/pokemon/Lurantis" })
	public PokemonData poke754() {
		PokemonData data = new PokemonData();
		data.setId(754);
		data.setName("ラランテス");
		data.setFeatures("鎌状の　花びらから　ビームを　" + "放つ。　分厚い　鉄板も　" + "真っ二つに　切断する　威力。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/754.png");
		return data;
	}

	@RequestMapping({ "/pokemon/755", "/pokemon/ネマシュ", "/pokemon/Morelull" })
	public PokemonData poke755() {
		PokemonData data = new PokemonData();
		data.setId(755);
		data.setName("ネマシュ");
		data.setFeatures("昼は　寝ながら　樹木の　根から　" + "養分を　吸う。　夜に　目覚め　" + "新たな　樹木を　探し歩く。");
		data.setType("くさ");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/755.png");
		return data;
	}

	@RequestMapping({ "/pokemon/756", "/pokemon/マシェード", "/pokemon/Shiinotic" })
	public PokemonData poke756() {
		PokemonData data = new PokemonData();
		data.setId(756);
		data.setName("マシェード");
		data.setFeatures("点滅する　胞子を　吹き出し　" + "眠りに　誘う。　眠った　" + "獲物の　精気を　吸い取る。");
		data.setType("くさ");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/756.png");
		return data;
	}

	@RequestMapping({ "/pokemon/757", "/pokemon/ヤトウモリ", "/pokemon/Salandit" })
	public PokemonData poke757() {
		PokemonData data = new PokemonData();
		data.setId(757);
		data.setName("ヤトウモリ");
		data.setFeatures("火山や　乾いた　岩場に　棲む。　" + "甘い　香りの　毒ガスを　放ち　" + "むしポケモンを　おびき寄せ　襲う。");
		data.setType("どく");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/757.png");
		return data;
	}

	@RequestMapping({ "/pokemon/758", "/pokemon/エンニュート", "/pokemon/Salazzle" })
	public PokemonData poke758() {
		PokemonData data = new PokemonData();
		data.setId(758);
		data.setName("エンニュート");
		data.setFeatures("毒ガスには　多くの　フェロモンが　" + "含まれている。　薄めることで　" + "官能的な　香水が　できる。");
		data.setType("どく");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/758.png");
		return data;
	}

	@RequestMapping({ "/pokemon/759", "/pokemon/ヌイコグマ", "/pokemon/Stufful" })
	public PokemonData poke759() {
		PokemonData data = new PokemonData();
		data.setId(759);
		data.setName("ヌイコグマ");
		data.setFeatures("なついた　相手や　仲間以外に　" + "触られると　物凄い　力で　" + "暴れるので　非常に　キケン。");
		data.setType("ノーマル");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/759.png");
		return data;
	}

	@RequestMapping({ "/pokemon/760", "/pokemon/キテルグマ", "/pokemon/Bewear" })
	public PokemonData poke760() {
		PokemonData data = new PokemonData();
		data.setId(760);
		data.setName("キテルグマ");
		data.setFeatures("仲間と　抱きしめあう　くせが　ある。　" + "その力で　背骨を　砕かれて　" + "世を　去る　トレーナーも　多い。");
		data.setType("ノーマル");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/760.png");
		return data;
	}

	@RequestMapping({ "/pokemon/761", "/pokemon/アマカジ", "/pokemon/Bounsweet" })
	public PokemonData poke761() {
		PokemonData data = new PokemonData();
		data.setId(761);
		data.setName("アマカジ");
		data.setFeatures("人が　食べるには　甘すぎるが　" + "アマカジの汗を　水と　割ると　" + "ほどよい　甘さの　ジュースになる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/761.png");
		return data;
	}

	@RequestMapping({ "/pokemon/762", "/pokemon/アママイコ", "/pokemon/Steenee" })
	public PokemonData poke762() {
		PokemonData data = new PokemonData();
		data.setId(762);
		data.setName("アママイコ");
		data.setFeatures("いつも　元気に　飛び跳ねている。　" + "元気な　姿と　いい香りで　" + "周りに　ポケモンが　集まってくる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/762.png");
		return data;
	}

	@RequestMapping({ "/pokemon/763", "/pokemon/アマージョ", "/pokemon/Tsareena" })
	public PokemonData poke763() {
		PokemonData data = new PokemonData();
		data.setId(763);
		data.setName("アマージョ");
		data.setFeatures("美脚の　ポケモンとして　知られ　" + "美容クリニックなどの　広告の　" + "マスコットに　なっている。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/763.png");
		return data;
	}

	@RequestMapping({ "/pokemon/764", "/pokemon/キュワワー", "/pokemon/Comfey" })
	public PokemonData poke764() {
		PokemonData data = new PokemonData();
		data.setId(764);
		data.setName("キュワワー");
		data.setFeatures("ツルに　ついた　花を　浮かべた　" + "お風呂は　リラックス効果が　あり　" + "多くの　女性に　大人気。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/764.png");
		return data;
	}

	@RequestMapping({ "/pokemon/765", "/pokemon/ヤレユータン", "/pokemon/Oranguru" })
	public PokemonData poke765() {
		PokemonData data = new PokemonData();
		data.setId(765);
		data.setName("ヤレユータン");
		data.setFeatures("ジャングル奥地の　木の上に　棲む。　" + "まれに　海辺に　現れて　" + "ヤドキングと　知恵比べを　する。");
		data.setType("ノーマル");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/765.png");
		return data;
	}

	@RequestMapping({ "/pokemon/766", "/pokemon/ナゲツケサル", "/pokemon/Passimian" })
	public PokemonData poke766() {
		PokemonData data = new PokemonData();
		data.setId(766);
		data.setName("ナゲツケサル");
		data.setFeatures("硬い　木の実を　使い　戦う。　" + "そのテクニックは　代々の　ボスから　" + "グループの　仲間に　受け継がれる。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/766.png");
		return data;
	}

	@RequestMapping({ "/pokemon/767", "/pokemon/コソクムシ", "/pokemon/Wimpod" })
	public PokemonData poke767() {
		PokemonData data = new PokemonData();
		data.setId(767);
		data.setName("コソクムシ");
		data.setFeatures("ビーチから　海底まで　色んな　" + "場所に　棲む。　腐った餌　でも　" + "喜んで　食べる　自然の掃除屋。");
		data.setType("むし");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/767.png");
		return data;
	}

	@RequestMapping({ "/pokemon/768", "/pokemon/グソクムシャ", "/pokemon/Golisopod" })
	public PokemonData poke768() {
		PokemonData data = new PokemonData();
		data.setId(768);
		data.setName("グソクムシャ");
		data.setFeatures("６本の　腕で　巧みに　戦う。　" + "普段は　深海の　岩穴で　" + "瞑想するように　静かに　過ごす。");
		data.setType("むし");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/768.png");
		return data;
	}

	@RequestMapping({ "/pokemon/769", "/pokemon/スナバァ", "/pokemon/Sandygast" })
	public PokemonData poke769() {
		PokemonData data = new PokemonData();
		data.setId(769);
		data.setName("スナバァ");
		data.setFeatures("口の中に　手を　入れた者を　" + "操ってしまう。　砂山の　" + "身体を　大きく　させるためだ。");
		data.setType("ゴースト");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/769.png");
		return data;
	}

	@RequestMapping({ "/pokemon/770", "/pokemon/シロデスナ", "/pokemon/Palossand" })
	public PokemonData poke770() {
		PokemonData data = new PokemonData();
		data.setId(770);
		data.setName("シロデスナ");
		data.setFeatures("城の　下には　精気を　吸われ　" + "干からびた　者たちの　骨が　" + "大量に　埋まっている。");
		data.setType("ゴースト");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/770.png");
		return data;
	}

	@RequestMapping({ "/pokemon/771", "/pokemon/ナマコブシ", "/pokemon/Pyukumuku" })
	public PokemonData poke771() {
		PokemonData data = new PokemonData();
		data.setId(771);
		data.setName("ナマコブシ");
		data.setFeatures("全身　体液で　ヌルヌル。　" + "うっかり　踏むと　転んでしまうし　" + "怒って　殴ってくるぞ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/771.png");
		return data;
	}

	@RequestMapping({ "/pokemon/772", "/pokemon/タイプ：ヌル", "/pokemon/Type: Null" })
	public PokemonData poke772() {
		PokemonData data = new PokemonData();
		data.setId(772);
		data.setName("タイプ：ヌル");
		data.setFeatures("人工の　ポケモン。　暴走の　" + "危険が　あるため　制御マスクで　" + "力を　封印　されている。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/772.png");
		return data;
	}

	@RequestMapping({ "/pokemon/773", "/pokemon/シルヴァディ", "/pokemon/Silvally" })
	public PokemonData poke773() {
		PokemonData data = new PokemonData();
		data.setId(773);
		data.setName("シルヴァディ");
		data.setFeatures("その名は　タイプ：ヌルを　初めて　" + "この姿に　進化　させた　" + "少年に　よって　名づけられた。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/773.png");
		return data;
	}

	@RequestMapping({ "/pokemon/774", "/pokemon/メテノ", "/pokemon/Minior" })
	public PokemonData poke774() {
		PokemonData data = new PokemonData();
		data.setId(774);
		data.setName("メテノ");
		data.setFeatures("強い　衝撃を　うけると　殻は　" + "はがれ　落ちる。　ナノ粒子が　" + "突然変異し　生まれたポケモン。");
		data.setType("いわ");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/774.png");
		return data;
	}

	@RequestMapping({ "/pokemon/775", "/pokemon/ネッコアラ", "/pokemon/Komala" })
	public PokemonData poke775() {
		PokemonData data = new PokemonData();
		data.setId(775);
		data.setName("ネッコアラ");
		data.setFeatures("抱いた　木は　生まれたとき　親から　" + "与えられたもの。　よく　なつけば　" + "トレーナーの　腕にも　しがみつく。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/775.png");
		return data;
	}

	@RequestMapping({ "/pokemon/776", "/pokemon/バクガメス", "/pokemon/Turtonator" })
	public PokemonData poke776() {
		PokemonData data = new PokemonData();
		data.setId(776);
		data.setName("バクガメス");
		data.setFeatures("鼻の　孔から　炎や　毒ガスを　" + "吹く。　フンは　爆発物で　" + "色んな　使い道が　ある。");
		data.setType("ほのお");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/776.png");
		return data;
	}

	@RequestMapping({ "/pokemon/777", "/pokemon/トゲデマル", "/pokemon/Togedemaru" })
	public PokemonData poke777() {
		PokemonData data = new PokemonData();
		data.setId(777);
		data.setName("トゲデマル");
		data.setFeatures("背中の　長い　毛は　導雷針。　" + "落雷を　引き寄せ　雷を　" + "浴びると　電気袋に　溜め込む。");
		data.setType("でんき");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/777.png");
		return data;
	}

	@RequestMapping({ "/pokemon/778", "/pokemon/ミミッキュ", "/pokemon/Mimikyu" })
	public PokemonData poke778() {
		PokemonData data = new PokemonData();
		data.setId(778);
		data.setName("ミミッキュ");
		data.setFeatures("恐ろしい　姿を　ボロ布で　" + "隠し　人や　他のポケモンに　" + "近づく　寂しがりや。");
		data.setType("ゴースト");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/778.png");
		return data;
	}

	@RequestMapping({ "/pokemon/779", "/pokemon/ハギギシリ", "/pokemon/Bruxish" })
	public PokemonData poke779() {
		PokemonData data = new PokemonData();
		data.setId(779);
		data.setName("ハギギシリ");
		data.setFeatures("念力で　獲物を　しびれさせ　" + "丈夫な　歯で　噛み砕く。　" + "シェルダーの　殻でも　よゆうだ。");
		data.setType("みず");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/779.png");
		return data;
	}

	@RequestMapping({ "/pokemon/780", "/pokemon/ジジーロン", "/pokemon/Drampa" })
	public PokemonData poke780() {
		PokemonData data = new PokemonData();
		data.setId(780);
		data.setName("ジジーロン");
		data.setFeatures("人懐っこく　子どもが　大好き。　" + "仲良しの　子どもと　遊ぶために　" + "山奥から　町に　降りてくる。");
		data.setType("ノーマル");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/780.png");
		return data;
	}

	@RequestMapping({ "/pokemon/781", "/pokemon/ダダリン", "/pokemon/Dhelmise" })
	public PokemonData poke781() {
		PokemonData data = new PokemonData();
		data.setId(781);
		data.setName("ダダリン");
		data.setFeatures("海に　漂う　モズクの　魂が　" + "生まれ変わった。　海の　ゴミを　" + "モズクに　絡めて　身体を　保つ。");
		data.setType("ゴースト");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/781.png");
		return data;
	}

	@RequestMapping({ "/pokemon/782", "/pokemon/ジャラコ", "/pokemon/Jangmo-o" })
	public PokemonData poke782() {
		PokemonData data = new PokemonData();
		data.setId(782);
		data.setName("ジャラコ");
		data.setFeatures("人気の　ない　山に　暮らす。　" + "ジャラコ同士　戦いながら　" + "少しずつ　成長　していく。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/782.png");
		return data;
	}

	@RequestMapping({ "/pokemon/783", "/pokemon/ジャランゴ", "/pokemon/Hakamo-o" })
	public PokemonData poke783() {
		PokemonData data = new PokemonData();
		data.setId(783);
		data.setName("ジャランゴ");
		data.setFeatures("鱗は　どんどん　生え変わる。　" + "新しくなるたび　鱗は　" + "硬く　鋭く　なっていく。");
		data.setType("ドラゴン");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/783.png");
		return data;
	}

	@RequestMapping({ "/pokemon/784", "/pokemon/ジャラランガ", "/pokemon/Kommo-o" })
	public PokemonData poke784() {
		PokemonData data = new PokemonData();
		data.setId(784);
		data.setName("ジャラランガ");
		data.setFeatures("鋼の　ウロコを　まとう　拳を　" + "ふるって　勇敢に　戦う。　" + "自慢の　特技は　アッパーカット。");
		data.setType("ドラゴン");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/784.png");
		return data;
	}

	@RequestMapping({ "/pokemon/785", "/pokemon/カプ・コケコ", "/pokemon/Tapu Koko" })
	public PokemonData poke785() {
		PokemonData data = new PokemonData();
		data.setId(785);
		data.setName("カプ・コケコ");
		data.setFeatures("目にも　止まらぬ　スピードで　敵を　" + "かく乱する。　ひどく　怒りっぽいが　" + "なんで　怒ったかは　すぐ　忘れる。");
		data.setType("でんき");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/785.png");
		return data;
	}

	@RequestMapping({ "/pokemon/786", "/pokemon/カプ・テテフ", "/pokemon/Tapu Lele" })
	public PokemonData poke786() {
		PokemonData data = new PokemonData();
		data.setId(786);
		data.setName("カプ・テテフ");
		data.setFeatures("ヒラヒラ　飛びまわり　不思議に　光る　" + "鱗粉を　振りまく。　触れた者は　" + "たちまち　元気を　取り戻すという。");
		data.setType("エスパー");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/786.png");
		return data;
	}

	@RequestMapping({ "/pokemon/787", "/pokemon/カプ・ブルル", "/pokemon/Tapu Bulu" })
	public PokemonData poke787() {
		PokemonData data = new PokemonData();
		data.setId(787);
		data.setName("カプ・ブルル");
		data.setFeatures("ウラウラの　守り神で　物臭。　" + "草木を　操り　敵を　縛りつけ　" + "動きを　止めて　角で　一突き。");
		data.setType("くさ");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/787.png");
		return data;
	}

	@RequestMapping({ "/pokemon/788", "/pokemon/カプ・レヒレ", "/pokemon/Tapu Fini" })
	public PokemonData poke788() {
		PokemonData data = new PokemonData();
		data.setId(788);
		data.setName("カプ・レヒレ");
		data.setFeatures("水を　操る　ポニの　守り神。　" + "けがれを　払う　清らかな　水を　" + "生みだすと　伝えられている。");
		data.setType("みず");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/788.png");
		return data;
	}

	@RequestMapping({ "/pokemon/789", "/pokemon/コスモッグ", "/pokemon/Cosmog" })
	public PokemonData poke789() {
		PokemonData data = new PokemonData();
		data.setId(789);
		data.setName("コスモッグ");
		data.setFeatures("大昔は　星の子　という　名で　" + "呼ばれた。　別世界の　ポケモンと　" + "いわれているが　詳しくは　不明。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/789.png");
		return data;
	}

	@RequestMapping({ "/pokemon/790", "/pokemon/コスモウム", "/pokemon/Cosmoem" })
	public PokemonData poke790() {
		PokemonData data = new PokemonData();
		data.setId(790);
		data.setName("コスモウム");
		data.setFeatures("硬いカラの　中で　黒いコアに　" + "なにかが　集まり　続けている。　" + "別世界の　ポケモンと　いわれる。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/790.png");
		return data;
	}

	@RequestMapping({ "/pokemon/791", "/pokemon/ソルガレオ", "/pokemon/Solgaleo" })
	public PokemonData poke791() {
		PokemonData data = new PokemonData();
		data.setId(791);
		data.setName("ソルガレオ");
		data.setFeatures("コスモッグが　進化した　♂だと　" + "いわれる。　第３の　眼が　浮かぶとき　" + "別世界へと　駆け抜けていく。");
		data.setType("エスパー");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/791.png");
		return data;
	}

	@RequestMapping({ "/pokemon/792", "/pokemon/ルナアーラ", "/pokemon/Lunala" })
	public PokemonData poke792() {
		PokemonData data = new PokemonData();
		data.setId(792);
		data.setName("ルナアーラ");
		data.setFeatures("別世界に　棲むと　いわれる。　" + "光を　喰らい続け　真昼も　" + "闇夜の　ように　翳らせる。");
		data.setType("エスパー");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/792.png");
		return data;
	}

	@RequestMapping({ "/pokemon/793", "/pokemon/ウツロイド", "/pokemon/Nihilego" })
	public PokemonData poke793() {
		PokemonData data = new PokemonData();
		data.setId(793);
		data.setName("ウツロイド");
		data.setFeatures("ＵＢの　一種。　意思が　あるかは　" + "不明だが　時折　少女の　" + "ような　仕草を　みせる。");
		data.setType("いわ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/793.png");
		return data;
	}

	@RequestMapping({ "/pokemon/794", "/pokemon/マッシブーン", "/pokemon/Buzzwole" })
	public PokemonData poke794() {
		PokemonData data = new PokemonData();
		data.setId(794);
		data.setName("マッシブーン");
		data.setFeatures("謎の　生物　ＵＢ。　一発の　" + "パンチで　ダンプカーを　粉砕する　" + "光景が　目撃　された。");
		data.setType("むし");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/794.png");
		return data;
	}

	@RequestMapping({ "/pokemon/795", "/pokemon/フェローチェ", "/pokemon/Pheromosa" })
	public PokemonData poke795() {
		PokemonData data = new PokemonData();
		data.setId(795);
		data.setName("フェローチェ");
		data.setFeatures("ＵＢの　一種。　この世界の　" + "ものに　けがれを　感じるのか　" + "一切　手を　触れようと　しない。");
		data.setType("むし");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/795.png");
		return data;
	}

	@RequestMapping({ "/pokemon/796", "/pokemon/デンジュモク", "/pokemon/Xurkitree" })
	public PokemonData poke796() {
		PokemonData data = new PokemonData();
		data.setId(796);
		data.setName("デンジュモク");
		data.setFeatures("ウルトラホールから　出現した。　" + "発電所を　襲撃　したため　" + "電気が　エネルギーと　おもわれる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/796.png");
		return data;
	}

	@RequestMapping({ "/pokemon/797", "/pokemon/テッカグヤ", "/pokemon/Celesteela" })
	public PokemonData poke797() {
		PokemonData data = new PokemonData();
		data.setId(797);
		data.setName("テッカグヤ");
		data.setFeatures("ＵＢの　一種。　２本の　腕から　" + "ガスを　噴きだし　森を　焼き払う　" + "姿が　確認　されている。");
		data.setType("はがね");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/797.png");
		return data;
	}

	@RequestMapping({ "/pokemon/798", "/pokemon/カミツルギ", "/pokemon/Kartana" })
	public PokemonData poke798() {
		PokemonData data = new PokemonData();
		data.setId(798);
		data.setName("カミツルギ");
		data.setFeatures("巨大な　鉄塔を　一刀の　" + "もとに　切り捨てる　姿が　" + "目撃された　ビーストの　一種。");
		data.setType("くさ");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/798.png");
		return data;
	}

	@RequestMapping({ "/pokemon/799", "/pokemon/アクジキング", "/pokemon/Guzzlord" })
	public PokemonData poke799() {
		PokemonData data = new PokemonData();
		data.setId(799);
		data.setName("アクジキング");
		data.setFeatures("危険生物　ビーストの　一種。　" + "つねに　なにかを　喰らっているようだが　" + "なぜか　フンは　未発見。");
		data.setType("あく");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/799.png");
		return data;
	}

	@RequestMapping({ "/pokemon/800", "/pokemon/ネクロズマ", "/pokemon/Necrozma" })
	public PokemonData poke800() {
		PokemonData data = new PokemonData();
		data.setId(800);
		data.setName("ネクロズマ");
		data.setFeatures("光が　エネルギー源　らしい。　" + "レーザー光を　ぶっ放しまくる　" + "非常に　凶暴な　性質。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/800.png");
		return data;
	}

	@RequestMapping({ "/pokemon/801", "/pokemon/マギアナ", "/pokemon/Magearna" })
	public PokemonData poke801() {
		PokemonData data = new PokemonData();
		data.setId(801);
		data.setName("マギアナ");
		data.setFeatures("機械仕掛けの　身体は　ただの　" + "器。　ソウルハートと　呼ばれる　" + "人造の　魂が　本体。");
		data.setType("はがね");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/801.png");
		return data;
	}

	@RequestMapping({ "/pokemon/802", "/pokemon/マーシャドー", "/pokemon/Marshadow" })
	public PokemonData poke802() {
		PokemonData data = new PokemonData();
		data.setId(802);
		data.setName("マーシャドー");
		data.setFeatures("相手の　影に　潜り込み　" + "その　動きや　力を　コピーする。　" + "おくびょうで　弱気な　ポケモン。");
		data.setType("かくとう");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/802.png");
		return data;
	}

	@RequestMapping({ "/pokemon/803", "/pokemon/ベベノム", "/pokemon/Poipole" })
	public PokemonData poke803() {
		PokemonData data = new PokemonData();
		data.setId(803);
		data.setName("ベベノム");
		data.setFeatures("異世界に　棲む　ウルトラビースト。　" + "頭の　毒針から　毒液を　" + "相手に　かけて　ケラケラ　笑う。");
		data.setType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/803.png");
		return data;
	}

	@RequestMapping({ "/pokemon/804", "/pokemon/アーゴヨン", "/pokemon/Naganadel" })
	public PokemonData poke804() {
		PokemonData data = new PokemonData();
		data.setId(804);
		data.setName("アーゴヨン");
		data.setFeatures("ウルトラビーストの　一種。　" + "毒針から　粘度が　高く　" + "光る　毒液を　発射する。");
		data.setType("どく");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/804.png");
		return data;
	}

	@RequestMapping({ "/pokemon/805", "/pokemon/ツンデツンデ", "/pokemon/Stakataka" })
	public PokemonData poke805() {
		PokemonData data = new PokemonData();
		data.setId(805);
		data.setName("ツンデツンデ");
		data.setFeatures("ＵＢらしき　謎の　生命体。　" + "突然　動き出して　襲ってきた　" + "石垣の　正体は　こいつだ。");
		data.setType("いわ");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/805.png");
		return data;
	}

	@RequestMapping({ "/pokemon/806", "/pokemon/ズガドーン", "/pokemon/Blacephalon" })
	public PokemonData poke806() {
		PokemonData data = new PokemonData();
		data.setId(806);
		data.setName("ズガドーン");
		data.setFeatures("ウルトラホールから　現れた　ＵＢ。　" + "爆発で　相手を　驚かし　" + "その隙に　生気を　奪っていた。");
		data.setType("ほのお");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/806.png");
		return data;
	}

	@RequestMapping({ "/pokemon/807", "/pokemon/ゼラオラ", "/pokemon/Zeraora" })
	public PokemonData poke807() {
		PokemonData data = new PokemonData();
		data.setId(807);
		data.setName("ゼラオラ");
		data.setFeatures("雷が　落ちるのと　同じ　" + "速さで　敵に　急接近。　" + "鋭い　ツメで　八つ裂きに　する。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/807.png");
		return data;
	}

	@RequestMapping({ "/pokemon/808", "/pokemon/メルタン", "/pokemon/Meltan" })
	public PokemonData poke808() {
		PokemonData data = new PokemonData();
		data.setId(808);
		data.setName("メルタン");
		data.setFeatures("とろりと　溶けた　鋼の　体。　" + "地中の　鉄分や　金属を　" + "溶かして　吸収する。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/808.png");
		return data;
	}

	@RequestMapping({ "/pokemon/809", "/pokemon/メルメタル", "/pokemon/Melmetal" })
	public PokemonData poke809() {
		PokemonData data = new PokemonData();
		data.setId(809);
		data.setName("メルメタル");
		data.setFeatures("鉄を　産み出す　力を　持つと　" + "崇められていた。　３０００年の　" + "時を　経て　なぜか　蘇った。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/809.png");
		return data;
	}

	@RequestMapping({ "/pokemon/810", "/pokemon/サルノリ", "/pokemon/Grookey" })
	public PokemonData poke810() {
		PokemonData data = new PokemonData();
		data.setId(810);
		data.setName("サルノリ");
		data.setFeatures("スティックの　連打で　攻撃。　" + "すごい　スピードで　叩くうちに　" + "どんどん　テンションが　上がるのだ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/810.png");
		return data;
	}

	@RequestMapping({ "/pokemon/811", "/pokemon/バチンキー", "/pokemon/Thwackey" })
	public PokemonData poke811() {
		PokemonData data = new PokemonData();
		data.setId(811);
		data.setName("バチンキー");
		data.setFeatures("激しい　ビートを　刻むことに　" + "夢中になる　あまり　戦いで　" + "相手が　気絶しても　気づかない。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/811.png");
		return data;
	}

	@RequestMapping({ "/pokemon/812", "/pokemon/ゴリランダー", "/pokemon/Rillaboom" })
	public PokemonData poke812() {
		PokemonData data = new PokemonData();
		data.setId(812);
		data.setName("ゴリランダー");
		data.setFeatures("ドラムテクニックに　優れた　ものが　" + "ボスになる。　穏やかな　気性で　" + "グループの　調和を　重んじる。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/812.png");
		return data;
	}

	@RequestMapping({ "/pokemon/813", "/pokemon/ヒバニー", "/pokemon/Scorbunny" })
	public PokemonData poke813() {
		PokemonData data = new PokemonData();
		data.setId(813);
		data.setName("ヒバニー");
		data.setFeatures("戦う　準備が　整うと　" + "鼻の　頭と　足の　裏の　" + "肉球が　高熱を　発する。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/813.png");
		return data;
	}

	@RequestMapping({ "/pokemon/814", "/pokemon/ラビフット", "/pokemon/Raboot" })
	public PokemonData poke814() {
		PokemonData data = new PokemonData();
		data.setId(814);
		data.setName("ラビフット");
		data.setFeatures("手を　使わずに　木の　枝から　" + "木の実を　摘み取り　リフティング。　" + "足技を　磨く　練習。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/814.png");
		return data;
	}

	@RequestMapping({ "/pokemon/815", "/pokemon/エースバーン", "/pokemon/Cinderace" })
	public PokemonData poke815() {
		PokemonData data = new PokemonData();
		data.setId(815);
		data.setName("エースバーン");
		data.setFeatures("攻守に　優れ　応援されると　" + "さらに　燃えるが　スタンドプレイに　" + "走り　ピンチを　招くこともある。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/815.png");
		return data;
	}

	@RequestMapping({ "/pokemon/816", "/pokemon/メッソン", "/pokemon/Sobble" })
	public PokemonData poke816() {
		PokemonData data = new PokemonData();
		data.setId(816);
		data.setName("メッソン");
		data.setFeatures("皮膚の　色は　濡れると　変わる。　" + "カモフラージュ　されたかの　ように　" + "姿が　見えなく　なるのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/816.png");
		return data;
	}

	@RequestMapping({ "/pokemon/817", "/pokemon/ジメレオン", "/pokemon/Drizzile" })
	public PokemonData poke817() {
		PokemonData data = new PokemonData();
		data.setId(817);
		data.setName("ジメレオン");
		data.setFeatures("頭が　よく　面倒くさがり。　" + "縄張りに　敵が　近づかないよう　" + "そこかしこに　罠を　仕掛けている。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/817.png");
		return data;
	}

	@RequestMapping({ "/pokemon/818", "/pokemon/インテレオン", "/pokemon/Inteleon" })
	public PokemonData poke818() {
		PokemonData data = new PokemonData();
		data.setId(818);
		data.setName("インテレオン");
		data.setFeatures("指先から　放つ　水鉄砲は　" + "マッハ３の　速さ。　瞬膜で　" + "急所を　見抜いて　撃ちぬくぞ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/818.png");
		return data;
	}

	@RequestMapping({ "/pokemon/819", "/pokemon/ホシガリス", "/pokemon/Skwovet" })
	public PokemonData poke819() {
		PokemonData data = new PokemonData();
		data.setId(819);
		data.setName("ホシガリス");
		data.setFeatures("つねに　木の実を　食っているので　" + "見かけ以上に　タフ。　木の実を　" + "狙って　畑に　現れる。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/819.png");
		return data;
	}

	@RequestMapping({ "/pokemon/820", "/pokemon/ヨクバリス", "/pokemon/Greedent" })
	public PokemonData poke820() {
		PokemonData data = new PokemonData();
		data.setId(820);
		data.setName("ヨクバリス");
		data.setFeatures("どんなに　硬い　木の実の　殻も　" + "自慢の　歯で　ボリボリ　齧る。　" + "ガラルでは　よく　見る　ポケモン。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/820.png");
		return data;
	}

	@RequestMapping({ "/pokemon/821", "/pokemon/ココガラ", "/pokemon/Rookidee" })
	public PokemonData poke821() {
		PokemonData data = new PokemonData();
		data.setId(821);
		data.setName("ココガラ");
		data.setFeatures("小さい　体で　機敏に　飛んで　" + "隙を　突く　戦法で　体の　" + "大きな　相手を　手玉に取る。");
		data.setType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/821.png");
		return data;
	}

	@RequestMapping({ "/pokemon/822", "/pokemon/アオガラス", "/pokemon/Corvisquire" })
	public PokemonData poke822() {
		PokemonData data = new PokemonData();
		data.setId(822);
		data.setName("アオガラス");
		data.setFeatures("厳しい　戦いを　くぐり抜けて　" + "相手の　力量を　正確に　" + "判断する　力が　身についた。");
		data.setType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/822.png");
		return data;
	}

	@RequestMapping({ "/pokemon/823", "/pokemon/アーマーガア", "/pokemon/Corviknight" })
	public PokemonData poke823() {
		PokemonData data = new PokemonData();
		data.setId(823);
		data.setName("アーマーガア");
		data.setFeatures("飛行能力に　優れていて　" + "とても　賢いため　ガラル地方で　" + "空の　タクシーとして　活躍。");
		data.setType("ひこう");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/823.png");
		return data;
	}

	@RequestMapping({ "/pokemon/824", "/pokemon/サッチムシ", "/pokemon/Blipbug" })
	public PokemonData poke824() {
		PokemonData data = new PokemonData();
		data.setId(824);
		data.setName("サッチムシ");
		data.setFeatures("畑で　よく見かける　ポケモン。　" + "体に　生えた　毛で　まわりで　" + "起きていることを　感じとる。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/824.png");
		return data;
	}

	@RequestMapping({ "/pokemon/825", "/pokemon/レドームシ", "/pokemon/Dottler" })
	public PokemonData poke825() {
		PokemonData data = new PokemonData();
		data.setId(825);
		data.setName("レドームシ");
		data.setFeatures("殻の　中で　成長中。　" + "サイコパワーで　外の　様子を　" + "うかがい　進化に　備えている。");
		data.setType("むし");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/825.png");
		return data;
	}

	@RequestMapping({ "/pokemon/826", "/pokemon/イオルブ", "/pokemon/Orbeetle" })
	public PokemonData poke826() {
		PokemonData data = new PokemonData();
		data.setId(826);
		data.setName("イオルブ");
		data.setFeatures("サイコパワーを　放ち　周囲を　" + "調べている。　観測範囲は　" + "周囲　１０キロにも　達するぞ。");
		data.setType("むし");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/826.png");
		return data;
	}

	@RequestMapping({ "/pokemon/827", "/pokemon/クスネ", "/pokemon/Nickit" })
	public PokemonData poke827() {
		PokemonData data = new PokemonData();
		data.setId(827);
		data.setName("クスネ");
		data.setFeatures("用心深く　ずる賢い。　" + "エサを　盗むと　しっぽで　" + "足跡を　消しながら　逃げるのだ。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/827.png");
		return data;
	}

	@RequestMapping({ "/pokemon/828", "/pokemon/フォクスライ", "/pokemon/Thievul" })
	public PokemonData poke828() {
		PokemonData data = new PokemonData();
		data.setId(828);
		data.setName("フォクスライ");
		data.setFeatures("身軽な　体と　鋭い　ツメで　" + "エサや　タマゴを　盗んで　まわる。　" + "パルスワンが　天敵。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/828.png");
		return data;
	}

	@RequestMapping({ "/pokemon/829", "/pokemon/ヒメンカ", "/pokemon/Gossifleur" })
	public PokemonData poke829() {
		PokemonData data = new PokemonData();
		data.setId(829);
		data.setName("ヒメンカ");
		data.setFeatures("そよ風で　くるくる　回りながら　" + "楽しそうに　歌う　愛らしさに　" + "魅せられ　育てる　人が　多い。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/829.png");
		return data;
	}

	@RequestMapping({ "/pokemon/830", "/pokemon/ワタシラガ", "/pokemon/Eldegoss" })
	public PokemonData poke830() {
		PokemonData data = new PokemonData();
		data.setId(830);
		data.setName("ワタシラガ");
		data.setFeatures("頭の　綿毛で　つくった　糸は　" + "光沢があり　とても　美しい。　" + "ガラル地方の　名産品。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/830.png");
		return data;
	}

	@RequestMapping({ "/pokemon/831", "/pokemon/ウールー", "/pokemon/Wooloo" })
	public PokemonData poke831() {
		PokemonData data = new PokemonData();
		data.setId(831);
		data.setName("ウールー");
		data.setFeatures("毛が　伸びすぎると　動けない。　" + "ウールーの　体毛で　織られた　" + "布は　驚くほど　丈夫。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/831.png");
		return data;
	}

	@RequestMapping({ "/pokemon/832", "/pokemon/バイウールー", "/pokemon/Dubwool" })
	public PokemonData poke832() {
		PokemonData data = new PokemonData();
		data.setId(832);
		data.setName("バイウールー");
		data.setFeatures("立派に　伸びた　ツノは　異性に　" + "アピールするために　生えている。　" + "武器として　使うことはない。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/832.png");
		return data;
	}

	@RequestMapping({ "/pokemon/833", "/pokemon/カムカメ", "/pokemon/Chewtle" })
	public PokemonData poke833() {
		PokemonData data = new PokemonData();
		data.setId(833);
		data.setName("カムカメ");
		data.setFeatures("頭の　ツノは　岩の　硬さ。　" + "ツノで　戦い　ひるんだ　隙に　" + "パクリと　噛みつき　離さない。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/833.png");
		return data;
	}

	@RequestMapping({ "/pokemon/834", "/pokemon/カジリガメ", "/pokemon/Drednaw" })
	public PokemonData poke834() {
		PokemonData data = new PokemonData();
		data.setId(834);
		data.setName("カジリガメ");
		data.setFeatures("首が　伸び縮みする。　離れた　" + "ところから　首を　一気に　伸ばし　" + "鋭い　キバで　敵を　しとめる。");
		data.setType("みず");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/834.png");
		return data;
	}

	@RequestMapping({ "/pokemon/835", "/pokemon/ワンパチ", "/pokemon/Yamper" })
	public PokemonData poke835() {
		PokemonData data = new PokemonData();
		data.setId(835);
		data.setName("ワンパチ");
		data.setFeatures("おやつに　釣られて　人の　仕事を　" + "手伝う　食いしん坊。　パチパチと　" + "電気を　まとって　ひた走る。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/835.png");
		return data;
	}

	@RequestMapping({ "/pokemon/836", "/pokemon/パルスワン", "/pokemon/Boltund" })
	public PokemonData poke836() {
		PokemonData data = new PokemonData();
		data.setId(836);
		data.setName("パルスワン");
		data.setFeatures("電気の　力で　脚力を　" + "増強。　トップスピードは　" + "時速　９０キロを　軽く　超える。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/836.png");
		return data;
	}

	@RequestMapping({ "/pokemon/837", "/pokemon/タンドン", "/pokemon/Rolycoly" })
	public PokemonData poke837() {
		PokemonData data = new PokemonData();
		data.setId(837);
		data.setName("タンドン");
		data.setFeatures("岩だらけの　悪路を　ものともせず　" + "一輪車のように　走りまわる。　" + "石炭を　燃やして　生きている。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/837.png");
		return data;
	}

	@RequestMapping({ "/pokemon/838", "/pokemon/トロッゴン", "/pokemon/Carkol" })
	public PokemonData poke838() {
		PokemonData data = new PokemonData();
		data.setId(838);
		data.setName("トロッゴン");
		data.setFeatures("脚を　高速で　回転させて　" + "時速３０キロで　走る。　摂氏　" + "１０００度の　炎を　噴き出す。");
		data.setType("いわ");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/838.png");
		return data;
	}

	@RequestMapping({ "/pokemon/839", "/pokemon/セキタンザン", "/pokemon/Coalossal" })
	public PokemonData poke839() {
		PokemonData data = new PokemonData();
		data.setId(839);
		data.setName("セキタンザン");
		data.setFeatures("戦いになると　石炭の　山が　" + "真っ赤に　燃え上がり　火の粉を　" + "まき散らして　周囲を　焦がす。");
		data.setType("いわ");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/839.png");
		return data;
	}

	@RequestMapping({ "/pokemon/840", "/pokemon/カジッチュ", "/pokemon/Applin" })
	public PokemonData poke840() {
		PokemonData data = new PokemonData();
		data.setId(840);
		data.setName("カジッチュ");
		data.setFeatures("生まれると　りんごに　潜りこむ。　" + "中身を　食べながら　成長し　" + "りんごの　味が　進化を　決める。");
		data.setType("くさ");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/840.png");
		return data;
	}

	@RequestMapping({ "/pokemon/841", "/pokemon/アップリュー", "/pokemon/Flapple" })
	public PokemonData poke841() {
		PokemonData data = new PokemonData();
		data.setId(841);
		data.setName("アップリュー");
		data.setFeatures("りんごの　皮の　翼で　飛んで　" + "強酸性の　唾液を　飛ばす。　" + "りんごの　形に　変形する。");
		data.setType("くさ");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/841.png");
		return data;
	}

	@RequestMapping({ "/pokemon/842", "/pokemon/タルップル", "/pokemon/Appletun" })
	public PokemonData poke842() {
		PokemonData data = new PokemonData();
		data.setId(842);
		data.setName("タルップル");
		data.setFeatures("甘い　蜜で　体が　おおわれ　" + "背中の　皮は　とくに　甘く　" + "昔は　子どもの　おやつだった。");
		data.setType("くさ");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/842.png");
		return data;
	}

	@RequestMapping({ "/pokemon/843", "/pokemon/スナヘビ", "/pokemon/Silicobra" })
	public PokemonData poke843() {
		PokemonData data = new PokemonData();
		data.setId(843);
		data.setName("スナヘビ");
		data.setFeatures("鼻の　穴から　砂を　噴射。　" + "敵の　目を　くらました　隙に　" + "地中に　潜って　身を　隠す。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/843.png");
		return data;
	}

	@RequestMapping({ "/pokemon/844", "/pokemon/サダイジャ", "/pokemon/Sandaconda" })
	public PokemonData poke844() {
		PokemonData data = new PokemonData();
		data.setId(844);
		data.setName("サダイジャ");
		data.setFeatures("独特の　とぐろの　巻き方は　" + "砂袋の　砂を　より　効率　" + "よく　噴射　するため　なのだ。");
		data.setType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/844.png");
		return data;
	}

	@RequestMapping({ "/pokemon/845", "/pokemon/ウッウ", "/pokemon/Cramorant" })
	public PokemonData poke845() {
		PokemonData data = new PokemonData();
		data.setId(845);
		data.setName("ウッウ");
		data.setFeatures("食いしん坊で　エサの　サシカマスを　" + "丸飲みするが　たまに　間違えて　" + "ほかの　ポケモンに　食らいつく。");
		data.setType("ひこう");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/845.png");
		return data;
	}

	@RequestMapping({ "/pokemon/846", "/pokemon/サシカマス", "/pokemon/Arrokuda" })
	public PokemonData poke846() {
		PokemonData data = new PokemonData();
		data.setId(846);
		data.setName("サシカマス");
		data.setFeatures("腹一杯で　極端に　" + "動きが　鈍った　ところを　" + "ウッウに　丸飲みに　される。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/846.png");
		return data;
	}

	@RequestMapping({ "/pokemon/847", "/pokemon/カマスジョー", "/pokemon/Barraskewda" })
	public PokemonData poke847() {
		PokemonData data = new PokemonData();
		data.setId(847);
		data.setName("カマスジョー");
		data.setFeatures("尾びれを　回転させ　一気に　" + "突撃。　１００ノットを　超える　" + "速度で　獲物を　つらぬくぞ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/847.png");
		return data;
	}

	@RequestMapping({ "/pokemon/848", "/pokemon/エレズン", "/pokemon/Toxel" })
	public PokemonData poke848() {
		PokemonData data = new PokemonData();
		data.setId(848);
		data.setName("エレズン");
		data.setFeatures("毒素を　化学変化　させて　" + "電気を　出す。　電力は　" + "弱いが　ビリビリと　痺れる。");
		data.setType("でんき");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/848.png");
		return data;
	}

	@RequestMapping({ "/pokemon/849", "/pokemon/ストリンダー", "/pokemon/Toxtricity" })
	public PokemonData poke849() {
		PokemonData data = new PokemonData();
		data.setId(849);
		data.setName("ストリンダー");
		data.setFeatures("ケンカ腰で　気が　短い。　" + "よどんだ　水を　がぶ飲みして　" + "水中の　毒素を　取りこむ。");
		data.setType("でんき");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/849.png");
		return data;
	}

	@RequestMapping({ "/pokemon/850", "/pokemon/ヤクデ", "/pokemon/Sizzlipede" })
	public PokemonData poke850() {
		PokemonData data = new PokemonData();
		data.setId(850);
		data.setName("ヤクデ");
		data.setFeatures("発熱した　体で　獲物を　" + "締め上げる。　こんがり　焼けたら　" + "むしゃむしゃ　いただくのだ。");
		data.setType("ほのお");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/850.png");
		return data;
	}

	@RequestMapping({ "/pokemon/851", "/pokemon/マルヤクデ", "/pokemon/Centiskorch" })
	public PokemonData poke851() {
		PokemonData data = new PokemonData();
		data.setId(851);
		data.setName("マルヤクデ");
		data.setFeatures("攻撃的な　性質。　" + "焼けた　体も　危険だが　" + "大きな　キバも　鋭いぞ。");
		data.setType("ほのお");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/851.png");
		return data;
	}

	@RequestMapping({ "/pokemon/852", "/pokemon/タタッコ", "/pokemon/Clobbopus" })
	public PokemonData poke852() {
		PokemonData data = new PokemonData();
		data.setId(852);
		data.setName("タタッコ");
		data.setFeatures("３歳児　くらいの　賢さ。　" + "触手は　よくちぎれるが　" + "再生するので　気にしない。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/852.png");
		return data;
	}

	@RequestMapping({ "/pokemon/853", "/pokemon/オトスパス", "/pokemon/Grapploct" })
	public PokemonData poke853() {
		PokemonData data = new PokemonData();
		data.setId(853);
		data.setName("オトスパス");
		data.setFeatures("おのれの腕を　試すべく　陸に　" + "上がり　対戦相手を　探す。　" + "戦い終えると　海に　帰る。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/853.png");
		return data;
	}

	@RequestMapping({ "/pokemon/854", "/pokemon/ヤバチャ", "/pokemon/Sinistea" })
	public PokemonData poke854() {
		PokemonData data = new PokemonData();
		data.setId(854);
		data.setName("ヤバチャ");
		data.setFeatures("すみかに　している　ティーカップは　" + "有名な　アンティークの　食器。　" + "多くの　贋作が　出回っている。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/854.png");
		return data;
	}

	@RequestMapping({ "/pokemon/855", "/pokemon/ポットデス", "/pokemon/Polteageist" })
	public PokemonData poke855() {
		PokemonData data = new PokemonData();
		data.setId(855);
		data.setName("ポットデス");
		data.setFeatures("残された　紅茶を　見かけると　" + "自分の　体を　注ぎこむ。　" + "その　紅茶は　ポットデスになる。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/855.png");
		return data;
	}

	@RequestMapping({ "/pokemon/856", "/pokemon/ミブリム", "/pokemon/Hatenna" })
	public PokemonData poke856() {
		PokemonData data = new PokemonData();
		data.setId(856);
		data.setName("ミブリム");
		data.setFeatures("人気の　ない　場所が　好き。　" + "強い　感情を　感じとると　" + "一目散に　逃げ出してしまう。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/856.png");
		return data;
	}

	@RequestMapping({ "/pokemon/857", "/pokemon/テブリム", "/pokemon/Hattrem" })
	public PokemonData poke857() {
		PokemonData data = new PokemonData();
		data.setId(857);
		data.setName("テブリム");
		data.setFeatures("頭の房で　相手を　殴り　" + "黙らせる。　プロボクサーさえ　" + "一発　ＫＯの　破壊力。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/857.png");
		return data;
	}

	@RequestMapping({ "/pokemon/858", "/pokemon/ブリムオン", "/pokemon/Hatterene" })
	public PokemonData poke858() {
		PokemonData data = new PokemonData();
		data.setId(858);
		data.setName("ブリムオン");
		data.setFeatures("別名は　森の　魔女。　" + "騒ぎたてると　触手のツメで　" + "引き裂かれるかも　しれないぞ。");
		data.setType("エスパー");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/858.png");
		return data;
	}

	@RequestMapping({ "/pokemon/859", "/pokemon/ベロバー", "/pokemon/Impidimp" })
	public PokemonData poke859() {
		PokemonData data = new PokemonData();
		data.setId(859);
		data.setName("ベロバー");
		data.setFeatures("民家に　忍びこみ　盗みを　" + "働き　さらに　悔しがる　人の　" + "マイナスエネルギーも　いただくのだ。");
		data.setType("あく");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/859.png");
		return data;
	}

	@RequestMapping({ "/pokemon/860", "/pokemon/ギモー", "/pokemon/Morgrem" })
	public PokemonData poke860() {
		PokemonData data = new PokemonData();
		data.setId(860);
		data.setName("ギモー");
		data.setFeatures("悪知恵を　使って　夜の　森に　" + "誘い込もうとする。　農作物を　" + "育てる　力を　もつらしい。");
		data.setType("あく");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/860.png");
		return data;
	}

	@RequestMapping({ "/pokemon/861", "/pokemon/オーロンゲ", "/pokemon/Grimmsnarl" })
	public PokemonData poke861() {
		PokemonData data = new PokemonData();
		data.setId(861);
		data.setName("オーロンゲ");
		data.setFeatures("髪の毛は　筋肉繊維の　ように　" + "働き　ほどけると　触手の　" + "動きで　相手を　絡めとる。");
		data.setType("あく");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/861.png");
		return data;
	}

	@RequestMapping({ "/pokemon/862", "/pokemon/タチフサグマ", "/pokemon/Obstagoon" })
	public PokemonData poke862() {
		PokemonData data = new PokemonData();
		data.setId(862);
		data.setName("タチフサグマ");
		data.setFeatures("ケンカを　繰り返し　進化。　" + "腕をクロスし　叫ぶ　雄叫びは　" + "どんな　相手も　怯ませるぞ。");
		data.setType("あく");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/862.png");
		return data;
	}

	@RequestMapping({ "/pokemon/863", "/pokemon/ニャイキング", "/pokemon/Perrserker" })
	public PokemonData poke863() {
		PokemonData data = new PokemonData();
		data.setId(863);
		data.setName("ニャイキング");
		data.setFeatures("戦いに　明け暮れて　進化した　" + "結果　伸ばすと　短剣に　変わる　" + "物騒な　ツメを　手に入れた。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/863.png");
		return data;
	}

	@RequestMapping({ "/pokemon/864", "/pokemon/サニゴーン", "/pokemon/Cursola" })
	public PokemonData poke864() {
		PokemonData data = new PokemonData();
		data.setId(864);
		data.setName("サニゴーン");
		data.setFeatures("魂を　被う　霊体の　" + "体には　注意。　触れると　" + "石のように　動けなく　なるぞ。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/864.png");
		return data;
	}

	@RequestMapping({ "/pokemon/865", "/pokemon/ネギガナイト", "/pokemon/Sirfetch’d" })
	public PokemonData poke865() {
		PokemonData data = new PokemonData();
		data.setId(865);
		data.setName("ネギガナイト");
		data.setFeatures("硬いネギの　葉で　攻撃を　" + "いなし　鋭い　茎で　反撃。　" + "ネギは　武具であり　食材。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/865.png");
		return data;
	}

	@RequestMapping({ "/pokemon/866", "/pokemon/バリコオル", "/pokemon/Mr. Rime" })
	public PokemonData poke866() {
		PokemonData data = new PokemonData();
		data.setId(866);
		data.setName("バリコオル");
		data.setFeatures("ユーモラスな　動きで　みんなの　" + "人気者。　お腹の　模様から　" + "サイコパワーを　放出する。");
		data.setType("こおり");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/866.png");
		return data;
	}

	@RequestMapping({ "/pokemon/867", "/pokemon/デスバーン", "/pokemon/Runerigus" })
	public PokemonData poke867() {
		PokemonData data = new PokemonData();
		data.setId(867);
		data.setName("デスバーン");
		data.setFeatures("影の　ような　体に　触れては　" + "いけない。　絵に　刻まれた　" + "恐ろしい　記憶を　見せられるぞ。");
		data.setType("じめん");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/867.png");
		return data;
	}

	@RequestMapping({ "/pokemon/868", "/pokemon/マホミル", "/pokemon/Milcery" })
	public PokemonData poke868() {
		PokemonData data = new PokemonData();
		data.setId(868);
		data.setName("マホミル");
		data.setFeatures("マホミルが　姿を　みせた　" + "パティスリーは　大繁盛が　" + "約束されると　いわれている。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/868.png");
		return data;
	}

	@RequestMapping({ "/pokemon/869", "/pokemon/マホイップ", "/pokemon/Alcremie" })
	public PokemonData poke869() {
		PokemonData data = new PokemonData();
		data.setId(869);
		data.setName("マホイップ");
		data.setFeatures("手から　生みだす　クリームは　" + "マホイップが　幸せなとき　" + "甘味と　コクが　深まる。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/869.png");
		return data;
	}

	@RequestMapping({ "/pokemon/870", "/pokemon/タイレーツ", "/pokemon/Falinks" })
	public PokemonData poke870() {
		PokemonData data = new PokemonData();
		data.setId(870);
		data.setName("タイレーツ");
		data.setFeatures("６匹で　１匹の　ポケモン。　" + "隊列を　組み替えながら　" + "チームワークで　戦うのだ。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/870.png");
		return data;
	}

	@RequestMapping({ "/pokemon/871", "/pokemon/バチンウニ", "/pokemon/Pincurchin" })
	public PokemonData poke871() {
		PokemonData data = new PokemonData();
		data.setId(871);
		data.setName("バチンウニ");
		data.setFeatures("棘の　１本　１本に　電気を　" + "蓄える。　折れた　棘でも　" + "３時間は　放電を　続けるぞ。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/871.png");
		return data;
	}

	@RequestMapping({ "/pokemon/872", "/pokemon/ユキハミ", "/pokemon/Snom" })
	public PokemonData poke872() {
		PokemonData data = new PokemonData();
		data.setId(872);
		data.setName("ユキハミ");
		data.setFeatures("地面に　積もった　雪を　食べる。　" + "たくさん　食べれば　食べるほど　" + "背中の　棘は　立派に　育つ。");
		data.setType("こおり");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/872.png");
		return data;
	}

	@RequestMapping({ "/pokemon/873", "/pokemon/モスノウ", "/pokemon/Frosmoth" })
	public PokemonData poke873() {
		PokemonData data = new PokemonData();
		data.setId(873);
		data.setName("モスノウ");
		data.setFeatures("野山を　荒らすものには　容赦　" + "しない。　冷たいはねで　飛びまわり　" + "吹雪を　起こして　懲らしめる。");
		data.setType("こおり");
		data.setSecondType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/873.png");
		return data;
	}

	@RequestMapping({ "/pokemon/874", "/pokemon/イシヘンジン", "/pokemon/Stonjourner" })
	public PokemonData poke874() {
		PokemonData data = new PokemonData();
		data.setId(874);
		data.setName("イシヘンジン");
		data.setFeatures("１年に　一度　きまった　日時に　" + "どこから　ともなく　集まり　輪に　" + "なって　並ぶ　習性が　ある。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/874.png");
		return data;
	}

	@RequestMapping({ "/pokemon/875", "/pokemon/コオリッポ", "/pokemon/Eiscue" })
	public PokemonData poke875() {
		PokemonData data = new PokemonData();
		data.setId(875);
		data.setName("コオリッポ");
		data.setFeatures("暑さに　弱い　顔を　いつも　" + "氷で　冷やしている。　頭の　" + "毛を　海に　たらして　餌を釣る。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/875.png");
		return data;
	}

	@RequestMapping({ "/pokemon/876", "/pokemon/イエッサン", "/pokemon/Indeedee" })
	public PokemonData poke876() {
		PokemonData data = new PokemonData();
		data.setId(876);
		data.setName("イエッサン");
		data.setFeatures("ツノで　近くの　生き物の　" + "気持ちを　感じとる。　ポジティブな　" + "感情が　力の　源。");
		data.setType("エスパー");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/876.png");
		return data;
	}

	@RequestMapping({ "/pokemon/877", "/pokemon/モルペコ", "/pokemon/Morpeko" })
	public PokemonData poke877() {
		PokemonData data = new PokemonData();
		data.setId(877);
		data.setName("モルペコ");
		data.setFeatures("どんなに　食べても　すぐに　お腹が　" + "すく。　電気で　ローストした　" + "タネを　大切に　持ち歩く。");
		data.setType("でんき");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/877.png");
		return data;
	}

	@RequestMapping({ "/pokemon/878", "/pokemon/ゾウドウ", "/pokemon/Cufant" })
	public PokemonData poke878() {
		PokemonData data = new PokemonData();
		data.setId(878);
		data.setName("ゾウドウ");
		data.setFeatures("力仕事なら　お任せ。　" + "銅の　体は　雨で　錆び　" + "鮮やかな　緑に　変わる。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/878.png");
		return data;
	}

	@RequestMapping({ "/pokemon/879", "/pokemon/ダイオウドウ", "/pokemon/Copperajah" })
	public PokemonData poke879() {
		PokemonData data = new PokemonData();
		data.setId(879);
		data.setName("ダイオウドウ");
		data.setFeatures("群れを　つくって　暮らしている。　" + "鼻の　握力は　大岩も　" + "粉々に　砕くほど　強い。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/879.png");
		return data;
	}

	@RequestMapping({ "/pokemon/880", "/pokemon/パッチラゴン", "/pokemon/Dracozolt" })
	public PokemonData poke880() {
		PokemonData data = new PokemonData();
		data.setId(880);
		data.setName("パッチラゴン");
		data.setFeatures("しっぽの　たくましい　筋肉で　" + "発電する。　下半身に　くらべ　" + "上半身が　小さすぎる。");
		data.setType("でんき");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/880.png");
		return data;
	}

	@RequestMapping({ "/pokemon/881", "/pokemon/パッチルドン", "/pokemon/Arctozolt" })
	public PokemonData poke881() {
		PokemonData data = new PokemonData();
		data.setId(881);
		data.setName("パッチルドン");
		data.setFeatures("古代の　海辺で　暮らし　餌を　" + "体の　氷で　保存できたが　" + "動きが　鈍いため　絶滅した。");
		data.setType("でんき");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/881.png");
		return data;
	}

	@RequestMapping({ "/pokemon/882", "/pokemon/ウオノラゴン", "/pokemon/Dracovish" })
	public PokemonData poke882() {
		PokemonData data = new PokemonData();
		data.setId(882);
		data.setName("ウオノラゴン");
		data.setFeatures("時速６０キロを　超える　自慢の　" + "脚力で　走れるが　" + "水中でしか　呼吸できない。");
		data.setType("みず");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/882.png");
		return data;
	}

	@RequestMapping({ "/pokemon/883", "/pokemon/ウオチルドン", "/pokemon/Arctovish" })
	public PokemonData poke883() {
		PokemonData data = new PokemonData();
		data.setId(883);
		data.setName("ウオチルドン");
		data.setFeatures("どんな　攻撃にも　傷つかない　" + "面の皮を　もつが　呼吸が　" + "不自由だったため　絶滅した。");
		data.setType("みず");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/883.png");
		return data;
	}

	@RequestMapping({ "/pokemon/884", "/pokemon/ジュラルドン", "/pokemon/Duraludon" })
	public PokemonData poke884() {
		PokemonData data = new PokemonData();
		data.setId(884);
		data.setName("ジュラルドン");
		data.setFeatures("特殊な　金属の　体は　" + "軽く　身のこなしは　抜群。　" + "雨が　苦手で　洞窟に　棲む。");
		data.setType("はがね");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/884.png");
		return data;
	}

	@RequestMapping({ "/pokemon/885", "/pokemon/ドラメシヤ", "/pokemon/Dreepy" })
	public PokemonData poke885() {
		PokemonData data = new PokemonData();
		data.setId(885);
		data.setName("ドラメシヤ");
		data.setFeatures("１匹では　子どもにも　負けるくらい　" + "非力だが　仲間の　協力で　" + "鍛えられ　進化して　強くなる。");
		data.setType("ドラゴン");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/885.png");
		return data;
	}

	@RequestMapping({ "/pokemon/886", "/pokemon/ドロンチ", "/pokemon/Drakloak" })
	public PokemonData poke886() {
		PokemonData data = new PokemonData();
		data.setId(886);
		data.setName("ドロンチ");
		data.setFeatures("世話をする　ドラメシヤを　頭に　" + "乗せていないと　落ち着かないので　" + "ほかの　ポケモンを　乗せようとする。");
		data.setType("ドラゴン");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/886.png");
		return data;
	}

	@RequestMapping({ "/pokemon/887", "/pokemon/ドラパルト", "/pokemon/Dragapult" })
	public PokemonData poke887() {
		PokemonData data = new PokemonData();
		data.setId(887);
		data.setName("ドラパルト");
		data.setFeatures("ツノに　入った　ドラメシヤは　" + "マッハの　スピードで　飛ばされるのを　" + "心待ちに　しているらしい。");
		data.setType("ドラゴン");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/887.png");
		return data;
	}

	@RequestMapping({ "/pokemon/888", "/pokemon/ザシアン", "/pokemon/Zacian" })
	public PokemonData poke888() {
		PokemonData data = new PokemonData();
		data.setId(888);
		data.setName("ザシアン");
		data.setFeatures("長い　眠りに　ついていた　" + "ザマゼンタの　姉　とも　" + "ライバルとも　いわれる　ポケモン。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/888.png");
		return data;
	}

	@RequestMapping({ "/pokemon/889", "/pokemon/ザマゼンタ", "/pokemon/Zamazenta" })
	public PokemonData poke889() {
		PokemonData data = new PokemonData();
		data.setId(889);
		data.setName("ザマゼンタ");
		data.setFeatures("石像の　ような　姿で　" + "忘れ去られるほどの　あいだ　" + "眠りに　ついていた　ポケモン。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/889.png");
		return data;
	}

	@RequestMapping({ "/pokemon/890", "/pokemon/ムゲンダイナ", "/pokemon/Eternatus" })
	public PokemonData poke890() {
		PokemonData data = new PokemonData();
		data.setId(890);
		data.setName("ムゲンダイナ");
		data.setFeatures("２万年前に　落ちた　隕石の　" + "中に　いた。　ダイマックスの　" + "謎に　関係している　らしい。");
		data.setType("どく");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/890.png");
		return data;
	}

	@RequestMapping({ "/pokemon/891", "/pokemon/ダクマ", "/pokemon/Kubfu" })
	public PokemonData poke891() {
		PokemonData data = new PokemonData();
		data.setId(891);
		data.setName("ダクマ");
		data.setFeatures("頭の　白く　長い　体毛を　" + "引っぱると　気合が　高まり　" + "丹田から　パワーが　湧きあがる。");
		data.setType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/891.png");
		return data;
	}

	@RequestMapping({ "/pokemon/892", "/pokemon/ウーラオス", "/pokemon/Urshifu" })
	public PokemonData poke892() {
		PokemonData data = new PokemonData();
		data.setId(892);
		data.setName("ウーラオス");
		data.setFeatures("遠い　地方の　山岳地帯で　" + "暮らす。　断崖絶壁を　走り　" + "足腰を　鍛え　技を　磨く。");
		data.setType("かくとう");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/892.png");
		return data;
	}

	@RequestMapping({ "/pokemon/893", "/pokemon/ザルード", "/pokemon/Zarude" })
	public PokemonData poke893() {
		PokemonData data = new PokemonData();
		data.setId(893);
		data.setName("ザルード");
		data.setFeatures("体に　生える　ツルは　ちぎれると　" + "土の　栄養分となって　森の　" + "植物たちを　育てるのだ。");
		data.setType("あく");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/893.png");
		return data;
	}

	@RequestMapping({ "/pokemon/894", "/pokemon/レジエレキ", "/pokemon/Regieleki" })
	public PokemonData poke894() {
		PokemonData data = new PokemonData();
		data.setId(894);
		data.setName("レジエレキ");
		data.setFeatures("全身が　電気エネルギーを　" + "作る　器官。　ガラル全土の　" + "電気を　作りだすことができる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/894.png");
		return data;
	}

	@RequestMapping({ "/pokemon/895", "/pokemon/レジドラゴ", "/pokemon/Regidrago" })
	public PokemonData poke895() {
		PokemonData data = new PokemonData();
		data.setId(895);
		data.setName("レジドラゴ");
		data.setFeatures("全身が　ドラゴンエネルギーの　" + "結晶。　すべての　ドラゴン　" + "ポケモンの　力を　持つらしい。");
		data.setType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/895.png");
		return data;
	}

	@RequestMapping({ "/pokemon/896", "/pokemon/ブリザポス", "/pokemon/Glastrier" })
	public PokemonData poke896() {
		PokemonData data = new PokemonData();
		data.setId(896);
		data.setName("ブリザポス");
		data.setFeatures("凄まじい　怪力の　持ち主。　" + "顔を　覆う　氷の　マスクは　" + "ダイヤモンドの　１００倍　硬い。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/896.png");
		return data;
	}

	@RequestMapping({ "/pokemon/897", "/pokemon/レイスポス", "/pokemon/Spectrier" })
	public PokemonData poke897() {
		PokemonData data = new PokemonData();
		data.setId(897);
		data.setName("レイスポス");
		data.setFeatures("闇夜を　駆けぬけ　寝ているものの　" + "生命エネルギーを　吸い取る。　" + "孤独と　静寂を　好む。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/897.png");
		return data;
	}

	@RequestMapping({ "/pokemon/898", "/pokemon/バドレックス", "/pokemon/Calyrex" })
	public PokemonData poke898() {
		PokemonData data = new PokemonData();
		data.setId(898);
		data.setName("バドレックス");
		data.setFeatures("大昔の　ガラルを　統べていた　" + "伝説の　王。　心を　癒し　" + "草木を　芽吹かせる　力がある。");
		data.setType("エスパー");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/898.png");
		return data;
	}

	@RequestMapping({ "/pokemon/899", "/pokemon/アヤシシ", "/pokemon/Wyrdeer" })
	public PokemonData poke899() {
		PokemonData data = new PokemonData();
		data.setId(899);
		data.setName("アヤシシ");
		data.setFeatures("目に見えぬ　壁を作りしとき　黒き珠　" + "妖しく　輝きたり。　抜け落ちし　髭は　温かく　" + "冬衣の　原料に　重宝す。");
		data.setType("ノーマル");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/899.png");
		return data;
	}

	@RequestMapping({ "/pokemon/900", "/pokemon/バサギリ", "/pokemon/Kleavor" })
	public PokemonData poke900() {
		PokemonData data = new PokemonData();
		data.setId(900);
		data.setName("バサギリ");
		data.setFeatures("硬き岩で　身を守り　無骨な　斧は　" + "大木を　切り倒す。気性　荒々しく　荒地にて　" + "遭遇しときは　逃げの一手。");
		data.setType("むし");
		data.setSecondType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/900.png");
		return data;
	}

	@RequestMapping({ "/pokemon/901", "/pokemon/ガチグマ", "/pokemon/Ursaluna" })
	public PokemonData poke901() {
		PokemonData data = new PokemonData();
		data.setId(901);
		data.setName("ガチグマ");
		data.setFeatures("ヒスイの地に　敷かれし　湿地の土こそ　" + "頑丈なる体躯と　泥炭を　自在に　扱う　" + "新たな　器量　もたらしたと　考察す。");
		data.setType("じめん");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/901.png");
		return data;
	}

	@RequestMapping({ "/pokemon/902", "/pokemon/イダイトウ", "/pokemon/Basculegion" })
	public PokemonData poke902() {
		PokemonData data = new PokemonData();
		data.setId(902);
		data.setName("イダイトウ");
		data.setFeatures("遡上の旅路にて　志半ばに　散った　" + "輩の魂を　まとう。　ヒスイ　流れし　" + "河川においては　敵うもの　皆無なり。");
		data.setType("みず");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/902.png");
		return data;
	}

	@RequestMapping({ "/pokemon/903", "/pokemon/オオニューラ", "/pokemon/Sneasler" })
	public PokemonData poke903() {
		PokemonData data = new PokemonData();
		data.setId(903);
		data.setName("オオニューラ");
		data.setFeatures("他種圧倒する　身体能力と　猛毒　有し　" + "寒冷なる　高地においては　敵なし。　" + "群れ成さず　単独を良しとする　性質。");
		data.setType("かくとう");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/903.png");
		return data;
	}

	@RequestMapping({ "/pokemon/904", "/pokemon/ハリーマン", "/pokemon/Overqwil" })
	public PokemonData poke904() {
		PokemonData data = new PokemonData();
		data.setId(904);
		data.setName("ハリーマン");
		data.setFeatures("槍の如き　針と　凶暴なる　気質にて　" + "海鬼の　異名を　持つ　ポケモン。　" + "毒を　すすりて　己の　糧とす。");
		data.setType("あく");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/904.png");
		return data;
	}

	@RequestMapping({ "/pokemon/905", "/pokemon/ラブトロス", "/pokemon/Enamorus" })
	public PokemonData poke905() {
		PokemonData data = new PokemonData();
		data.setId(905);
		data.setName("ラブトロス");
		data.setFeatures("海を越えて　飛来したらば　厳しき冬の　" + "終わりを知る。　慈愛が　ヒスイの地に　" + "新しき命　芽吹かせるとの　伝承あり。");
		data.setType("フェアリー");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/905.png");
		return data;
	}

	@RequestMapping({ "/pokemon/906", "/pokemon/ニャオハ", "/pokemon/Sprigatito" })
	public PokemonData poke906() {
		PokemonData data = new PokemonData();
		data.setId(906);
		data.setName("ニャオハ");
		data.setFeatures("フワフワの　体毛は　" + "植物に　近い　成分。　" + "こまめに　顔を　洗って　乾燥を　防ぐ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/906.png");
		return data;
	}

	@RequestMapping({ "/pokemon/907", "/pokemon/ニャローテ", "/pokemon/Floragato" })
	public PokemonData poke907() {
		PokemonData data = new PokemonData();
		data.setId(907);
		data.setName("ニャローテ");
		data.setFeatures("長い　体毛の下に　隠した　ツタを　" + "器用に　操り　硬い　つぼみを　" + "敵に　叩きつける。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/907.png");
		return data;
	}

	@RequestMapping({ "/pokemon/908", "/pokemon/マスカーニャ", "/pokemon/Meowscarada" })
	public PokemonData poke908() {
		PokemonData data = new PokemonData();
		data.setId(908);
		data.setName("マスカーニャ");
		data.setFeatures("浮いているように　見える　花は　" + "マント裏の　毛の　反射で　" + "茎を　カモフラージュしているのだ。");
		data.setType("くさ");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/908.png");
		return data;
	}

	@RequestMapping({ "/pokemon/909", "/pokemon/ホゲータ", "/pokemon/Fuecoco" })
	public PokemonData poke909() {
		PokemonData data = new PokemonData();
		data.setId(909);
		data.setName("ホゲータ");
		data.setFeatures("温かい　岩の上で　寝転び　" + "四角い　うろこから　取り込んだ　熱で　" + "炎エネルギーを　作る。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/909.png");
		return data;
	}

	@RequestMapping({ "/pokemon/910", "/pokemon/アチゲータ", "/pokemon/Crocalor" })
	public PokemonData poke910() {
		PokemonData data = new PokemonData();
		data.setId(910);
		data.setName("アチゲータ");
		data.setFeatures("炎エネルギーと　有り余る　" + "生命力が　交じり　頭上に　" + "タマゴ型の　火玉が　現れた。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/910.png");
		return data;
	}

	@RequestMapping({ "/pokemon/911", "/pokemon/ラウドボーン", "/pokemon/Skeledirge" })
	public PokemonData poke911() {
		PokemonData data = new PokemonData();
		data.setId(911);
		data.setName("ラウドボーン");
		data.setFeatures("歌声で　姿かたちを　変える　" + "炎の鳥は　頭上の　火玉に　" + "魂が　宿ったもの　だという。");
		data.setType("ほのお");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/911.png");
		return data;
	}

	@RequestMapping({ "/pokemon/912", "/pokemon/クワッス", "/pokemon/Quaxly" })
	public PokemonData poke912() {
		PokemonData data = new PokemonData();
		data.setId(912);
		data.setName("クワッス");
		data.setFeatures("昔　遠い　土地から　やって来て　" + "棲みついた。　羽から　分泌する　" + "ジェルは　水と　汚れを　弾く。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/912.png");
		return data;
	}

	@RequestMapping({ "/pokemon/913", "/pokemon/ウェルカモ", "/pokemon/Quaxwell" })
	public PokemonData poke913() {
		PokemonData data = new PokemonData();
		data.setId(913);
		data.setName("ウェルカモ");
		data.setFeatures("ひたすらに　浅瀬を　走り込んで　" + "足腰を　鍛え　仲間同士で　" + "足技の　華麗さを　競いあう。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/913.png");
		return data;
	}

	@RequestMapping({ "/pokemon/914", "/pokemon/ウェーニバル", "/pokemon/Quaquaval" })
	public PokemonData poke914() {
		PokemonData data = new PokemonData();
		data.setId(914);
		data.setName("ウェーニバル");
		data.setFeatures("ひと蹴りで　トラックを　転がす　" + "強靭な　脚力を　駆使し　" + "エキゾチックな　踊りを　みせる。");
		data.setType("みず");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/914.png");
		return data;
	}

	@RequestMapping({ "/pokemon/915", "/pokemon/グルトン", "/pokemon/Lechonk" })
	public PokemonData poke915() {
		PokemonData data = new PokemonData();
		data.setId(915);
		data.setName("グルトン");
		data.setFeatures("一日中　エサを　探す。　" + "優れた　嗅覚を　持つが　" + "エサ探し　以外に　使わない。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/915.png");
		return data;
	}

	@RequestMapping({ "/pokemon/916", "/pokemon/パフュートン", "/pokemon/Oinkologne" })
	public PokemonData poke916() {
		PokemonData data = new PokemonData();
		data.setId(916);
		data.setName("パフュートン");
		data.setFeatures("きめ細かく　艶やかな　肌が　" + "自慢。　尻尾の　先端から　" + "凝縮した　香りを　放つ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/916.png");
		return data;
	}

	@RequestMapping({ "/pokemon/917", "/pokemon/タマンチュラ", "/pokemon/Tarountula" })
	public PokemonData poke917() {
		PokemonData data = new PokemonData();
		data.setId(917);
		data.setName("タマンチュラ");
		data.setFeatures("体を　包みこむ　糸玉は　" + "天敵の　ストライクの　カマを　" + "はね返す　弾力性を　持つ。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/917.png");
		return data;
	}

	@RequestMapping({ "/pokemon/918", "/pokemon/ワナイダー", "/pokemon/Spidops" })
	public PokemonData poke918() {
		PokemonData data = new PokemonData();
		data.setId(918);
		data.setName("ワナイダー");
		data.setFeatures("木の枝や　天井に　糸で　張りつき　" + "音もなく　行動する。　" + "獲物に　気づかれる前に　倒す。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/918.png");
		return data;
	}

	@RequestMapping({ "/pokemon/919", "/pokemon/マメバッタ", "/pokemon/Nymble" })
	public PokemonData poke919() {
		PokemonData data = new PokemonData();
		data.setId(919);
		data.setName("マメバッタ");
		data.setFeatures("第３の脚が　畳まれている。　" + "ピンチになると　１０メートル以上　" + "ジャンプする　脚力を　持つ。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/919.png");
		return data;
	}

	@RequestMapping({ "/pokemon/920", "/pokemon/エクスレッグ", "/pokemon/Lokix" })
	public PokemonData poke920() {
		PokemonData data = new PokemonData();
		data.setId(920);
		data.setName("エクスレッグ");
		data.setFeatures("本気になると　畳んでいた　脚で　" + "立ち上がり　決戦モードになる。　" + "短時間で　敵を　制圧する。");
		data.setType("むし");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/920.png");
		return data;
	}

	@RequestMapping({ "/pokemon/921", "/pokemon/パモ", "/pokemon/Pawmi" })
	public PokemonData poke921() {
		PokemonData data = new PokemonData();
		data.setId(921);
		data.setName("パモ");
		data.setFeatures("頬の　電気袋は　未発達。　" + "前脚の　肉球で　懸命に　" + "擦ると　ようやく　発電できる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/921.png");
		return data;
	}

	@RequestMapping({ "/pokemon/922", "/pokemon/パモット", "/pokemon/Pawmo" })
	public PokemonData poke922() {
		PokemonData data = new PokemonData();
		data.setId(922);
		data.setName("パモット");
		data.setFeatures("群れが　襲われたときは　" + "電撃を　駆使した　格闘技で　" + "真っ先に　戦いを　挑み　敵を　倒す。");
		data.setType("でんき");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/922.png");
		return data;
	}

	@RequestMapping({ "/pokemon/923", "/pokemon/パーモット", "/pokemon/Pawmot" })
	public PokemonData poke923() {
		PokemonData data = new PokemonData();
		data.setId(923);
		data.setName("パーモット");
		data.setFeatures("普段は　おっとりしているが　いざ　" + "戦いになると　電光石火の　身のこなしで　" + "敵を　叩きのめす。");
		data.setType("でんき");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/923.png");
		return data;
	}

	@RequestMapping({ "/pokemon/924", "/pokemon/ワッカネズミ", "/pokemon/Tandemaus" })
	public PokemonData poke924() {
		PokemonData data = new PokemonData();
		data.setId(924);
		data.setName("ワッカネズミ");
		data.setFeatures("息の合った　コンビネーションで　" + "巣の　材料に　なりそうなものを" + "前歯で　切り出して　運び去る。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/924.png");
		return data;
	}

	@RequestMapping({ "/pokemon/925", "/pokemon/イッカネズミ", "/pokemon/Maushold" })
	public PokemonData poke925() {
		PokemonData data = new PokemonData();
		data.setId(925);
		data.setName("イッカネズミ");
		data.setFeatures("寝床や　エサを　食べる　場所など　" + "用途に　合わせて　いくつも　部屋が　" + "分かれた　大きな　巣を　作る。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/925.png");
		return data;
	}

	@RequestMapping({ "/pokemon/926", "/pokemon/パピモッチ", "/pokemon/Fidough" })
	public PokemonData poke926() {
		PokemonData data = new PokemonData();
		data.setId(926);
		data.setName("パピモッチ");
		data.setFeatures("しっとり　すべすべの　触り心地。　" + "吐息に　含まれている　酵母で　" + "まわりのものを　発酵させる。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/926.png");
		return data;
	}

	@RequestMapping({ "/pokemon/927", "/pokemon/バウッツェル", "/pokemon/Dachsbun" })
	public PokemonData poke927() {
		PokemonData data = new PokemonData();
		data.setId(927);
		data.setName("バウッツェル");
		data.setFeatures("体から　放つ　良い香りが　" + "小麦の　成長を　助けるため　" + "農村で　大切にされてきた。");
		data.setType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/927.png");
		return data;
	}

	@RequestMapping({ "/pokemon/928", "/pokemon/ミニーブ", "/pokemon/Smoliv" })
	public PokemonData poke928() {
		PokemonData data = new PokemonData();
		data.setId(928);
		data.setName("ミニーブ");
		data.setFeatures("頭の　実から　オイルを　出して　" + "敵から　身を　守る。　" + "オイルは　とびあがるほど　苦くて　渋い。");
		data.setType("くさ");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/928.png");
		return data;
	}

	@RequestMapping({ "/pokemon/929", "/pokemon/オリーニョ", "/pokemon/Dolliv" })
	public PokemonData poke929() {
		PokemonData data = new PokemonData();
		data.setId(929);
		data.setName("オリーニョ");
		data.setFeatures("フレッシュな　香りの　美味しい　" + "オイルを　分けてくれる。　" + "古くから　人間と　共存してきた。");
		data.setType("くさ");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/929.png");
		return data;
	}

	@RequestMapping({ "/pokemon/930", "/pokemon/オリーヴァ", "/pokemon/Arboliva" })
	public PokemonData poke930() {
		PokemonData data = new PokemonData();
		data.setId(930);
		data.setName("オリーヴァ");
		data.setFeatures("穏やかで　とても　慈悲深い。　" + "栄養豊富な　美味しい　オイルを　" + "弱った　ポケモンに　分け与える。");
		data.setType("くさ");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/930.png");
		return data;
	}

	@RequestMapping({ "/pokemon/931", "/pokemon/イキリンコ", "/pokemon/Squawkabilly" })
	public PokemonData poke931() {
		PokemonData data = new PokemonData();
		data.setId(931);
		data.setName("イキリンコ");
		data.setFeatures("街中で　暮らすことを　好む。　" + "羽の　色で　グループを　作り　" + "縄張り争いを　繰り広げる。");
		data.setType("ノーマル");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/931.png");
		return data;
	}

	@RequestMapping({ "/pokemon/932", "/pokemon/コジオ", "/pokemon/Nacli" })
	public PokemonData poke932() {
		PokemonData data = new PokemonData();
		data.setId(932);
		data.setName("コジオ");
		data.setFeatures("地底の　岩塩層で　生まれた。　" + "貴重な　塩を　分けてくれるため　" + "昔は　とくに　大事にされた。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/932.png");
		return data;
	}

	@RequestMapping({ "/pokemon/933", "/pokemon/ジオヅム", "/pokemon/Naclstack" })
	public PokemonData poke933() {
		PokemonData data = new PokemonData();
		data.setId(933);
		data.setName("ジオヅム");
		data.setFeatures("塩を　噴き出して　獲物に　浴びせ　" + "塩漬けにしてしまう。　" + "体内の　水分を　奪ってしまうのだ。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/933.png");
		return data;
	}

	@RequestMapping({ "/pokemon/934", "/pokemon/キョジオーン", "/pokemon/Garganacl" })
	public PokemonData poke934() {
		PokemonData data = new PokemonData();
		data.setId(934);
		data.setName("キョジオーン");
		data.setFeatures("指先を　擦りあわせて　塩を　" + "ケガした　ポケモンに　振りかけると　" + "ひどい　傷も　たちまち　治る。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/934.png");
		return data;
	}

	@RequestMapping({ "/pokemon/935", "/pokemon/カルボウ", "/pokemon/Charcadet" })
	public PokemonData poke935() {
		PokemonData data = new PokemonData();
		data.setId(935);
		data.setName("カルボウ");
		data.setFeatures("焼けた　木炭に　命が　宿り　" + "ポケモンになった。　燃える　闘志で　" + "強敵にも　戦いを　挑む。");
		data.setType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/935.png");
		return data;
	}

	@RequestMapping({ "/pokemon/936", "/pokemon/グレンアルマ", "/pokemon/Armarouge" })
	public PokemonData poke936() {
		PokemonData data = new PokemonData();
		data.setId(936);
		data.setName("グレンアルマ");
		data.setFeatures("多くの　武勲を　立てた　" + "戦士の　鎧によって　進化した　姿。　" + "忠誠心の　厚い　ポケモン。");
		data.setType("ほのお");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/936.png");
		return data;
	}

	@RequestMapping({ "/pokemon/937", "/pokemon/ソウブレイズ", "/pokemon/Ceruledge" })
	public PokemonData poke937() {
		PokemonData data = new PokemonData();
		data.setId(937);
		data.setName("ソウブレイズ");
		data.setFeatures("両腕の　炎の剣は　" + "志半ばで　力つきた　剣士の　" + "怨念で　燃え上がる。");
		data.setType("ほのお");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/937.png");
		return data;
	}

	@RequestMapping({ "/pokemon/938", "/pokemon/ズピカ", "/pokemon/Tadbulb" })
	public PokemonData poke938() {
		PokemonData data = new PokemonData();
		data.setId(938);
		data.setName("ズピカ");
		data.setFeatures("尻尾を　振って　発電する。　" + "危険を　感じると　頭を　" + "点滅させて　仲間に　伝える。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/938.png");
		return data;
	}

	@RequestMapping({ "/pokemon/939", "/pokemon/ハラバリー", "/pokemon/Bellibolt" })
	public PokemonData poke939() {
		PokemonData data = new PokemonData();
		data.setId(939);
		data.setName("ハラバリー");
		data.setFeatures("ブヨンブヨンの　体を　伸び縮み　" + "させると　お腹の　へそダイナモが　" + "大電力を　発生させる。");
		data.setType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/939.png");
		return data;
	}

	@RequestMapping({ "/pokemon/940", "/pokemon/カイデン", "/pokemon/Wattrel" })
	public PokemonData poke940() {
		PokemonData data = new PokemonData();
		data.setId(940);
		data.setName("カイデン");
		data.setFeatures("翼の　骨は　風を　受けると　" + "電気を　作る。　海に　飛び込み　" + "獲物を　感電させて　捕らえる。");
		data.setType("でんき");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/940.png");
		return data;
	}

	@RequestMapping({ "/pokemon/941", "/pokemon/タイカイデン", "/pokemon/Kilowattrel" })
	public PokemonData poke941() {
		PokemonData data = new PokemonData();
		data.setId(941);
		data.setName("タイカイデン");
		data.setFeatures("のど袋を　ふくらませて　電気を　" + "増幅させる。　風に　乗って　" + "１日で　７００キロを　飛行する。");
		data.setType("でんき");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/941.png");
		return data;
	}

	@RequestMapping({ "/pokemon/942", "/pokemon/オラチフ", "/pokemon/Maschiff" })
	public PokemonData poke942() {
		PokemonData data = new PokemonData();
		data.setId(942);
		data.setName("オラチフ");
		data.setFeatures("相手に　嘗められないように　" + "いつも　しかめっ面をしているが　" + "泣いている　子どもは　その顔で　笑いだす。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/942.png");
		return data;
	}

	@RequestMapping({ "/pokemon/943", "/pokemon/マフィティフ", "/pokemon/Mabosstiff" })
	public PokemonData poke943() {
		PokemonData data = new PokemonData();
		data.setId(943);
		data.setName("マフィティフ");
		data.setFeatures("大きな　のど袋に　エネルギーを　" + "蓄えることができる。　" + "一気に　放出して　敵を　吹き飛ばす。");
		data.setType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/943.png");
		return data;
	}

	@RequestMapping({ "/pokemon/944", "/pokemon/シルシュルー", "/pokemon/Shroodle" })
	public PokemonData poke944() {
		PokemonData data = new PokemonData();
		data.setId(944);
		data.setName("シルシュルー");
		data.setFeatures("温厚だが　怒らせると　毒が　" + "染みこんだ　鋭い　前歯で　" + "咬みつき　痺れさせてくるぞ。");
		data.setType("どく");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/944.png");
		return data;
	}

	@RequestMapping({ "/pokemon/945", "/pokemon/タギングル", "/pokemon/Grafaiai" })
	public PokemonData poke945() {
		PokemonData data = new PokemonData();
		data.setId(945);
		data.setName("タギングル");
		data.setFeatures("エサによって　色が　変化する　" + "毒の　唾液を　指に　塗して　" + "森の　木々に　模様を　描く。");
		data.setType("どく");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/945.png");
		return data;
	}

	@RequestMapping({ "/pokemon/946", "/pokemon/アノクサ", "/pokemon/Bramblin" })
	public PokemonData poke946() {
		PokemonData data = new PokemonData();
		data.setId(946);
		data.setName("アノクサ");
		data.setFeatures("成仏できない　魂が　風に　" + "吹かれているうち　枯草を　" + "巻き込んで　ポケモンになった。");
		data.setType("くさ");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/946.png");
		return data;
	}

	@RequestMapping({ "/pokemon/947", "/pokemon/アノホラグサ", "/pokemon/Brambleghast" })
	public PokemonData poke947() {
		PokemonData data = new PokemonData();
		data.setId(947);
		data.setName("アノホラグサ");
		data.setFeatures("頭の　枝を　開いて　獲物を　" + "飲みこむ。　生気を　存分に　" + "吸い取ると　吐き出して　捨てるのだ。");
		data.setType("くさ");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/947.png");
		return data;
	}

	@RequestMapping({ "/pokemon/948", "/pokemon/ノノクラゲ", "/pokemon/Toedscool" })
	public PokemonData poke948() {
		PokemonData data = new PokemonData();
		data.setId(948);
		data.setName("ノノクラゲ");
		data.setFeatures("じめじめした　森の中で　暮らす。　" + "剥がれ落ちた　体の　ヒラヒラは　" + "歯ごたえがあって　とても　美味しい。");
		data.setType("じめん");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/948.png");
		return data;
	}

	@RequestMapping({ "/pokemon/949", "/pokemon/リククラゲ", "/pokemon/Toedscruel" })
	public PokemonData poke949() {
		PokemonData data = new PokemonData();
		data.setId(949);
		data.setName("リククラゲ");
		data.setFeatures("森の奥に　集団で　暮らす　" + "コロニーを　作る。　よそ者が　" + "近寄ることを　ひどく　嫌う。");
		data.setType("じめん");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/949.png");
		return data;
	}

	@RequestMapping({ "/pokemon/950", "/pokemon/ガケガニ", "/pokemon/Klawf" })
	public PokemonData poke950() {
		PokemonData data = new PokemonData();
		data.setId(950);
		data.setName("ガケガニ");
		data.setFeatures("逆さまになって　崖の　上から　" + "獲物を　狙うが　頭に　血が上るので　" + "長くは　待てない。");
		data.setType("いわ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/950.png");
		return data;
	}

	@RequestMapping({ "/pokemon/951", "/pokemon/カプサイジ", "/pokemon/Capsakid" })
	public PokemonData poke951() {
		PokemonData data = new PokemonData();
		data.setId(951);
		data.setName("カプサイジ");
		data.setFeatures("太陽の　光を　浴びるほど　" + "体内で　辛み成分が　増えて　" + "技が　どんどん　辛くなるのだ。");
		data.setType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/951.png");
		return data;
	}

	@RequestMapping({ "/pokemon/952", "/pokemon/スコヴィラン", "/pokemon/Scovillain" })
	public PokemonData poke952() {
		PokemonData data = new PokemonData();
		data.setId(952);
		data.setName("スコヴィラン");
		data.setFeatures("レッドヘッドは　辛み成分を　" + "炎エネルギーに　変え　激辛の　" + "火炎放射を　まき散らす。");
		data.setType("くさ");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/952.png");
		return data;
	}

	@RequestMapping({ "/pokemon/953", "/pokemon/シガロコ", "/pokemon/Rellor" })
	public PokemonData poke953() {
		PokemonData data = new PokemonData();
		data.setId(953);
		data.setName("シガロコ");
		data.setFeatures("エスパーエネルギーを　" + "混ぜこみながら　土と　砂で　泥玉を　作る。　" + "泥玉は　命より　大切。");
		data.setType("むし");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/953.png");
		return data;
	}

	@RequestMapping({ "/pokemon/954", "/pokemon/ベラカス", "/pokemon/Rabsca" })
	public PokemonData poke954() {
		PokemonData data = new PokemonData();
		data.setId(954);
		data.setName("ベラカス");
		data.setFeatures("玉を　支える　体は　" + "ほとんど　動かないため　本体は　" + "玉の中にいると　考えられている。");
		data.setType("むし");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/954.png");
		return data;
	}

	@RequestMapping({ "/pokemon/955", "/pokemon/ヒラヒナ", "/pokemon/Flittle" })
	public PokemonData poke955() {
		PokemonData data = new PokemonData();
		data.setId(955);
		data.setName("ヒラヒナ");
		data.setFeatures("お腹の　ヒラヒラから　放射する　" + "サイコパワーで　わずか　１センチだけ　つま先が　" + "地面から　浮いている。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/955.png");
		return data;
	}

	@RequestMapping({ "/pokemon/956", "/pokemon/クエスパトラ", "/pokemon/Espathra" })
	public PokemonData poke956() {
		PokemonData data = new PokemonData();
		data.setId(956);
		data.setName("クエスパトラ");
		data.setFeatures("大きな　瞳から　サイコパワーを　" + "浴びせて　相手を　動けなくする。　" + "見かけによらず　気性は　荒い。");
		data.setType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/956.png");
		return data;
	}

	@RequestMapping({ "/pokemon/957", "/pokemon/カヌチャン", "/pokemon/Tinkatink" })
	public PokemonData poke957() {
		PokemonData data = new PokemonData();
		data.setId(957);
		data.setName("カヌチャン");
		data.setFeatures("手作りの　ハンマーを　振りまわして　" + "身を　守るが　金属を　食べる　" + "ポケモンには　よく　奪われる。");
		data.setType("フェアリー");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/957.png");
		return data;
	}

	@RequestMapping({ "/pokemon/958", "/pokemon/ナカヌチャン", "/pokemon/Tinkatuff" })
	public PokemonData poke958() {
		PokemonData data = new PokemonData();
		data.setId(958);
		data.setName("ナカヌチャン");
		data.setFeatures("大きくて　頑丈な　ハンマーを　" + "作るために　キリキザンの　群れを　" + "襲って　金属を　集める。");
		data.setType("フェアリー");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/958.png");
		return data;
	}

	@RequestMapping({ "/pokemon/959", "/pokemon/デカヌチャン", "/pokemon/Tinkaton" })
	public PokemonData poke959() {
		PokemonData data = new PokemonData();
		data.setId(959);
		data.setName("デカヌチャン");
		data.setFeatures("知能が　高く　とても　豪快。　" + "ハンマーで　岩を　殴り飛ばして　" + "空飛ぶ　アーマーガアを　狙う。");
		data.setType("フェアリー");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/959.png");
		return data;
	}

	@RequestMapping({ "/pokemon/960", "/pokemon/ウミディグダ", "/pokemon/Wiglett" })
	public PokemonData poke960() {
		PokemonData data = new PokemonData();
		data.setId(960);
		data.setName("ウミディグダ");
		data.setFeatures("２０メートル先の　ミガルーサが　" + "放つ　匂いも　嗅ぎとって　" + "砂の中に　身を　隠すのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/960.png");
		return data;
	}

	@RequestMapping({ "/pokemon/961", "/pokemon/ウミトリオ", "/pokemon/Wugtrio" })
	public PokemonData poke961() {
		PokemonData data = new PokemonData();
		data.setId(961);
		data.setName("ウミトリオ");
		data.setFeatures("見かけによらず　気性が　荒い。　" + "長い　体で　獲物を　締め上げ　" + "巣穴に　引きずりこむぞ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/961.png");
		return data;
	}

	@RequestMapping({ "/pokemon/962", "/pokemon/オトシドリ", "/pokemon/Bombirdier" })
	public PokemonData poke962() {
		PokemonData data = new PokemonData();
		data.setId(962);
		data.setName("オトシドリ");
		data.setFeatures("胸の　羽毛と　抜け落ちた　羽根で　" + "作った　袋に　物を　入れて　" + "高いところから　落として　遊ぶ。");
		data.setType("ひこう");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/962.png");
		return data;
	}

	@RequestMapping({ "/pokemon/963", "/pokemon/ナミイルカ", "/pokemon/Finizen" })
	public PokemonData poke963() {
		PokemonData data = new PokemonData();
		data.setId(963);
		data.setName("ナミイルカ");
		data.setFeatures("尾びれの　水のリングで　" + "仲間と　遊ぶのが　好き。　" + "超音波で　生き物の　気持ちを　察知する。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/963.png");
		return data;
	}

	@RequestMapping({ "/pokemon/964", "/pokemon/イルカマン", "/pokemon/Palafin" })
	public PokemonData poke964() {
		PokemonData data = new PokemonData();
		data.setId(964);
		data.setName("イルカマン");
		data.setFeatures("助けを　求める　仲間の　" + "声を　聞くと　姿を　変える。　" + "その　瞬間は　だれにも　見せない。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/964.png");
		return data;
	}

	@RequestMapping({ "/pokemon/965", "/pokemon/ブロロン", "/pokemon/Varoom" })
	public PokemonData poke965() {
		PokemonData data = new PokemonData();
		data.setId(965);
		data.setName("ブロロン");
		data.setFeatures("スクラップ工場に　放置された　" + "エンジンに　謎の　毒ポケモンが　" + "入り込んで　生まれたと　言われる。");
		data.setType("はがね");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/965.png");
		return data;
	}

	@RequestMapping({ "/pokemon/966", "/pokemon/ブロロローム", "/pokemon/Revavroom" })
	public PokemonData poke966() {
		PokemonData data = new PokemonData();
		data.setId(966);
		data.setName("ブロロローム");
		data.setFeatures("毒素と　岩の　成分を　混ぜた　ガスを　" + "８つに　増えた　シリンダーで　" + "爆発させ　エネルギーを　作る。");
		data.setType("はがね");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/966.png");
		return data;
	}

	@RequestMapping({ "/pokemon/967", "/pokemon/モトトカゲ", "/pokemon/Cyclizar" })
	public PokemonData poke967() {
		PokemonData data = new PokemonData();
		data.setId(967);
		data.setName("モトトカゲ");
		data.setFeatures("大昔から　人を　背中に　" + "乗せていたらしい。　１万年前の　" + "壁画に　様子が　描かれている。");
		data.setType("ドラゴン");
		data.setSecondType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/967.png");
		return data;
	}

	@RequestMapping({ "/pokemon/968", "/pokemon/ミミズズ", "/pokemon/Orthworm" })
	public PokemonData poke968() {
		PokemonData data = new PokemonData();
		data.setId(968);
		data.setName("ミミズズ");
		data.setFeatures("敵に　襲われると　体毛を　" + "こぶしのように　使い　パンチの　" + "嵐を　お見舞いするのだ。");
		data.setType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/968.png");
		return data;
	}

	@RequestMapping({ "/pokemon/969", "/pokemon/キラーメ", "/pokemon/Glimmet" })
	public PokemonData poke969() {
		PokemonData data = new PokemonData();
		data.setId(969);
		data.setName("キラーメ");
		data.setFeatures("洞窟の　壁から　栄養分を　" + "吸収。　毒の　結晶で　" + "できた　花びらを　身にまとう。");
		data.setType("いわ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/969.png");
		return data;
	}

	@RequestMapping({ "/pokemon/970", "/pokemon/キラフロル", "/pokemon/Glimmora" })
	public PokemonData poke970() {
		PokemonData data = new PokemonData();
		data.setId(970);
		data.setName("キラフロル");
		data.setFeatures("危険を　察知すると　結晶の　" + "花びらを　開いて　円錐形の　" + "体から　ビームを　発射する。");
		data.setType("いわ");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/970.png");
		return data;
	}

	@RequestMapping({ "/pokemon/971", "/pokemon/ボチ", "/pokemon/Greavard" })
	public PokemonData poke971() {
		PokemonData data = new PokemonData();
		data.setId(971);
		data.setName("ボチ");
		data.setFeatures("人と　関わることなく　命を　落とした　" + "野良の　犬ポケモンが　" + "生まれ変わったと　言われている。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/971.png");
		return data;
	}

	@RequestMapping({ "/pokemon/972", "/pokemon/ハカドッグ", "/pokemon/Houndstone" })
	public PokemonData poke972() {
		PokemonData data = new PokemonData();
		data.setId(972);
		data.setName("ハカドッグ");
		data.setFeatures("普段は　墓場で　眠っている。　" + "数いる　犬ポケモンの中でも　" + "もっとも　主に　忠実だ。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/972.png");
		return data;
	}

	@RequestMapping({ "/pokemon/973", "/pokemon/カラミンゴ", "/pokemon/Flamigo" })
	public PokemonData poke973() {
		PokemonData data = new PokemonData();
		data.setId(973);
		data.setName("カラミンゴ");
		data.setFeatures("お腹に　溜めた　エネルギーが　" + "くちばしから　漏れないように　" + "首を　根元で　結んでいるらしい。");
		data.setType("ひこう");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/973.png");
		return data;
	}

	@RequestMapping({ "/pokemon/974", "/pokemon/アルクジラ", "/pokemon/Cetoddle" })
	public PokemonData poke974() {
		PokemonData data = new PokemonData();
		data.setId(974);
		data.setName("アルクジラ");
		data.setFeatures("遥か　昔に　海から　上がって　" + "陸地で　暮らすようになった。　" + "ホエルコに　近い　種類らしい。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/974.png");
		return data;
	}

	@RequestMapping({ "/pokemon/975", "/pokemon/ハルクジラ", "/pokemon/Cetitan" })
	public PokemonData poke975() {
		PokemonData data = new PokemonData();
		data.setId(975);
		data.setName("ハルクジラ");
		data.setFeatures("氷雪地帯を　回遊する。　" + "強靭な　筋肉と　ぶ厚い　" + "皮下脂肪で　体を　守る。");
		data.setType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/975.png");
		return data;
	}

	@RequestMapping({ "/pokemon/976", "/pokemon/ミガルーサ", "/pokemon/Veluza" })
	public PokemonData poke976() {
		PokemonData data = new PokemonData();
		data.setId(976);
		data.setName("ミガルーサ");
		data.setFeatures("無駄な　肉を　捨て去ると　" + "心が　研ぎ澄まされ　サイコパワーが　上がる。　" + "贅肉は　淡白だが　美味しい。");
		data.setType("みず");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/976.png");
		return data;
	}

	@RequestMapping({ "/pokemon/977", "/pokemon/ヘイラッシャ", "/pokemon/Dondozo" })
	public PokemonData poke977() {
		PokemonData data = new PokemonData();
		data.setId(977);
		data.setName("ヘイラッシャ");
		data.setFeatures("大食らいだが　エサを　取るのは　苦手。　" + "シャリタツと　コンビを　組んで　" + "獲物を　捕らえるのだ。");
		data.setType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/977.png");
		return data;
	}

	@RequestMapping({ "/pokemon/978", "/pokemon/シャリタツ", "/pokemon/Tatsugiri" })
	public PokemonData poke978() {
		PokemonData data = new PokemonData();
		data.setId(978);
		data.setName("シャリタツ");
		data.setFeatures("小型の　ドラゴンポケモン。" + "ヘイラッシャの　口の中に　棲み　" + "外敵から　身を　守っている。");
		data.setType("ドラゴン");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/978.png");
		return data;
	}

	@RequestMapping({ "/pokemon/979", "/pokemon/コノヨザル", "/pokemon/Annihilape" })
	public PokemonData poke979() {
		PokemonData data = new PokemonData();
		data.setId(979);
		data.setName("コノヨザル");
		data.setFeatures("怒りのボルテージが　臨界点を　" + "超えたとき　肉体という　枠に　" + "縛られない　パワーを　手に入れた。");
		data.setType("かくとう");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/979.png");
		return data;
	}

	@RequestMapping({ "/pokemon/980", "/pokemon/ドオー", "/pokemon/Clodsire" })
	public PokemonData poke980() {
		PokemonData data = new PokemonData();
		data.setId(980);
		data.setName("ドオー");
		data.setFeatures("敵に　襲われると　太い　棘を　" + "胴体から　突き出して　反撃。　" + "身を切る　覚悟の　危険な　技。");
		data.setType("どく");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/980.png");
		return data;
	}

	@RequestMapping({ "/pokemon/981", "/pokemon/リキキリン", "/pokemon/Farigiraf" })
	public PokemonData poke981() {
		PokemonData data = new PokemonData();
		data.setId(981);
		data.setName("リキキリン");
		data.setFeatures("頭と　尻尾の　２つの　脳波が　" + "同期したことで　エスパーパワーは　" + "キリンリキの　１０倍　アップした。");
		data.setType("ノーマル");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/981.png");
		return data;
	}

	@RequestMapping({ "/pokemon/982", "/pokemon/ノココッチ", "/pokemon/Dudunsparce" })
	public PokemonData poke982() {
		PokemonData data = new PokemonData();
		data.setId(982);
		data.setName("ノココッチ");
		data.setFeatures("硬い　尻尾で　地中　深くの　" + "岩盤を　くり抜き　巣を　作る。　" + "巣穴は　長さ１０キロに　およぶ。");
		data.setType("ノーマル");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/982.png");
		return data;
	}

	@RequestMapping({ "/pokemon/983", "/pokemon/ドドゲザン", "/pokemon/Kingambit" })
	public PokemonData poke983() {
		PokemonData data = new PokemonData();
		data.setId(983);
		data.setName("ドドゲザン");
		data.setFeatures("ドドゲザンに　進化できるのは　" + "大軍勢の　頂点に　立った　" + "１匹の　キリキザンだけなのだ。");
		data.setType("あく");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/983.png");
		return data;
	}

	@RequestMapping({ "/pokemon/984", "/pokemon/イダイナキバ", "/pokemon/Great Tusk" })
	public PokemonData poke984() {
		PokemonData data = new PokemonData();
		data.setId(984);
		data.setName("イダイナキバ");
		data.setFeatures("近年　目撃例が　ある。　" + "イダイナキバという　名は　" + "ある本に　記された　生物から　取られた。");
		data.setType("じめん");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/984.png");
		return data;
	}

	@RequestMapping({ "/pokemon/985", "/pokemon/サケブシッポ", "/pokemon/Scream Tail" })
	public PokemonData poke985() {
		PokemonData data = new PokemonData();
		data.setId(985);
		data.setName("サケブシッポ");
		data.setFeatures("目撃例は　過去　１件のみ。　" + "古い　探検記に　記された　" + "謎の　生物に　似た　ポケモン。");
		data.setType("フェアリー");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/985.png");
		return data;
	}

	@RequestMapping({ "/pokemon/986", "/pokemon/アラブルタケ", "/pokemon/Brute Bonnet" })
	public PokemonData poke986() {
		PokemonData data = new PokemonData();
		data.setId(986);
		data.setName("アラブルタケ");
		data.setFeatures("ある本の中で　アラブルタケと　" + "記されていた　生物は　" + "このポケモンの　可能性がある。");
		data.setType("くさ");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/986.png");
		return data;
	}

	@RequestMapping({ "/pokemon/987", "/pokemon/ハバタクカミ", "/pokemon/Flutter Mane" })
	public PokemonData poke987() {
		PokemonData data = new PokemonData();
		data.setId(987);
		data.setName("ハバタクカミ");
		data.setFeatures("とある　書物に　登場する　" + "ハバタクカミという　生物と　似た　" + "特徴を　持つ　ポケモン。");
		data.setType("ゴースト");
		data.setSecondType("フェアリー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/987.png");
		return data;
	}

	@RequestMapping({ "/pokemon/988", "/pokemon/チヲハウハネ", "/pokemon/Slither Wing" })
	public PokemonData poke988() {
		PokemonData data = new PokemonData();
		data.setId(988);
		data.setName("チヲハウハネ");
		data.setFeatures("怪しい　雑誌が　紹介した　" + "ウルガモスの　太古の　姿と　" + "若干　似ている　ポケモンだ。");
		data.setType("むし");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/988.png");
		return data;
	}

	@RequestMapping({ "/pokemon/989", "/pokemon/スナノケガワ", "/pokemon/Sandy Shocks" })
	public PokemonData poke989() {
		PokemonData data = new PokemonData();
		data.setId(989);
		data.setName("スナノケガワ");
		data.setFeatures("オカルト雑誌の　記事にあった　" + "１万年　生きた　レアコイルの　姿に　" + "やや　似ている。");
		data.setType("でんき");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/989.png");
		return data;
	}

	@RequestMapping({ "/pokemon/990", "/pokemon/テツノワダチ", "/pokemon/Iron Treads" })
	public PokemonData poke990() {
		PokemonData data = new PokemonData();
		data.setId(990);
		data.setName("テツノワダチ");
		data.setFeatures("オカルト雑誌が　紹介した　" + "宇宙人が　送り込んできた　" + "科学兵器に　よく　似ている。");
		data.setType("じめん");
		data.setSecondType("はがね");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/990.png");
		return data;
	}

	@RequestMapping({ "/pokemon/991", "/pokemon/テツノツツミ", "/pokemon/Iron Bundle" })
	public PokemonData poke991() {
		PokemonData data = new PokemonData();
		data.setId(991);
		data.setName("テツノツツミ");
		data.setFeatures("オカルト雑誌の　記事になった　" + "太古の　文明が　生み出した　" + "ロボットに　形が　似ている。");
		data.setType("こおり");
		data.setSecondType("みず");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/991.png");
		return data;
	}

	@RequestMapping({ "/pokemon/992", "/pokemon/テツノカイナ", "/pokemon/Iron Hands" })
	public PokemonData poke992() {
		PokemonData data = new PokemonData();
		data.setId(992);
		data.setName("テツノカイナ");
		data.setFeatures("あるアスリートが　改造された　" + "姿だと　オカルト雑誌が　" + "スクープした　サイボーグに　近い。");
		data.setType("かくとう");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/992.png");
		return data;
	}

	@RequestMapping({ "/pokemon/993", "/pokemon/テツノコウベ", "/pokemon/Iron Jugulis" })
	public PokemonData poke993() {
		PokemonData data = new PokemonData();
		data.setId(993);
		data.setName("テツノコウベ");
		data.setFeatures("ロボットに　恋した　サザンドラの　" + "子どもと　オカルト雑誌が　取り上げた　" + "ポケモンに　似ている。");
		data.setType("あく");
		data.setSecondType("ひこう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/993.png");
		return data;
	}

	@RequestMapping({ "/pokemon/994", "/pokemon/テツノドクガ", "/pokemon/Iron Moth" })
	public PokemonData poke994() {
		PokemonData data = new PokemonData();
		data.setId(994);
		data.setName("テツノドクガ");
		data.setFeatures("人類を　監視する　UFOだと　" + "オカルト雑誌が　紹介した　" + "未知の　物体に　似ている。");
		data.setType("ほのお");
		data.setSecondType("どく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/994.png");
		return data;
	}

	@RequestMapping({ "/pokemon/995", "/pokemon/テツノイバラ", "/pokemon/Iron Thorns" })
	public PokemonData poke995() {
		PokemonData data = new PokemonData();
		data.setId(995);
		data.setName("テツノイバラ");
		data.setFeatures("１０億年後の　バンギラスと　" + "怪しい　雑誌が　取り上げていた　" + "ポケモンに　似た　部分が　ある。");
		data.setType("いわ");
		data.setSecondType("でんき");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/995.png");
		return data;
	}

	@RequestMapping({ "/pokemon/996", "/pokemon/セビエ", "/pokemon/Frigibax" })
	public PokemonData poke996() {
		PokemonData data = new PokemonData();
		data.setId(996);
		data.setName("セビエ");
		data.setFeatures("背びれで　熱を　吸収して　" + "氷エネルギーに　変換する。　" + "高温ほど　エネルギーが　溜まる。");
		data.setType("ドラゴン");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/996.png");
		return data;
	}

	@RequestMapping({ "/pokemon/997", "/pokemon/セゴール", "/pokemon/Arctibax" })
	public PokemonData poke997() {
		PokemonData data = new PokemonData();
		data.setId(997);
		data.setName("セゴール");
		data.setFeatures("まわりの　空気を　凍らせて　" + "氷のマスクで　顔を　守り　" + "背びれを　氷の剣に　変える。");
		data.setType("ドラゴン");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/997.png");
		return data;
	}

	@RequestMapping({ "/pokemon/998", "/pokemon/セグレイブ", "/pokemon/Baxcalibur" })
	public PokemonData poke998() {
		PokemonData data = new PokemonData();
		data.setId(998);
		data.setName("セグレイブ");
		data.setFeatures("極低温の　冷気を　口から　噴射。　" + "灼熱の　マグマでも　" + "瞬時に　凍りつかせてしまう。");
		data.setType("ドラゴン");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/998.png");
		return data;
	}

	@RequestMapping({ "/pokemon/999", "/pokemon/コレクレー", "/pokemon/Gimmighoul" })
	public PokemonData poke999() {
		PokemonData data = new PokemonData();
		data.setId(999);
		data.setName("コレクレー");
		data.setFeatures("およそ１５００年前　宝箱の中で　" + "生まれた。　宝を　盗む　" + "不埒者の　生気を　吸い取る。");
		data.setType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/999.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1000", "/pokemon/サーフゴー", "/pokemon/Gholdengo" })
	public PokemonData poke1000() {
		PokemonData data = new PokemonData();
		data.setId(1000);
		data.setName("サーフゴー");
		data.setFeatures("１０００枚の　コインで　" + "体が　できているらしい。　人懐こく　" + "だれとでも　すぐに　仲良くなれる。");
		data.setType("はがね");
		data.setSecondType("ゴースト");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1000.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1001", "/pokemon/チオンジェン", "/pokemon/Wo-Chien" })
	public PokemonData poke1001() {
		PokemonData data = new PokemonData();
		data.setId(1001);
		data.setName("チオンジェン");
		data.setFeatures("王の　悪事を　木簡に　記し　" + "処罰された　人の　恨みが　" + "枯葉を　まとい　ポケモンとなった。");
		data.setType("あく");
		data.setSecondType("くさ");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1001.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1002", "/pokemon/パオジアン", "/pokemon/Chien-Pao" })
	public PokemonData poke1002() {
		PokemonData data = new PokemonData();
		data.setId(1002);
		data.setName("パオジアン");
		data.setFeatures("１００トンの　積雪を　操る。　" + "雪崩を　起こして　その中を　" + "出入りして　無邪気に　遊ぶ。");
		data.setType("あく");
		data.setSecondType("こおり");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1002.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1003", "/pokemon/ディンルー", "/pokemon/Ting-Lu" })
	public PokemonData poke1003() {
		PokemonData data = new PokemonData();
		data.setId(1003);
		data.setName("ディンルー");
		data.setFeatures("古の　儀式で　使われた　" + "器に　注がれた　恐怖が　" + "土石を　まとい　ポケモンとなった。");
		data.setType("あく");
		data.setSecondType("じめん");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1003.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1004", "/pokemon/イーユイ", "/pokemon/Chi-Yu" })
	public PokemonData poke1004() {
		PokemonData data = new PokemonData();
		data.setId(1004);
		data.setName("イーユイ");
		data.setFeatures("３０００度の　炎を　操る。　" + "岩や　砂利を　溶かして　作った　" + "マグマの海を　ゆうゆうと　泳ぐ。");
		data.setType("あく");
		data.setSecondType("ほのお");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1004.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1005", "/pokemon/トドロクツキ", "/pokemon/Roaring Moon" })
	public PokemonData poke1005() {
		PokemonData data = new PokemonData();
		data.setId(1005);
		data.setName("トドロクツキ");
		data.setFeatures("謎の　多い　探検記の中で　" + "トドロクツキという　名で　記された　" + "生物の　可能性が　ある。");
		data.setType("ドラゴン");
		data.setSecondType("あく");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1005.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1006", "/pokemon/テツノブジン", "/pokemon/Iron Valiant" })
	public PokemonData poke1006() {
		PokemonData data = new PokemonData();
		data.setId(1006);
		data.setName("テツノブジン");
		data.setFeatures("オカルト雑誌の　記事に　あった　" + "マッドサイエンティストの　発明と　" + "近い　特徴が　いくつかある。");
		data.setType("フェアリー");
		data.setSecondType("かくとう");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1006.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1007", "/pokemon/コライドン", "/pokemon/Koraidon" })
	public PokemonData poke1007() {
		PokemonData data = new PokemonData();
		data.setId(1007);
		data.setName("コライドン");
		data.setFeatures("拳で　大地を　引き裂いたと　" + "古い　探検記に　記された　" + "ツバサノオウの　正体らしい。");
		data.setType("かくとう");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1007.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1008", "/pokemon/ミライドン", "/pokemon/Miraidon" })
	public PokemonData poke1008() {
		PokemonData data = new PokemonData();
		data.setId(1008);
		data.setName("ミライドン");
		data.setFeatures("詳細は　よく　わかっていない。　" + "モトトカゲに　似た　印象だが　" + "はるかに　強く　冷酷なのだ。");
		data.setType("でんき");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1008.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1009", "/pokemon/ウネルミナモ", "/pokemon/Walking Wake" })
	public PokemonData poke1009() {
		PokemonData data = new PokemonData();
		data.setId(1009);
		data.setName("ウネルミナモ");
		data.setFeatures("生態調査中です。");
		data.setType("みず");
		data.setSecondType("ドラゴン");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1009.png");
		return data;
	}

	@RequestMapping({ "/pokemon/1010", "/pokemon/テツノイサハ", "/pokemon/Iron Leaves" })
	public PokemonData poke1010() {
		PokemonData data = new PokemonData();
		data.setId(1010);
		data.setName("テツノイサハ");
		data.setFeatures("生態分析中です。");
		data.setType("くさ");
		data.setSecondType("エスパー");
		data.setImage(
				"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1010.png");
		return data;
	}

}