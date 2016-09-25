package de.henny022.RiskOnline.Territories;

import java.util.Arrays;

/**
 * Created by henny on 24.09.16.
 */
public class Continents
{
    public static Continent NORTH_AMERICA = new Continent(ContinentEnum.NORTH_AMERIKA, "North America",
                                                          Arrays.asList(Territories.ALASKA, Territories.ALBERTA,
                                                                        Territories.NORTH_WEST_TERRITORY,
                                                                        Territories.ONTARIO, Territories.QUEBEC,
                                                                        Territories.GREENLAND,
                                                                        Territories.WESTERN_UNITED_STATES,
                                                                        Territories.EASTERN_UNITED_STATES,
                                                                        Territories.CENTRAL_AMERICA
                                                          ), 5
    );

    public static Continent SOUTH_AMERICA = new Continent(ContinentEnum.SOUTH_AMERIKA, "South America",
                                                          Arrays.asList(Territories.VENEZUELA, Territories.PERU,
                                                                        Territories.BRAZIL, Territories.ARGENTINA
                                                          ), 2
    );

    public static Continent EUROPE = new Continent(ContinentEnum.EUROPE, "Europe",
                                                   Arrays.asList(Territories.ICELAND, Territories.GREAT_BRITAIN,
                                                                 Territories.SCANDINAVIA, Territories.UKRAINE,
                                                                 Territories.NORTHERN_EUROPE,
                                                                 Territories.WESTERN_EUROPE, Territories.SOUTHERN_EUROPE
                                                   ), 5
    );

    public static Continent AFRICA = new Continent(ContinentEnum.AFRICA, "Africa",
                                                   Arrays.asList(Territories.NORTH_AFRICA, Territories.EGYPT,
                                                                 Territories.CONGO, Territories.WESTERN_AUSTRALIA,
                                                                 Territories.SOUTH_AFRICA, Territories.MADAGASKAR
                                                   ), 3
    );

    public static Continent ASIA = new Continent(ContinentEnum.ASIA, "Asia",
                                                 Arrays.asList(Territories.KAMCHATKA, Territories.YAKUTSK,
                                                               Territories.IRKUTSK, Territories.AFGHANISTAN,
                                                               Territories.MONGOLIA, Territories.CHINA,
                                                               Territories.JAPAN, Territories.INDIA, Territories.SIAM,
                                                               Territories.MIDDLE_EAST, Territories.URAL,
                                                               Territories.SIBERIA
                                                 ), 7
    );

    public static Continent AUSTRALIA = new Continent(ContinentEnum.AUSTRALIA, "Australia",
                                                      Arrays.asList(Territories.INDONESIA, Territories.NEW_GUINEA,
                                                                    Territories.WESTERN_AUSTRALIA,
                                                                    Territories.EASTERN_AUSTRALIA
                                                      ), 2
    );

}
