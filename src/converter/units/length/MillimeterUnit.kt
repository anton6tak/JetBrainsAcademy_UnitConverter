package converter.units.length

class MillimeterUnit(override val length: Double) : LengthUnit() {
    override val type: LengthUnitType
        get() = LengthUnitType.MILLIMETER
    override val abbreviated: String
        get() = "mm"
    override val oneUnit: String
        get() = "millimeter"
    override val manyUnits: String
        get() = "millimeters"
    override val toMeters: Double
        get() = length.times(0.001)
}