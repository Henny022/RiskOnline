package de.henny022.RiskOnline.Territories;

import java.util.Arrays;

/**
 * Created by henny on 24.09.16.
 */
public class Territories
{
    public static Territory SOUTH_AFRICA = new Territory(TerritoryEnum.SOUTH_AFRIKA, "South Africa",
                                                         Arrays.asList(Territories.CONGO, Territories.EAST_AFRICA,
                                                                       Territories.MADAGASKAR
                                                         )
    );
    public static Territory MADAGASKAR = new Territory(TerritoryEnum.MADAGASCAR, "Madagaskar",
                                                       Arrays.asList(Territories.EAST_AFRICA, Territories.SOUTH_AFRICA)
    );
    public static Territory JAPAN =
            new Territory(TerritoryEnum.JAPAN, "Japan", Arrays.asList(Territories.MONGOLIA, Territories.KAMCHATKA));
    public static Territory EASTERN_AUSTRALIA = new Territory(TerritoryEnum.EASTERN_AUSTRALIA, "Eastern Australia",
                                                              Arrays.asList(Territories.WESTERN_AUSTRALIA,
                                                                            Territories.NEW_GUINEA
                                                              )
    );
    public static Territory WESTERN_AUSTRALIA = new Territory(TerritoryEnum.WESTERN_AUSTRALIA, "Western Australia",
                                                              Arrays.asList(Territories.INDONESIA,
                                                                            Territories.NEW_GUINEA,
                                                                            Territories.EASTERN_AUSTRALIA
                                                              )
    );
    public static Territory NEW_GUINEA = new Territory(TerritoryEnum.NEW_GUINEA, "New Guinea",
                                                       Arrays.asList(Territories.INDONESIA,
                                                                     Territories.WESTERN_AUSTRALIA,
                                                                     Territories.EASTERN_AUSTRALIA
                                                       )
    );
    //Australia
    public static Territory INDONESIA = new Territory(TerritoryEnum.INDONESIA, "Indonesia",
                                                      Arrays.asList(Territories.SIAM, Territories.NEW_GUINEA,
                                                                    Territories.WESTERN_AUSTRALIA
                                                      )
    );
    public static Territory SIAM = new Territory(TerritoryEnum.SIAM, "Siam",
                                                 Arrays.asList(Territories.INDIA, Territories.CHINA,
                                                               Territories.INDONESIA
                                                 )
    );
    public static Territory INDIA = new Territory(TerritoryEnum.INDIA, "India",
                                                  Arrays.asList(Territories.MIDDLE_EAST, Territories.AFGHANISTAN,
                                                                Territories.CHINA, Territories.SIAM
                                                  )
    );
    public static Territory MIDDLE_EAST = new Territory(TerritoryEnum.MIDDLE_EAST, "Middle East",
                                                        Arrays.asList(Territories.UKRAINE, Territories.SOUTHERN_EUROPE,
                                                                      Territories.EGYPT, Territories.EAST_AFRICA,
                                                                      Territories.AFGHANISTAN, Territories.INDIA
                                                        )
    );
    public static Territory EAST_AFRICA = new Territory(TerritoryEnum.EAST_AFRICA, "East Africa",
                                                        Arrays.asList(Territories.EGYPT, Territories.NORTH_AFRICA,
                                                                      Territories.CONGO, Territories.SOUTH_AFRICA,
                                                                      Territories.MADAGASKAR, Territories.MIDDLE_EAST
                                                        )
    );
    public static Territory EGYPT = new Territory(TerritoryEnum.EGYPT, "Egypt",
                                                  Arrays.asList(Territories.NORTH_AFRICA, Territories.EAST_AFRICA,
                                                                Territories.SOUTHERN_EUROPE, Territories.MIDDLE_EAST
                                                  )
    );
    public static Territory CONGO = new Territory(TerritoryEnum.CONGO, "Congo",
                                                  Arrays.asList(Territories.NORTH_AFRICA, Territories.EAST_AFRICA,
                                                                Territories.SOUTH_AFRICA
                                                  )
    );
    //Africa
    public static Territory NORTH_AFRICA = new Territory(TerritoryEnum.NORTH_AFRICA, "North Africa",
                                                         Arrays.asList(Territories.BRAZIL, Territories.SOUTHERN_EUROPE,
                                                                       Territories.EGYPT, Territories.EAST_AFRICA,
                                                                       Territories.CONGO
                                                         )
    );
    public static Territory BRAZIL = new Territory(TerritoryEnum.BRAZIL, "Brazil",
                                                   Arrays.asList(Territories.VENEZUELA, Territories.PERU,
                                                                 Territories.ARGENTINA, Territories.NORTH_AFRICA
                                                   )
    );
    public static Territory ARGENTINA =
            new Territory(TerritoryEnum.ARGENTINA, "Argentina", Arrays.asList(Territories.PERU, Territories.BRAZIL));
    public static Territory PERU = new Territory(TerritoryEnum.PERU, "Peru",
                                                 Arrays.asList(Territories.VENEZUELA, Territories.BRAZIL,
                                                               Territories.ARGENTINA
                                                 )
    );
    //South America
    public static Territory VENEZUELA = new Territory(TerritoryEnum.VENEZUELA, "Venezuela",
                                                      Arrays.asList(Territories.CENTRAL_AMERICA, Territories.PERU,
                                                                    Territories.BRAZIL
                                                      )
    );
    public static Territory CENTRAL_AMERICA = new Territory(TerritoryEnum.CENTRAL_AMERICA, "Central America",
                                                            Arrays.asList(Territories.EASTERN_UNITED_STATES,
                                                                          Territories.WESTERN_UNITED_STATES,
                                                                          Territories.VENEZUELA
                                                            )
    );
    public static Territory EASTERN_UNITED_STATES =
            new Territory(TerritoryEnum.EASTERN_UNITED_STATES, "Eastern United States",
                          Arrays.asList(Territories.WESTERN_UNITED_STATES, Territories.CENTRAL_AMERICA,
                                        Territories.QUEBEC, Territories.ONTARIO
                          )
            );
    public static Territory QUEBEC = new Territory(TerritoryEnum.QUEBEC, "Quebec",
                                                   Arrays.asList(Territories.GREENLAND, Territories.ONTARIO,
                                                                 Territories.EASTERN_UNITED_STATES
                                                   )
    );
    public static Territory WESTERN_UNITED_STATES =
            new Territory(TerritoryEnum.WESTERN_UNITED_STATES, "Western United States",
                          Arrays.asList(Territories.EASTERN_UNITED_STATES, Territories.ALBERTA, Territories.ONTARIO,
                                        Territories.CENTRAL_AMERICA
                          )
            );
    public static Territory SOUTHERN_EUROPE = new Territory(TerritoryEnum.SOUTHERN_EUROPE, "Southern_Europe",
                                                            Arrays.asList(Territories.NORTHERN_EUROPE,
                                                                          Territories.WESTERN_EUROPE,
                                                                          Territories.UKRAINE, Territories.MIDDLE_EAST,
                                                                          Territories.NORTH_AFRICA, Territories.EGYPT
                                                            )
    );
    public static Territory WESTERN_EUROPE = new Territory(TerritoryEnum.WESTERN_EUROPE, "Western Europe",
                                                           Arrays.asList(Territories.NORTHERN_EUROPE,
                                                                         Territories.SOUTHERN_EUROPE,
                                                                         Territories.GREAT_BRITAIN
                                                           )
    );
    public static Territory NORTHERN_EUROPE = new Territory(TerritoryEnum.NORTHERN_EUROPE, "Northern Europe",
                                                            Arrays.asList(Territories.GREAT_BRITAIN,
                                                                          Territories.WESTERN_EUROPE,
                                                                          Territories.SOUTHERN_EUROPE,
                                                                          Territories.SCANDINAVIA, Territories.UKRAINE
                                                            )
    );
    public static Territory AFGHANISTAN = new Territory(TerritoryEnum.AFGHANISTAN, "Afghanistan",
                                                        Arrays.asList(Territories.UKRAINE, Territories.URAL,
                                                                      Territories.CHINA, Territories.MIDDLE_EAST,
                                                                      Territories.INDIA
                                                        )
    );
    public static Territory CHINA = new Territory(TerritoryEnum.CHINA, "China",
                                                  Arrays.asList(Territories.MONGOLIA, Territories.SIBERIA,
                                                                Territories.URAL, Territories.AFGHANISTAN,
                                                                Territories.INDIA, Territories.SIAM
                                                  )
    );
    public static Territory MONGOLIA = new Territory(TerritoryEnum.MONGOLIA, "Mongolia",
                                                     Arrays.asList(Territories.SIBERIA, Territories.KAMCHATKA,
                                                                   Territories.IRKUTSK, Territories.CHINA,
                                                                   Territories.JAPAN
                                                     )
    );
    public static Territory IRKUTSK = new Territory(TerritoryEnum.IRKUTSK, "Irkutsk",
                                                    Arrays.asList(Territories.YAKUTSK, Territories.SIBERIA,
                                                                  Territories.MONGOLIA, Territories.KAMCHATKA
                                                    )
    );
    public static Territory KAMCHATKA = new Territory(TerritoryEnum.KAMCHATKA, "Kamchatka",
                                                      Arrays.asList(Territories.YAKUTSK, Territories.IRKUTSK,
                                                                    Territories.MONGOLIA, Territories.JAPAN
                                                      )
    );
    public static Territory YAKUTSK = new Territory(TerritoryEnum.YAKUTSK, "Yakutsk",
                                                    Arrays.asList(Territories.SIBERIA, Territories.IRKUTSK,
                                                                  Territories.KAMCHATKA
                                                    )
    );
    public static Territory SIBERIA = new Territory(TerritoryEnum.SIBERIA, "Siberia",
                                                    Arrays.asList(Territories.URAL, Territories.CHINA,
                                                                  Territories.YAKUTSK, Territories.IRKUTSK,
                                                                  Territories.MONGOLIA
                                                    )
    );
    //Asia
    public static Territory URAL = new Territory(TerritoryEnum.URAL, "Ural",
                                                 Arrays.asList(Territories.UKRAINE, Territories.SIBERIA,
                                                               Territories.CHINA, Territories.AFGHANISTAN
                                                 )
    );
    public static Territory UKRAINE = new Territory(TerritoryEnum.UKRAINE, "Ukraine",
                                                    Arrays.asList(Territories.SCANDINAVIA, Territories.NORTHERN_EUROPE,
                                                                  Territories.SOUTHERN_EUROPE, Territories.MIDDLE_EAST,
                                                                  Territories.AFGHANISTAN, Territories.URAL
                                                    )
    );
    public static Territory SCANDINAVIA = new Territory(TerritoryEnum.SCANDINAVIA, "Scandinavia",
                                                        Arrays.asList(Territories.ICELAND, Territories.GREAT_BRITAIN,
                                                                      Territories.NORTHERN_EUROPE, Territories.UKRAINE
                                                        )
    );
    public static Territory GREAT_BRITAIN = new Territory(TerritoryEnum.GREAT_BRITAIN, "Great Britain",
                                                          Arrays.asList(Territories.ICELAND, Territories.SCANDINAVIA,
                                                                        Territories.NORTHERN_EUROPE,
                                                                        Territories.WESTERN_EUROPE
                                                          )
    );
    //Europe
    public static Territory ICELAND = new Territory(TerritoryEnum.ICELAND, "Iceland",
                                                    Arrays.asList(Territories.GREENLAND, Territories.GREAT_BRITAIN,
                                                                  Territories.SCANDINAVIA
                                                    )
    );
    public static Territory GREENLAND = new Territory(TerritoryEnum.GREENLAND, "Greenland",
                                                      Arrays.asList(Territories.NORTH_WEST_TERRITORY,
                                                                    Territories.ONTARIO, Territories.QUEBEC,
                                                                    Territories.ICELAND
                                                      )
    );
    public static Territory ONTARIO = new Territory(TerritoryEnum.ONTARIO, "Ontario",
                                                    Arrays.asList(Territories.ALBERTA, Territories.NORTH_WEST_TERRITORY,
                                                                  Territories.QUEBEC, Territories.WESTERN_UNITED_STATES,
                                                                  Territories.EASTERN_UNITED_STATES,
                                                                  Territories.GREENLAND
                                                    )
    );
    public static Territory ALBERTA = new Territory(TerritoryEnum.ALBERTA, "Alberta",
                                                    Arrays.asList(Territories.ALASKA, Territories.NORTH_WEST_TERRITORY,
                                                                  Territories.ONTARIO, Territories.WESTERN_UNITED_STATES
                                                    )
    );
    public static Territory NORTH_WEST_TERRITORY =
            new Territory(TerritoryEnum.NORTH_WEST_TERRITORY, "North West Terriytory",
                          Arrays.asList(Territories.ALASKA, Territories.ALBERTA, Territories.ONTARIO,
                                        Territories.GREENLAND
                          )
            );
    //North America
    public static Territory ALASKA = new Territory(TerritoryEnum.ALASKA, "Alaska", Arrays.asList(Territories.KAMCHATKA,
                                                                                                 Territories.NORTH_WEST_TERRITORY,
                                                                                                 Territories.ALBERTA
    ));
}
