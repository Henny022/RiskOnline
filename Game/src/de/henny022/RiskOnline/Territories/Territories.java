package de.henny022.RiskOnline.Territories;

import java.util.Arrays;

/**
 * Created by henny on 24.09.16.
 */
public class Territories
{
    public static Territory ALASKA = new Territory(TerritoryEnum.ALASKA, "Alaska",
            Arrays.asList(TerritoryEnum.KAMCHATKA, TerritoryEnum.NORTH_WEST_TERRITORY, TerritoryEnum.ALBERTA));

    public static Territory NORTH_WEST_TERRITORY = new Territory(TerritoryEnum.NORTH_WEST_TERRITORY, "North West Terriytory",
            Arrays.asList(TerritoryEnum.ALASKA, TerritoryEnum.ALBERTA, TerritoryEnum.ONTARIO, TerritoryEnum.GREENLAND));

    public static Territory ALBERTA = new Territory(TerritoryEnum.ALBERTA, "Alberta",
            Arrays.asList(TerritoryEnum.ALASKA, TerritoryEnum.NORTH_WEST_TERRITORY, TerritoryEnum.ONTARIO, TerritoryEnum.WESTERN_UNITED_STATES));

    public static Territory ONTARIO = new Territory(TerritoryEnum.ONTARIO, "Ontario",
            Arrays.asList(TerritoryEnum.ALBERTA, TerritoryEnum.NORTH_WEST_TERRITORY, TerritoryEnum.QUEBEC, TerritoryEnum.WESTERN_UNITED_STATES, TerritoryEnum.EASTERN_UNITED_STATES, TerritoryEnum.GREENLAND));
}
