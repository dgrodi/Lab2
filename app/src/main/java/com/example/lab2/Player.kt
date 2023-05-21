package com.example.lab2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    val name: String,
    val Number: Int,
    val Position: String,
    val Plot: String,
    val ResId: Int,
) : Parcelable

fun createManga(): List<Player> {
    return listOf(
        Player(
            "Kylian Mbappé",
            7,
            "Forward",
            "Born in the capital in 1998 and raised in a sporting family in the Parisian suburb of Bondy, Kylian Mbappé first joined the French National Football Institution at Clairefontaine before moving to Monaco’s academy. At the age of 17, the prodigy exploded onto the European scene and became a Ligue 1 champion in 2017.\n" +
                    "\n" +
                    "Signed by Paris Saint-Germain just a few weeks later, the man that led Les Bleus to World Cup glory in 2018 quickly became a key player in Rouge et Bleu.\n" +
                    "\n" +
                    "The third-highest goal scorer in club history, the Paris No.7 has developed an unquenchable thirst for records. He has finished as the league’s top scorer four times and won the Ligue 1 Player of the Year award three times. During a remarkable 2021/22 season, he moved into second place in the Club’s all-time scoring chart, and finished the campaign as the player with the most goal involvements across Europe (42).\n" +
                    "\n" +
                    "Despite being coveted by all of European football, ‘KM7’ opted to sign a new contract to continue his love affair with the City of Light.",
            R.drawable.mbappe
        ),

        Player(
            "Neymar Jr",
            10,
            "Forward",
            "A genuine footballing superstar, Neymar Jr quickly became a sensation in his home country of Brazil. He played 230 professional games for his first club Santos FC, scoring 138 goals before moving to Barcelona in Europe, where he scored an impressive 105 goals in 186 games. Neymar Jr won the Champions League in 2015 and the Olympic games in Rio in 2016, alongside his current teammates Marquinhos and Rafinha.\n" +
                    "\n" +
                    "In 2017, the Brazilian signed for Paris Saint-Germain before then teaming up with another high-powered new arrival, Kylian Mbappé, determined to write history. A technical leader, a dribbling genius, an unpredictable detonator, the number 10 quickly sparked in the City of Light, helping the capital club to the Champions League final in the summer of 2020.",
            R.drawable.neymar
        ),

        Player(
            "Lionel Messi",
            30,
            "Forward",
            "It’s hard to find the words to describe a man that the football world knows simply as ‘The GOAT’. Born in Rosario, the Argentine crossed the Atlantic at just 13 years of age to join FC Barcelona. 21 years later, the famous left foot has dribbled its way to Paris Saint-Germain, for the biggest challenge of his career.\n" +
                    "\n" +
                    "In between, ‘Leo’ has scaled all the heights. Messi has won 4 Champions League, 10 Liga titles, 7 Copa del Rey, 6 European Golden Boots, an Olympic gold medal and lifted the Copa America with Argentina, just before landing in the French capital.\n" +
                    "\n" +
                    "The all-time leading goal scorer for his country, the top scorer in the history of Spanish football, the top assist provider in the 21st century, Messi has broken all the records, but above all, inspired an entire generation of footballers around the world with his genius.\n" +
                    "\n" +
                    "A living legend, ‘La Pulga’ has won seven Ballons d’Or, and history will remember his first Paris goal in September 2021: a masterpiece of a strike against Manchester City to send the Parc delirious.",
            R.drawable.messi
        ),
        Player(
            "Hugo Ekitike",
            44,
            "Forward",
            "It’s in the capital of Champagne, Reims, that Hugo was born, and he started playing in the city’s suburbs aged 5 with Cormontreuil FC. He quickly caught the eye of his hometown’s major club, and was drafted into the Stade de Reims youth academy aged 11. The rangy forward quickly rose through the ranks: he scored five goals for the reserve team at 17 and soon signed his first professional contract.\n" +
                    "\n" +
                    "His Ligue 1 debut followed, and – after a loan spell at Danish club Vejle Boldklub – he returned to reinforce the Reims attack, becoming the youngest player to net 10 top-flight goals in the last half-century.\n" +
                    "\n" +
                    "Technical and physical, Ekitike has developed into one of France’s most promising goalgetters. He signed for the capital club through to July 2022 in a loan deal that includes a purchase option.",
            R.drawable.hugo
        ),
        Player(
            "Sergio Rico",
            16,
            "Goalkeeper",
            "A native of Seville, Sergio learnt his trade at his local club. From 2006 to 2011 as a junior, then as a pro from 2014 to 2020, the Andalusian goalkeeper was between the posts of FC Sevilla, winning the UEFA Europa League twice (2015 and 2016).\n" +
                    "\n" +
                    "After a season in the Premier League with Fulham, Sergio signed a one-year loan contract with Paris Saint-Germain. A much liked and respected member of the squad and after some outstanding performances, the Spaniard signed a four-year contract. Following half a season on loan at Mallorca, he returned to Paris in summer 2022.",
            R.drawable.sergio1

        ),
        Player(
            "Alexandre Letellier",
            90,
            "Goalkeeper",
            "A product of the Paris Saint-Germain youth academy where he stayed between 2000 and 2010, Alexandre then joined Angers, signing his first professional contract in Anjou.\n" +
                    "\n" +
                    "Under contract with the SCO until 2020, he then played for the Young Boys of Bern (Switzerland), ESTAC and Sarpsborg 08 (Norway), before finally returning to his first love and signing up as third goalkeeper for Paris Saint-Germain in the 2020-21 season. Since, the love affair between the Paris-born custodian and the City of Light has continued.",
            R.drawable.alexandre1
        ),
        Player(
            "Gianluigi Donnarumma",
            99,
            "Goalkeeper",
            "Signed in the summer of 2021 at just 22 years old, ‘Gigio’ Donnarumma already had an impressive CV when he arrived in the capital. After training with the AC Milan first team at just 14 years old, he was just 16 when he got his first taste of the Italian top flight. A first in Italian football. And that was the start of six seasons as a starter at the San Siro.\n" +
                    "\n" +
                    "The youngest player in the history of Italian football to reach 100 and then 200 league matches, the 1m96 goalkeeper has beaten all of the records, impressing with his gloves, his style and the maturity shown between the sticks of the Rossoneri. Qualities that he has also demonstrated with the Squadra Azzurra, where he was voted Best Goalkeeper of Euro U17, before he picked up his first cap at just 17 years old (another record) and then followed in the footsteps of the legendary Gigi Buffon at 19 years old.\n" +
                    "\n" +
                    "He was voted Best Goalkeeper in Serie A and the Player of the Tournament at Euro 2020 just before signing for Paris, and won the 2021 Yashin Trophy for the world’s top goalkeeper.",
            R.drawable.gianluigi1
        ),
        Player(
            "Achraf Hakimi",
            2,
            "Defender",
            "Born in the Spanish capital to Moroccan parents, Achraf Hakimi joined the Real Madrid Academy at just 7 years old. He progressed through the age groups before he was given his first chance with the first team at 18 years old by Zinedine Zidane.\n" +
                    "\n" +
                    "After winning the Champions League, it was at Borussia Dortmund that he plied his trade for two years, continuing his development as a right back and cementing his place in the starting eleven. During his second season in Germany, the defender ended the campaign with 9 goals and 10 assists to his name just in the Bundesliga, and several incredible moments, including his brace against Inter Milan in the Champions League. It didn’t take much to win over Antonio Conte, who bought the man who had terrorised his side the following summer.\n" +
                    "\n" +
                    "In Italy, he was directly involved in another 15 goals and helped his side to their first Serie A title in 10 years. A sixth trophy for the 22 year old, who has already been named as the best Moroccan youngster of his generation.\n" +
                    "\n" +
                    "Hakimi was recruited by Paris Saint-Germain in the summer of 2021.",
            R.drawable.achraf1
        ),
        Player(
            "Presnel Kimpembe",
            3,
            "Defender",
            "Pure product of the Paris Academy, Presnel Kimpembe took his first steps in football with AS Éragny (Val-d’Oise), before joining the club from the capital in 2005, at just ten years old.\n" +
                    "\n" +
                    "Playing in each of the age groups on his way up to the Reserves, ‘Presko’ started his professional career during Laurent Blanc’s time in charge. France discovered his joviality over the summer of 2018, during which he was crowned World Champion with Didier Deschamps’ Les Bleus.\n" +
                    "\n" +
                    "With Paris Saint-Germain, he has made his name in the centre of the defence, with the club emblem bolted to his heart.",
            R.drawable.presnel
        ),
        Player(
            "Sergio Ramos",
            4,
            "Defender",
            "Born and raised in Seville, it was at Real Madrid, the club for whom he signed at 16 years old, that Sergio Ramos truly earned his status as a footballing legend.\n" +
                    "\n" +
                    "The man who is now recognised as one of the best defenders in the history of the game, lifted 22 trophies, including five La Liga and four Champions League titles during his time in the Spanish capital. In total, he played 671 matches and found the back of the net on 101 occasions, an almost unheard of feat for a defender.\n" +
                    "\n" +
                    "The same can be said for his record with the Spanish national side, with whom he won Euro 2008, World Cup 2010 and Euro 2012, and scored 23 goals. 15 years after his international debut, he is now the most capped Spanish player in history (180 caps).\n" +
                    "\n" +
                    "Arriving in Paris in the summer of 2021, “SR4” has arrived in the capital to bring his experience, but also his competitive spirit, epitomised by his sense of sacrifice and a hunger to win.",
            R.drawable.ramos
        ),
        Player(
            "Marquinhos",
            5,
            "Defender",
            "After making a name for himself at his first club, Corinthians, Marcos Aoás Corrêa - also known as Marquinhos - travelled to Europe to join AS Roma in 2012. And it took less than a year for the promising defender to cross the Alps.\n" +
                    "\n" +
                    "Approached at 19 years old by Paris Saint-Germain, the young Brazilian quickly made his mark as a pillar of the club from the capital, as well as with the Brazil national side. A true rock in defence, who is equally capable of plying his trade in midfield, ‘Marqui’ quickly won over the City of Lights with his strength of character, his loyalty and maturity.\n" +
                    "\n" +
                    "Cherry on the cake, he is one of the most prolific defenders in the club’s history. A flawless vice-captain alongside Thiago Silva, he picked up the captain’s armband from his fellow countryman during the summer of 2020. Boss.",
            R.drawable.marquinhos
        ),
        Player(
            "Juan Bernat",
            14,
            "Defender",
            "Before arriving in the French capital, Juan Bernat had already played in two European leagues. First in La Liga, where he took his first steps at the highest level with his boyhood club, Valencia CF, before heading to the Bundesliga in 2014 to join Pep Guardiola’s Bayern Munich.\n" +
                    "\n" +
                    "After four years and a series of titles with The Bavarians, the Spaniard opted for a new challenge in Ligue 1, with Paris Saint-Germain. ‘Juanito’ quickly impressed at full-back, especially in the UEFA Champions League, where he scored three decisive goals in his first season at the club.",
            R.drawable.juan
        ),
        Player(
            "Nuno Mendes",
            25,
            "Defender",
            "Born on 19 June, 2002, in Sintra in the Lisbon suburbs, Nuno Alexandre Tavares Mendes started playing football with Despertar at Casal de Cambra, and his talent was soon spotted by the country’s biggest clubs.\n" +
                    "\n" +
                    "A year after his arrival, he joined the Sporting CP youth academy. He excelled at full-back, progressing from his nation’s U16 side all the way to making his U21 debut in 2020. He also made his first-team debut at club level, and played 47 times (1 goal, 3 assists), helping them to the league title and League Cup.\n" +
                    "\n" +
                    "He also made his senior international debut and went to EURO 2020 before leaving his home country to join Paris Saint-Germain. The left-back is the 13th Portuguese player to wear the Rouge-et-Bleu shirt, and has quickly become one of the best young players in the league.",
            R.drawable.nuno
        ),
        Player(
            "Nordi Mukiele",
            26,
            "Defender",
            "Before his move to Germany, Mukiele was first and foremost an Île-de-France boy. Born in Montreuil, Seine-Saint-Denis, his first taste of football came in the capital, as he played for Paris FC between the ages of six and 15. This was enough to catch the attention of Stade Lavallois, with Mukiele joining their academy in order to fully learn the ropes as a defender. Standing at 6 ft 1 in tall, the young Nordi hurtled up through the club’s youth ranks, making his professional debut at just 17.\n" +
                    "\n" +
                    "After being propelled into the French top flight by Montpellier three years later, he became a regular starter in Hérault before emigrating to Germany in 2018. In his four years at RB Leipzig, the robust defender matured into an athletic wing-back armed with a solid level of experience, having made 140 appearances, including 23 in the UEFA Champions League.\n" +
                    "\n" +
                    "It was a dimension shift that Paris Saint-Germain got the chance to inspect closely after they came up against him on five occasions in the two sides’ European encounters. Having already crossed paths with the club, then, it’s something of a homecoming for Mukiele, as the player who left the Paris region at the age of 15 returns to the capital less than ten years later to become one of Paris Saint-Germain’s 2022 summer signings.",
            R.drawable.nordi
        ),
        Player(
            "Timothée Pembélé",
            29,
            "Defender",
            "Timothée Pembélé was born in Beaumont-sur-Oise, into a family originally from the Democratic Republic of Congo. And it was less than a kilometre from his hometown that he first kicked a ball, joining the Persan club at the age of 6. He was only 13 when he made his passion for football a little more important, joining the Paris Saint-Germain pre-youth academy team to perfect his talents as a young defender.\n" +
                    "\n" +
                    "A talent that was soon rewarded, as he signed his very first professional contract with the club from the capital when he was only 15 years old. What followed was a logical rise, both in the French team and at club level, where he played for a new youth category every year. With the tricolores, he played for the U20 team and participated in the Olympic Games in 2020. With Paris, he left his captaincy at U19 level to make his first appearances with the professional team in Ligue 1 and the Champions League.\n" +
                    "\n" +
                    "In the summer of 2021, he signed a season-long loan deal with Girondins de Bordeaux, with whom he scored 3 goals. A serious injury at the end of the season kept him away from the pitch for a long time. Through perseverance, Timothée managed to return to the pitch in 2022, wearing the colours of his favourite club, Paris Saint-Germain.",
            R.drawable.timo
        ),
        Player(
            "Marco Verratti",
            6,
            "Midfielder",
            "A gem unearthed in his native city of Pescara, where he played in the Italian second division, he arrived in the capital in 2012 as a rising star of the European game. Marco Verratti quickly established himself as a leader on and off the field. A tireless midfielder, a hard worker, Verratti is a true pillar of the club and a darling of the supporters.\n" +
                    "\n" +
                    "Beyond his talent and audacity, the Italian international has become one of the players to make the most appearances in the history of Paris Saint-Germain, and has played more European matches than anybody else in the Rouge et Bleu shirt. Following the Club’s 2021/22 title win, he became the record-holder of the most Ligue 1 winner’s medals with eight.",
            R.drawable.marco
        ),
        Player(
            "Fabian Ruiz",
            8,
            "Midfielder",
            "It was in his home town of Los Palacios y Villafranca, in the province of Andalusia, that the young Fabian discovered football. His appetite for football led him to the Real Betis youth academy at the age of eight, where he honed his skills as a midfielder at all youth levels.\n" +
                    "\n" +
                    "In 2014, having just turned 18, he joined the Spanish club's reserves, with whom he would be crowned Spanish D2 champion. He made his debut for the first team the following summer, before going on loan to Elche CF during the winter to practise his skills. Napoli's scouts then made a move for the tall (1.89m) creative midfielder to join the Serie A side. Under Ancelotti and then Gattuso, Ruiz became an automatic starter, which sent him straight to the Spanish national team (15 caps).\n" +
                    "\n" +
                    "With the Azzurri, the regista eventually made no less than 166 appearances, including 32 at European level (22 goals, 15 assists), before deciding to cross the Alps for a new challenge. It was in the summer of 2022 that the 26-year-old Andalusian moved to Paris Saint-Germain for the big move.",
            R.drawable.fabian
        ),
        Player(
            "Danilo Pereira",
            15,
            "Midfielder",
            "Bissau native Danilo came through the youth ranks at Estoril and then Benfica in Portugal, before moving to Parma in Italy to sign his first professional contract. Three years later, and after loan spells with Aris (Greece) and Roda JC (Netherlands) he returned to Portugal with Club Sport Maritimo in Funchal and finally fulfilled his immense potential.\n" +
                    "\n" +
                    "Fifty-four matches, and four goals later, he was signed by FC Porto in July 2015. Over the next five years with Porto - with whom he became captain - he was twice crowned champion of Portugal and also won a Portuguese Cup and Supercup, while with the Portugal national team he won Euro 2016 as well as the most recent UEFA Nations League.\n" +
                    "\n" +
                    "After arriving on the very last day of the 2020 summer transfer window on loan, Danilo’s commitment, humility and professionalism shone through, and the move was made permanent in May 2021. Twelve months later, he played his part in the Club’s 10th Ligue 1 title win.",
            R.drawable.danilo
        ),
        Player(
            "Vitinha",
            17,
            "Midfielder",
            "Vitor Machado Ferreira, nicknamed Vitinha, was born in Santo Tirso in the Porto suburbs, and joined his hometown club’s youth academy aged just 11. He helped them to a UEFA Youth League triumph in 2019, and was named Player of the Toulon Tournament and reached the U19 EURO final with Portugal.\n" +
                    "\n" +
                    "After making his first-team debut for Porto, he joined English Premier League side Wolverhampton Wanderers on loan before returning to become a key part of Sergio Conceição’s side. He was integral to their league-cup double last season, and earned himself a call-up to the senior Portugal team.\n" +
                    "\n" +
                    "Named the Portuguese league's Young Player of the Year, he joined Paris Saint-Germain on a five-year deal, becoming — aged just 22 — the first signing of the 2022/23 summer transfer window.",
            R.drawable.vitinha
        ),
        Player(
            "Renato Sanches",
            18,
            "Midfielder",
            "Renato Sanches was born in Lisbon to Cape Verdean parents and started playing football at a very early age. At just nine years old, the wonderkid joined Benfica's youth academy and worked his way up through the ranks until he signed his first professional contract when he came of age. That year, the 'Golden Boy' broke all the records for being the youngest scorer in the 21st century and the youngest player in the European Cup, and played an active role in the Lisbon club's League and Cup double. He was rightly voted the league's best young player.\n" +
                    "\n" +
                    "His rise to prominence took him all the way to the Portuguese national team, with whom he won Euro 2016 and the awards for best young player, youngest goalscorer and youngest winner in the history of the competition.\n" +
                    "\n" +
                    "These performances earned him a move to Bayern Munich, where he won two league titles, a cup and a Supercup in Germany before a loan spell with Swansea.\n" +
                    "\n" +
                    "As a sign of his resilience, Renato gave a new lease of life to his career by joining Christophe Galtier's LOSC in 2019, with whom he won the French league title. A coach he was reunited with when he left the Flanders capital for the French one in the summer of 2022.",
            R.drawable.renato
        ),
        Player(
            "Carlos Soler",
            28,
            "Midfielder",
            "He was born in Valencia, Spain's third largest city, and it was on the Mediterranean coast that the young boy first kicked a ball. He started in the small village of Bonrepos i Mirambell, then moved to the big city's academy, from the age of 7. At Valencia FC's youth academy, the local boy rose through the ranks, from the youth teams to the reserves, the Mestalla, before Cesare Prendelli threw him into the deep end of La Liga at the age of 19.\n" +
                    "\n" +
                    "It was the start of a long spell, during which Soler made 226 appearances, including 18 in Europe, scoring 36 goals and providing 31 assists. A journey that also saw him called up to Spain's youth teams (with whom he won the Euro 2019 and took silver at the Tokyo Olympics) and then to La Roja from 2021.\n" +
                    "\n" +
                    "Capable of playing in all attacking roles, the 25-year-old has demonstrated his vision, his playmaking ability and his leadership over the years. These qualities caught the eye of Paris Saint-Germain, who snapped up the Valencia maestro in the summer of 2022.",
            R.drawable.soler
        ),

    )

}