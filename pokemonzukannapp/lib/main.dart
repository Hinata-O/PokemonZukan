import 'dart:convert';
import 'package:cached_network_image/cached_network_image.dart';

import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Pokemon',
      theme: ThemeData(
        primarySwatch: Colors.blue,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: TopPage(),
    );
  }
}

class Pokemon {
  String id = "";
  String name = "";
  String features = "";
  String type = "";
  String secondType = "";
  String image = "";
}

class TopPage extends StatefulWidget {
  const TopPage({super.key});

  @override
  _TopPageState createState() => _TopPageState();
}

class _TopPageState extends State<TopPage> {
  final pokeNameController = TextEditingController();
  final pokemon = Pokemon();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: SizedBox(
          width: 150,
          height: 150,
          child: Image.asset('typeImages/HeaderLogo.png'),
        ),
        backgroundColor: Colors.red,
      ),
      endDrawer: Drawer(
        child: ListView(
          children: <Widget>[
            SizedBox(
                height: 150,
                child: DrawerHeader(
                  decoration: const BoxDecoration(
                    color: Colors.red,
                  ),
                  child: Image.asset('typeImages/HeaderLogo.png'),
                )),
            ListTile(
                onTap: () {
                  if (!context.mounted) return;
                  Navigator.push(
                      context,
                      MaterialPageRoute(
                        builder: (context) => const SearchPage(),
                      ));
                },
                title: const Text("ポケモン検索"),
                trailing: SizedBox(
                  width: 30,
                  height: 30,
                  child: Image.asset("typeImages/search.png"),
                ))
          ],
        ),
      ),
      body: GridView.count(
        padding: const EdgeInsets.all(4),
        crossAxisCount: 3,
        crossAxisSpacing: 4,
        mainAxisSpacing: 4,
        children: [for (int i = 0; i < 1010; i++) _pokemonList('${i + 1}')],
      ),
      // ],
      // ),
      //   ),
    );
  }

  Widget _pokemonList(String image) {
    String networkImage =
        "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/$image.png";
    // "typeImages/bug.png";
    return GestureDetector(
        onTap: () async {
          var result =
              await http.get(Uri.http("10.0.2.2:8080", "/pokemon/$image"));
          Map<String, dynamic> map = jsonDecode(utf8.decode(result.bodyBytes));
          pokemon.id = '${map['id']}';
          pokemon.name = '${map['name']}';
          pokemon.features = '${map['features']}';
          pokemon.type = '${map['type']}';
          pokemon.secondType = '${map['secondType']}';
          pokemon.image = '${map['image']}';

          if (!context.mounted) return;
          Navigator.push(
            context,
            MaterialPageRoute(builder: (context) => PokemonPage(pokemon)),
          );
        },
        child: Card(
            shape: RoundedRectangleBorder(
              side: const BorderSide(
                color: Colors.black12,
                width: 3,
              ),
              borderRadius: BorderRadius.circular(8),
            ),
            child: Column(
              children: <Widget>[
                const Padding(padding: EdgeInsets.only(top: 4)),
                Text(
                  'No.$image',
                  style: const TextStyle(fontSize: 14),
                ),
                SizedBox(
                    height: 100,
                    width: 100,
                    child: CachedNetworkImage(
                      imageUrl: networkImage,
                      placeholder: (context, url) => const Center(
                        child:Icon(Icons.catching_pokemon_outlined, color: Colors.red),
                      ),
                      fit: BoxFit.contain,
                    )),
              ],
            )));
  }
}

class PokemonPage extends StatelessWidget {
  Map<String, String> types = {
    'エスパー': 'psychic',
    'くさ': 'grass',
    'ノーマル': 'normal',
    'ほのお': 'fire',
    'みず': 'water',
    'でんき': 'electric',
    'こおり': 'ice',
    'かくとう': 'fighting',
    'どく': 'poison',
    'じめん': 'ground',
    'ひこう': 'flying',
    'むし': 'bug',
    'いわ': 'rock',
    'ゴースト': 'ghost',
    'ドラゴン': 'dragon',
    'あく': 'dark',
    'はがね': 'steel',
    'フェアリー': 'fairy'
  };

  PokemonPage(this.pokemon, {super.key});

