import java.util.ArrayList;

public class Hangman {
    public static void main(String[] args) {

        ArrayList<String> ordList = new ArrayList<String>();



        ordList.add("vibe");          // At index 0
        ordList.add("awkward");       // At index 1
        ordList.add("quiz");          // At index 2
        ordList.add("wave");          // At index 3
        ordList.add("zombie");        // At index 4
        ordList.add("youthful");      // At index 5
        ordList.add("wizard");        // At index 6
        ordList.add("boomer");        // At index 7
        ordList.add("Java");          // At index 8
        ordList.add("inteliJ");       // At index 9
        ordList.add("Subway");        // At index 10
        ordList.add("uptown");        // At index 11
        ordList.add("staff");         // At index 12
        ordList.add("strength");      // At index 13
        ordList.add("puppy");         // At index 14
        ordList.add("transgress");    // At index 15
        ordList.add("transcript");    // At index 16
        ordList.add("vodka");         // At index 17
        ordList.add("walkway");       // At index 19
        ordList.add("yummy");         // At index 20
        ordList.add("unknown");             // At index 21
        ordList.add("zipper");              // At index 22
        ordList.add("whiskey");             // At index 23
        ordList.add("unworthy");            // At index 24
        ordList.add("transplant");          // At index 25
        ordList.add("swivel");              // At index 26
        ordList.add("snazzy");              // At index 27
        ordList.add("scratch");             // At index 28
        ordList.add("oxygen");              // At index 29
        ordList.add("sphinx");              // At index 30
        ordList.add("ovary");               // At index 31
        ordList.add("stronghold");          // At index 32
        ordList.add("stronghold");          // At index 33
        ordList.add("luxury");              // At index 34
        ordList.add("lymph");               // At index 35
        ordList.add("lengths");             // At index 36
        ordList.add("kiwifruit");           // At index 37
        ordList.add("klutz");               // At index 38
        ordList.add("knapsack");            // At index 39
        ordList.add("larynx");              // At index 40
        ordList.add("kitsch");              // At index 41
        ordList.add("kiosk");               // At index 42
        ordList.add("kilobyte");            // At index 43
        ordList.add("khaki");               // At index 44
        ordList.add("jumbo");               // At index 45
        ordList.add("joyful");              // At index 46
        ordList.add("juicy");               // At index 47
        ordList.add("joking");              // At index 48
        ordList.add("jockey");              // At index 49
        ordList.add("jukebox");             // At index 50
        ordList.add("jiujitsu");            // At index 50
        ordList.add("jazzy");               // At index 51
        ordList.add("jelly");               // At index 52
        ordList.add("jigsaw");              // At index 53
        ordList.add("jinx");                // At index 54
        ordList.add("jazziest");            // At index 55
        ordList.add("jaywalk");             // At index 56
        ordList.add("jawbreaker");          // At index 57
        ordList.add("jaundice");            // At index 58
        ordList.add("injury");              // At index 59
        ordList.add("ivory");               // At index 60
        ordList.add("ivy");                 // At index 61
        ordList.add("jackpot");             // At index 62
        ordList.add("icebox");              // At index 63
        ordList.add("iatrogenic");          // At index 64
        ordList.add("hyphen");              // At index 65
        ordList.add("haphazard");           // At index 66
        ordList.add("gnostic");             // At index 67
        ordList.add("gossip");              // At index 68
        ordList.add("grogginess");          // At index 69
        ordList.add("haiku");               // At index 70
        ordList.add("gnarly");              // At index 71
        ordList.add("glyph");               // At index 72
        ordList.add("glowworm");            // At index 73
        ordList.add("gizmo");               // At index 74
        ordList.add("galaxy");              // At index 75
        ordList.add("galvanize");           // At index 76
        ordList.add("gazebo");              // At index 77
        ordList.add("giaour");              // At index 78
        ordList.add("gabby");               // At index 79
        ordList.add("funny");               // At index 80
        ordList.add("fuchsia");             // At index 81
        ordList.add("frizzled");            // At index 82
        ordList.add("fuchsia");             // At index 83
        ordList.add("frizzled");            // At index 84
        ordList.add("fluffiness");          // At index 85
        ordList.add("flyby");               // At index 86
        ordList.add("foxglove");            // At index 87
        ordList.add("frazzled");            // At index 88
        ordList.add("flopping");            // At index 89
        ordList.add("flapjack");            // At index 90
        ordList.add("fjord");               // At index 91
        ordList.add("fixable");             // At index 92
        ordList.add("euouae");              // At index 93
        ordList.add("exodus");              // At index 94
        ordList.add("faking");              // At index 95
        ordList.add("fishhook");            // At index 96
        ordList.add("espionage");           // At index 97
        ordList.add("equip");               // At index 98
        ordList.add("embezzle");            // At index 99
        ordList.add("cycle");               // At index 100
        ordList.add("curacao");             // At index 101
        ordList.add("instagram");           // At index 102
        ordList.add("abruptly");            // At index 103
        ordList.add("absurd");              // At index 104
        ordList.add("abyss");               // At index 105
        ordList.add("affix");               // At index 106
        ordList.add("avenue");              // At index 107
        ordList.add("axiom");               // At index 108
        ordList.add("banjo");               // At index 109
        ordList.add("bandwagon");           // At index 110
        ordList.add("bagpipes");            // At index 111
        ordList.add("azure");               // At index 112
        ordList.add("bayou");               // At index 113
        ordList.add("beekeeper");           // At index 114
        ordList.add("bikini");              // At index 115
        ordList.add("blitz");               // At index 116
        ordList.add("blizzard");            // At index 117
        ordList.add("boggle");              // At index 118
        ordList.add("bookworm");            // At index 119
        ordList.add("boxcar");              // At index 120
        ordList.add("buffoon");             // At index 121
        ordList.add("buffalo");             // At index 122
        ordList.add("buckaroo");            // At index 123
        ordList.add("about");               // At index 124
        ordList.add("above");               // At index 125
        ordList.add("accept");              // At index 126
        ordList.add("according");           // At index 127
        ordList.add("account");             // At index 128
        ordList.add("across");              // At index 129
        ordList.add("action");              // At index 130
        ordList.add("activity");            // At index 131
        ordList.add("address");             // At index 132
        ordList.add("administration");      // At index 133
        ordList.add("admit");               // At index 134
        ordList.add("adult");               // At index 135
        ordList.add("after");               // At index 136
        ordList.add("again");               // At index 137
        ordList.add("agency");              // At index 138
        ordList.add("agreement");           // At index 139
        ordList.add("ahead");               // At index 140
        ordList.add("already");             // At index 141
        ordList.add("also");                // At index 142
        ordList.add("although");            // At index 143
        ordList.add("always");              // At index 144
        ordList.add("American");            // At index 145
        ordList.add("Sweden");              // At index 146
        ordList.add("among");               // At index 147
        ordList.add("baby");                // At index 148
        ordList.add("back");                // At index 149
        ordList.add("bag");                 // At index 150
        ordList.add("ball");                // At index 151
        ordList.add("bank");                // At index 152
        ordList.add("bar");                 // At index 153
        ordList.add("base");                // At index 154
        ordList.add("beautiful");           // At index 155
        ordList.add("because");             // At index 156
        ordList.add("become");              // At index 157
        ordList.add("before");              // At index 158
        ordList.add("begin");               // At index 159
        ordList.add("behavior");            // At index 160
        ordList.add("behind");              // At index 161
        ordList.add("believe");             // At index 162
        ordList.add("benefit");             // At index 162
        ordList.add("better");              // At index 163
        ordList.add("break");               // At index 163
        ordList.add("building");            // At index 164
        ordList.add("call");                // At index 165
        ordList.add("camera");              // At index 166
        ordList.add("capital");             // At index 167
        ordList.add("car");                 // At index 168
        ordList.add("card");                // At index 169
        ordList.add("career");              // At index 170
        ordList.add("carry");               // At index 171
        ordList.add("cell");                // At index 172
        ordList.add("center");              // At index 173
        ordList.add("century");             // At index 174
        ordList.add("certain");             // At index 175
        ordList.add("challenge");           // At index 176
        ordList.add("character");           // At index 177
        ordList.add("detail");              // At index 178
        ordList.add("drive");               // At index 179
        ordList.add("down");                // At index 180
        ordList.add("doctor");              // At index 181
        ordList.add("effort");              // At index 182
        ordList.add("either");              // At index 183
        ordList.add("election");            // At index 184
        ordList.add("employee");            // At index 185
        ordList.add("energy");              // At index 186
        ordList.add("enough");              // At index 187
        ordList.add("even");                // At index 188
        ordList.add("fact");                // At index 189
        ordList.add("family");              // At index 190
        ordList.add("fear");                // At index 191
        ordList.add("federal");             // At index 192
        ordList.add("feeling");             // At index 193
        ordList.add("field");               // At index 194
        ordList.add("fight");               // At index 195
        ordList.add("film");                // At index 196
        ordList.add("food");                // At index 197
        ordList.add("forget");              // At index 198
        ordList.add("final");               // At index 199
        ordList.add("worry");               // At index 200












    }
}

