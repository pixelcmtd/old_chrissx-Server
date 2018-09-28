/*
 *  Copyright (c) 2010-2011 Julien Ponge. All rights reserved.
 *
 *  Portions Copyright (c) 2011 Tamas Cservenak.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package de.chrissx.util.thirdparty.lzma;

import java.io.IOException;
import java.io.InputStream;

import de.chrissx.util.thirdparty.lzma.more.CoderInputStream;

/**
 * An input stream that uses LZMA compression.
 *
 * @author Julien Ponge
 * @author Tamas Cservenak
 */
public class LzmaInputStream
        extends CoderInputStream
{
    public LzmaInputStream(final InputStream in, final Decoder lzmaDecoder)
            throws IOException
    {
        super(in, new LzmaDecoderWrapper(lzmaDecoder));
    }
}
