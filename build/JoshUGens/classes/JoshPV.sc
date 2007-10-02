// these will always operate on the current FFT buffer.
// HOWEVER, there will be numFrames of no transformations while the data is stored up

PV_NoiseSynthP : UGen
{
	*new {arg buffer, threshold = 0.1, numFrames = 2, initflag = 0;
		^this.multiNew('control', buffer, threshold, numFrames, initflag);
	}
}

PV_PartialSynthP : PV_NoiseSynthP {}

PV_NoiseSynthF : PV_NoiseSynthP {}

PV_PartialSynthF : PV_NoiseSynthP {}

PV_MagMap : UGen
{
	*new {arg buffer, mapbuf;
		^this.multiNew('control', buffer, mapbuf);
		}
}

PV_MaxMagN : UGen
{
	*new {arg buffer, numbins;
		^this.multiNew('control', buffer, numbins);
		}
}

PV_MinMagN : PV_MaxMagN { }

PV_MagBuffer : UGen
{
	*new {arg buffer, databuffer;
		^this.multiNew('control', buffer, databuffer)
		}

}

PV_FreqBuffer : PV_MagBuffer { }

PV_OddBin : UGen
{
	*new {arg buffer;
		^this.multiNew('control', buffer);
		}
}

PV_EvenBin : PV_OddBin {}

PV_Invert : UGen
{
	*new {arg buffer;
		^this.multiNew('control', buffer);
		}
}

PV_BinDelay : UGen 
{
	*new {arg buffer, maxdelay, delaybuf, fbbuf, hop = 0.5;
		^this.multiNew('control', buffer, maxdelay, delaybuf, fbbuf, hop);
		}
}

PV_Freeze : UGen
{
	*new { arg buffer, freeze = 0.0;
		^this.multiNew('control', buffer, freeze)
	}
}
/*
PV_Record : UGen
{
	*new { arg buffer, recbuf, offset = 0.0, run = 0.0, loop = 0.0;
		^this.multiNew('control', buffer, recbuf, offset, run, loop);
	}
}

// pointer from 0-1
PV_PlayBack : UGen
{
	*new { arg buffer, playbuf, pointer;
		^this.multiNew('control', buffer, playbuf, pointer);
	}
}
*/
/* these aren't really working... hmmm ... maybe make some UGens that output Freq and Mag data
but doesn't sort it... */
/*
PV_MaxSortF : UGen
{
	*new {arg buffer, databuffer;
		^this.multiNew('control', buffer, databuffer);
		}
	
}

PV_MaxSortM : PV_MaxSortF {}

*/