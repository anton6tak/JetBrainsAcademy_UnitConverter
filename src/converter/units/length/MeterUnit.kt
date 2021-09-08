package converter.units.length

class MeterUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.METER
    override val abbreviated: String
        get() = "m"
    override val oneUnit: String
        get() = "meter"
    override val manyUnits: String
        get() = "meters"
    override val toMeters: Double
        get() = length
    private val toCentimeters: Double
        get() = length.times(100)
    private val toFeet: Double
        get() = length.times(3.28084)
    private val toInches: Double
        get() = length.times(39.3701)
    private val toKilometers: Double
        get() = length.times(0.001)
    private val toMiles: Double
        get() = length.times(0.00062136887)
    private val toMillimeters: Double
        get() = length.times(1000)
    private val toYard: Double
        get() = length.times(1.09361329834)

    fun toType(type: LengthUnitType): Double {
        return when (type) {
            LengthUnitType.METER -> toMeters
            LengthUnitType.KILOMETER -> toKilometers
            LengthUnitType.CENTIMETER -> toCentimeters
            LengthUnitType.FOOT -> toFeet
            LengthUnitType.INCH -> toInches
            LengthUnitType.MILE -> toMiles
            LengthUnitType.MILLIMETER -> toMillimeters
            LengthUnitType.YARD -> toYard
        }
    }
}