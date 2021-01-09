// See LICENSE.UCTECHIP for license details.
// See LICENSE.SZU for license details.
package vpu

trait CustomConfigParams {
  val seqmulDiv = Some(Array(
    VMulDivParams(mulUnroll = 2,   divUnroll = 2,   mulEarlyOut = true, divEarlyOut = true),
    VMulDivParams(mulUnroll = 4,   divUnroll = 4,   mulEarlyOut = true, divEarlyOut = true),
    VMulDivParams(mulUnroll = 8,   divUnroll = 8,   mulEarlyOut = true, divEarlyOut = true),
    VMulDivParams(mulUnroll = 16,  divUnroll = 16,  mulEarlyOut = true, divEarlyOut = true),
    VMulDivParams(mulUnroll = 32,  divUnroll = 32,  mulEarlyOut = true, divEarlyOut = true),
    VMulDivParams(mulUnroll = 64,  divUnroll = 64,  mulEarlyOut = true, divEarlyOut = true),
    VMulDivParams(mulUnroll = 128, divUnroll = 128, mulEarlyOut = true, divEarlyOut = true),
    VMulDivParams(mulUnroll = 256, divUnroll = 256, mulEarlyOut = true, divEarlyOut = true)
  ))
  val customConfig = VPUParams(VLEN     = 64, 
                               ELEN     = 64, 
                               XLEN     = 64, 
                               FLEN     = 64, 
                               ZFINX    = false, 
                               FSEW16   = false, 
                               FSEWMAX  = 64, 
                               RMUL     = 1, 
                               MERGE    = true, 
                               MULDIV   = true, 
                               mulDiv   = seqmulDiv, 
                               MULADD   = true, 
                               SATADD   = true, 
                               AVERADD  = true, 
                               SATMUL   = true, 
                               SCALESR  = true, 
                               NCLIP    = true, 
                               FMA      = true, 
                               FCVT     = true, 
                               FCMP     = true, 
                               FMINMAX  = true, 
                               FSGNJ    = true, 
                               FCLASS   = true, 
                               FMERGE   = true, 
                               FDIVSQRT = true, 
                               FRSQRT   = true, 
                               FRECE    = true, 
                               RED      = true, 
                               FRED     = true, 
                               POPC     = true, 
                               FIRST    = true, 
                               MINDEX   = true, 
                               IOTA     = true, 
                               INDEX    = true, 
                               MBITWISE = true, 
                               MV       = true, 
                               FMV      = true, 
                               SLIDE    = true, 
                               GATHER   = true, 
                               COMPRESS = true, 
                               COPY     = true)
}