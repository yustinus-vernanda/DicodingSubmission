package com.dicoding.submission

import java.util.*
import kotlin.collections.ArrayList

object PlayersData {
    private val playersNames = arrayOf(
        "Kobe Bryant",
        "Michael Jordan",
        "Tim Duncan",
        "Charles Barkley",
        "Paul Pierce",
        "Gary Payton",
        "Isiah Thomas",
        "Allen_inverson",
        "Kareem Abdul Jabbar",
        "Larry Page",
        "Magic Johnson",
        "Scottie Pippen",
        "Shaquille O'Neal",
        "Steve Nash",
        "Yao Ming"
    )


    private val playersPhotos = intArrayOf(
        R.drawable.kobe_bryant,
        R.drawable.michael_jordan,
        R.drawable.tim_duncan,
        R.drawable.charles_barkley,
        R.drawable.paul_pierce,
        R.drawable.gary_payton,
        R.drawable.isiah_thomas,
        R.drawable.allen_iverson,
        R.drawable.kareem_abdul_jabbar,
        R.drawable.larry_bird,
        R.drawable.magic_johnson,
        R.drawable.scottie_pippen,
        R.drawable.shaquille_oneal,
        R.drawable.steve_nash,
        R.drawable.yao_ming
    )



    private val playersDetails = arrayOf(
        "Kobe Bean Bryant (/ˈkoʊbiː/ KOH-bee; August 23, 1978 – January 26, 2020) was an American professional basketball player. A shooting guard, he spent his entire 20-year career with the Los Angeles Lakers in the National Basketball Association (NBA). Regarded as one of the greatest players of all time, Bryant won five NBA championships, was an 18-time All-Star, a 15-time member of the All-NBA Team, a 12-time member of the All-Defensive Team, the 2008 NBA Most Valuable Player (MVP), and a two-time NBA Finals MVP.",
        "Michael Jeffrey Jordan (born February 17, 1963), also known by his initials MJ, is an American businessman and former professional basketball player. He is the principal owner and chairman of the Charlotte Hornets of the National Basketball Association (NBA) and of 23XI Racing in the NASCAR Cup Series. He played 15 seasons in the NBA, winning six championships with the Chicago Bulls.",
        "Timothy Theodore Duncan (born April 25, 1976) is an American former professional basketball player and coach. Nicknamed \"the Big Fundamental\", he is widely regarded as the greatest power forward of all time and one of the greatest players in NBA history. He spent his entire 19-year playing career with the San Antonio Spurs.",
        "Charles Wade Barkley (born February 20, 1963) is an American former professional basketball player who is an analyst on Inside the NBA. Nicknamed \"Sir Charles\" and \"the Round Mound of Rebound,\" Barkley established himself as one of the National Basketball Association's greatest Power Forwards/Small Forwards of all time. Barkley was an 11-time NBA All-Star, an 11-time member of the All-NBA Team, and the 1993 NBA Most Valuable Player (MVP).",
        "Paul Anthony Pierce (born October 13, 1977) is an American former professional basketball player who played 19 seasons in the National Basketball Association (NBA), predominantly with the Boston Celtics. He was most recently an analyst on ESPN's basketball programs The Jump and NBA Countdown.",
        "Gary Dwayne Payton Sr. (born July 23, 1968) is an American former professional basketball player who played the point guard position. He is best known for his 13-year tenure with the Seattle SuperSonics, and holds Seattle franchise records in points, assists, and steals. He also played with the Milwaukee Bucks, Los Angeles Lakers, Boston Celtics, and Miami Heat. Payton won an NBA championship with the Heat in 2006. Nicknamed \"The Glove\" for his defensive abilities, Payton was inducted into the Naismith Basketball Hall of Fame in 2013.",
        "Isiah Lord Thomas III (born April 30, 1961) is an American former professional basketball player, coach and executive who is an analyst for NBA on TNT. A point guard, the 12-time NBA All-Star was named one of the 50 Greatest Players in NBA History and inducted into the Naismith Memorial Basketball Hall of Fame. He played his entire professional career for the Detroit Pistons of the National Basketball Association (NBA).",
        "Allen Ezail Iverson (/ˈaɪvərsən/; born June 7, 1975), nicknamed \"the Answer\" and \"AI\", is an American former professional basketball player.[1][2] He played 14 seasons in the National Basketball Association (NBA) at both the shooting guard and point guard positions. Iverson was an 11-time NBA All-Star, won the All-Star game MVP award in 2001 and 2005, and was the NBA's Most Valuable Player (MVP) in 2001. He was inducted into the Naismith Memorial Basketball Hall of Fame in 2016.",
        "Kareem Abdul-Jabbar (born Ferdinand Lewis Alcindor Jr.; April 16, 1947) is an American former professional basketball player who played 20 seasons in the National Basketball Association (NBA) for the Milwaukee Bucks and the Los Angeles Lakers. During his career as a center, Abdul-Jabbar was a record six-time NBA Most Valuable Player (MVP), a record 19-time NBA All-Star, a 15-time All-NBA selection, and an 11-time NBA All-Defensive Team member. A member of six NBA championship teams as a player and two more as an assistant coach, Abdul-Jabbar twice was voted NBA Finals MVP. In 1996, he was honored as one of the 50 Greatest Players in NBA History. NBA coach Pat Riley and players Isiah Thomas and Julius Erving have called him the greatest basketball player of all time",
        "Larry Joe Bird (born December 7, 1956) is an American former professional basketball player, coach and executive in the National Basketball Association (NBA). Nicknamed \"the Hick from French Lick\" and \"Larry Legend\", Bird is widely regarded as one of the greatest basketball players of all time.",
        "Earvin \"Magic\" Johnson Jr. (born August 14, 1959) is an American former professional basketball player and former president of basketball operations of the Los Angeles Lakers of the National Basketball Association (NBA). Often regarded as the best point guard of all time,[2][3] Johnson played 13 seasons for the Lakers and was honored as one of the 50 Greatest Players in NBA History in 1996. After winning championships in high school and college, Johnson was selected first overall in the 1979 NBA draft by the Lakers. He won a championship and an NBA Finals Most Valuable Player Award in his rookie season, and won four more championships with the Lakers during the 1980s. Johnson retired abruptly in 1991 after announcing that he had contracted HIV, but returned to play in the 1992 All-Star Game, winning the All-Star MVP Award. After protests from his fellow players, he retired again for four years, but returned in 1996, at age 36, to play 32 games for the Lakers before retiring for the third and final time.",
        "Scotty Maurice Pippen Sr.[3][4] (born September 25, 1965), usually spelled Scottie Pippen, is an American former professional basketball player. He played 17 seasons in the National Basketball Association (NBA), winning six NBA championships with the Chicago Bulls. Pippen, along with Michael Jordan, played an important role in transforming the Bulls into a championship team and in popularizing the NBA around the world during the 1990s.",
        "Shaquille Rashaun O'Neal (/ʃəˈkiːl/ shə-KEEL; /ʃæk/ SHAK; born March 6, 1972) is an American former professional basketball player who is a sports analyst on the television program Inside the NBA.[1] O’Neal was a 7-foot-1-inch (2.16 m) and 325-pound (147 kg) center who played for six teams over his 19-year career in the National Basketball Association (NBA) and is a four-time NBA champion. O'Neal is regarded as one of the greatest basketball players and centers of all time.",
        "Stephen John Nash OC OBC (born 7 February 1974) is a Canadian professional basketball coach and former player who is the head coach of the Brooklyn Nets of the National Basketball Association (NBA). He played 18 seasons in the National Basketball Association (NBA), where he was an eight-time All-Star and a seven-time All-NBA selection. Nash was a two-time NBA Most Valuable Player while playing for the Phoenix Suns.",
        "Yao Ming (Chinese: 姚明; born September 12, 1980) is a Chinese basketball executive and former professional player. He played for the Shanghai Sharks of the Chinese Basketball Association (CBA) and the Houston Rockets of the National Basketball Association (NBA). Yao was selected to start for the Western Conference in the NBA All-Star Game eight times, and was named to the All-NBA Team five times. At the time of his final season, he was the tallest active player in the NBA, at 2.29 m (7 ft 6 in).[1] He is the only player from outside of the United States to lead the NBA in All-Star votes"


    )



    private val playersAges = intArrayOf(
        41,
        58,
        45,
        58,
        43,
        52,
        60,
        45,
        74,
        64,
        61,
        55,
        49,
        47,
        40
    )

    private val playersClubs = arrayOf(
        "Los Angeles Lakers",
        "Chicago Bulls",
        "San Antonio Spurs",
        "Phoenix Suns",
        "Boston Celtics",
        "Seattle SuperSonics",
        "Detroit Pistons",
        "Philadelphia 76ers",
        "Los Angeles Lakers",
        "Boston Celtics",
        "Los Angeles Lakers",
        "Chicago Bulls",
        "Los Angeles Lakers",
        "Phoenix Suns",
        "Houston Rockets"

    )


    val listData : ArrayList<Players>
        get() {
            val list = arrayListOf<Players>()
            for(position in playersNames.indices){
                val player = Players()
                player.name = playersNames[position]
                player.detail = playersDetails[position]
                player.photo = playersPhotos[position]
                player.age = playersAges[position]
                player.club = playersClubs[position]
                player.index = position
                list.add(player)
            }
            return list
        }
}