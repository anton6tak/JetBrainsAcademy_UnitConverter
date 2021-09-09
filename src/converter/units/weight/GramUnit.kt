package converter.units.weight

class GramUnit(override val weight: Double) : WeightUnit() {
    override val type: WeightUnitType
        get() = WeightUnitType.GRAM
    override val abbreviated: String
        get() = "g"
    override val oneUnit: String
        get() = "gram"
    override val manyUnits: String
        get() = "grams"
    override val toGrams: Double
        get() = weight
    private val toKilograms : Double
        get() = weight.times(0.001)
    private val toMilligrams : Double
        get() = weight.times(1000)
    private val toOunces : Double
        get() = weight.times(0.035274)
    private val toPounds : Double
        get() = weight.times(0.00220462)

    fun toType(type: WeightUnitType): Double {
        return when (type) {
            WeightUnitType.GRAM -> toGrams
            WeightUnitType.MILLIGRAM -> toMilligrams
            WeightUnitType.OUNCE -> toOunces
            WeightUnitType.POUND -> toPounds
            WeightUnitType.KILOGRAM -> toKilograms
        }
    }
}