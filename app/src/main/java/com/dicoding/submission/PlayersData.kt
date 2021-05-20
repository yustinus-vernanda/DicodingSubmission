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
        "Isiah Thomas"


    )


    private val playersPhotos = intArrayOf(
        R.drawable.kobe_bryant,
        R.drawable.michael_jordan,
        R.drawable.tim_duncan,
        R.drawable.charles_barkley,
        R.drawable.paul_pierce,
        R.drawable.gary_payton,
        R.drawable.isiah_thomas
    )

    private val playersDetails = arrayOf(
        "Kobe Bean Bryant (/ˈkoʊbiː/ KOH-bee; August 23, 1978 – January 26, 2020) was an American professional basketball player. A shooting guard, he spent his entire 20-year career with the Los Angeles Lakers in the National Basketball Association (NBA). Regarded as one of the greatest players of all time, Bryant won five NBA championships, was an 18-time All-Star, a 15-time member of the All-NBA Team, a 12-time member of the All-Defensive Team, the 2008 NBA Most Valuable Player (MVP), and a two-time NBA Finals MVP.",
        "Michael Jeffrey Jordan (born February 17, 1963), also known by his initials MJ, is an American businessman and former professional basketball player. He is the principal owner and chairman of the Charlotte Hornets of the National Basketball Association (NBA) and of 23XI Racing in the NASCAR Cup Series. He played 15 seasons in the NBA, winning six championships with the Chicago Bulls.",
        "Timothy Theodore Duncan (born April 25, 1976) is an American former professional basketball player and coach. Nicknamed \"the Big Fundamental\", he is widely regarded as the greatest power forward of all time and one of the greatest players in NBA history. He spent his entire 19-year playing career with the San Antonio Spurs.",
        "Charles Wade Barkley (born February 20, 1963) is an American former professional basketball player who is an analyst on Inside the NBA. Nicknamed \"Sir Charles\" and \"the Round Mound of Rebound,\" Barkley established himself as one of the National Basketball Association's greatest Power Forwards/Small Forwards of all time. Barkley was an 11-time NBA All-Star, an 11-time member of the All-NBA Team, and the 1993 NBA Most Valuable Player (MVP).",
        "Paul Anthony Pierce (born October 13, 1977) is an American former professional basketball player who played 19 seasons in the National Basketball Association (NBA), predominantly with the Boston Celtics. He was most recently an analyst on ESPN's basketball programs The Jump and NBA Countdown.",
        "Gary Dwayne Payton Sr. (born July 23, 1968) is an American former professional basketball player who played the point guard position. He is best known for his 13-year tenure with the Seattle SuperSonics, and holds Seattle franchise records in points, assists, and steals. He also played with the Milwaukee Bucks, Los Angeles Lakers, Boston Celtics, and Miami Heat. Payton won an NBA championship with the Heat in 2006. Nicknamed \"The Glove\" for his defensive abilities, Payton was inducted into the Naismith Basketball Hall of Fame in 2013.",
        "Isiah Lord Thomas III (born April 30, 1961) is an American former professional basketball player, coach and executive who is an analyst for NBA on TNT. A point guard, the 12-time NBA All-Star was named one of the 50 Greatest Players in NBA History and inducted into the Naismith Memorial Basketball Hall of Fame. He played his entire professional career for the Detroit Pistons of the National Basketball Association (NBA)."


    )
    private val playersAges = intArrayOf(
        41,
        58,
        45,
        58,
        43,
        52,
        60
    )
    private val playersClubs = arrayOf(
        "Los Angeles Lakers",
        "Chicago Bulls",
        "San Antonio Spurs",
        "Phoenix Suns",
        "Boston Celtics",
        "Seattle SuperSonics",
        "Detroit Pistons"

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