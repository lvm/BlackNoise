BlackNoise : UGen {
  *ar { arg mul = 0.0, add = 0.0;
    ^(DC.ar(0).dup(mul.size).madd(mul * 0, add));
  }
}