  Pokemon pokemon;

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: SizedBox(
          width: 150,
          height: 150,
          child: Image.asset('typeImages/HeaderLogo.png'),
        ),
        backgroundColor: Colors.red,
      ),
      body: SingleChildScrollView(
        child: Container(
          height: 785,
          decoration: const BoxDecoration(
              color: Color.fromRGBO(1, 1, 1, 0.075),
              image: DecorationImage(
                image: AssetImage('typeImages/BackGroundImage.png'),
                fit: BoxFit.fitWidth,
              )),
          padding: const EdgeInsets.fromLTRB(0, 50, 0, 0),
          child: Column(
            children: <Widget>[
              Center(
                //図鑑番号と名前を表示
                child: Container(
                  margin: const EdgeInsets.fromLTRB(0, 20, 0, 10),
                  child: Column(
                    children: <Widget>[
                      Text(
                        'No.${pokemon.id}  ',
                        style: const TextStyle(
                          fontSize: 14,
                        ),
                      ),
                      Text(
                        pokemon.name,
                        style: const TextStyle(
                          fontSize: 20,
                        ),
                      ),
                    ],
                  ),
                ),
              ),

              //画像を表示
              _pokemonImage(),

              //タイプを表示
              //タイプが2つあるポケモンは2つとも表示する
              pokemon.secondType == 'null' ? _pokemonType() : _twoPokemonType(),

              //ポケモンの設定を表示
              Container(
                padding: const EdgeInsets.all(5),
                width: 360,
                height: 90,
                decoration: BoxDecoration(
                  border: Border.all(color: Colors.black12, width: 3),
                  borderRadius: BorderRadius.circular(8.0),
                  color: Colors.white,
                ),
                child: Text(
                  pokemon.features,
                  style: const TextStyle(
                    fontSize: 16,
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }

  Widget _pokemonImage() {
    return SizedBox(
      width: 300,
      height: 300,
      child: _pokemonImages(),
    );
  }

  Widget _pokemonImages() {
    return Image.network(
      pokemon.image,
    );
  }

  Widget _pokemonType() {
    return Container(
      margin: const EdgeInsets.fromLTRB(0, 15, 0, 15),
      child: Column(
        children: <Widget>[
          SizedBox(
            width: 40,
            height: 40,
            child: _pokemonTypeImage(),
          ),
          Text(
            pokemon.type,
            style: const TextStyle(fontSize: 10),
          ),
        ],
      ),
    );
  }

  Widget _pokemonTypeImage() {
    return Image.asset('typeImages/${types[pokemon.type]}.png');
  }

  Widget _pokemonSecondTypeImage() {
    return Image.asset('typeImages/${types[pokemon.secondType]}.png');
  }

  Widget _twoPokemonType() {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: <Widget>[
        Column(
          children: <Widget>[
            SizedBox(
              width: 40,
              height: 40,
              child: _pokemonTypeImage(),
            ),
            Text(
              pokemon.type,
              style: const TextStyle(fontSize: 10),
            ),
          ],
        ),
        Container(
          margin: const EdgeInsets.fromLTRB(10, 10, 0, 10),
          child: Column(
            children: <Widget>[
              SizedBox(
                width: 40,
                height: 40,
                child: _pokemonSecondTypeImage(),
              ),
              Text(
                pokemon.secondType,
                style: const TextStyle(fontSize: 10),
              ),
            ],
          ),
        ),
      ],
    );
  }
}

class SearchPage extends StatefulWidget {
  const SearchPage({super.key});

  @override
  _SearchPageState createState() => _SearchPageState();
}

class _SearchPageState extends State<SearchPage> {
  final pokeNameController = TextEditingController();
  final pokemon = Pokemon();
  @override
  Widget build(BuildContext context) {
    var isFocus = true;
    return Scaffold(
        appBar: AppBar(
          title: SizedBox(
            width: 150,
            height: 150,
            child: Image.asset('typeImages/HeaderLogo.png'),
          ),
          backgroundColor: Colors.red,
        ),
        body: Padding(
          padding: const EdgeInsets.all(10.0),
          child: Column(
            children: [
              Row(
                children: [
                  Expanded(
                    child: TextFormField(
                        maxLines: 1,
                        controller: pokeNameController,
                        keyboardType: TextInputType.text,
                        decoration: InputDecoration(
                          focusedBorder: const UnderlineInputBorder(
                            borderSide: BorderSide(color: Colors.red),
                          ),
                          labelText: '名前もしくは図鑑番号で検索',
                          labelStyle: TextStyle(
                            color: isFocus ? Colors.red : Colors.black38,
                          ),
                          suffixIconColor: Colors.red,
                          suffixIcon: IconButton(
                            highlightColor: Colors.transparent,
                            icon: const SizedBox(
                                width: 36.0, child: Icon(Icons.clear)),
                            onPressed: () {
                              pokeNameController.clear();
                            },
                            splashColor: Colors.transparent,
                          ),
                        ),
                      ),
                    ),
                  OutlinedButton(
                    style: OutlinedButton.styleFrom(
                      side: const BorderSide(color: Colors.red),
                    ),
                    onPressed: () async {
                      var result = await http.get(Uri.http("10.0.2.2:8080",
                          "/pokemon/${pokeNameController.text}"));
                      Map<String, dynamic> map =
                          jsonDecode(utf8.decode(result.bodyBytes));
                      pokemon.id = '${map['id']}';
                      pokemon.name = '${map['name']}';
                      pokemon.features = '${map['features']}';
                      pokemon.type = '${map['type']}';
                      pokemon.secondType = '${map['secondType']}';
                      pokemon.image = '${map['image']}';

                      if (!context.mounted) return;
                      Navigator.push(
                        context,
                        MaterialPageRoute(
                            builder: (context) => PokemonPage(pokemon)),
                      );
                    },
                    child: const Text(
                      '検索',
                      style: TextStyle(color: Colors.red),
                    ),
                  ),
                ],
              ),
            ],
          ),
        ));
  }
}