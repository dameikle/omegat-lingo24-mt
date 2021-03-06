/*
 * This code is only a stub.
 *
 * Copyright (C) 2015 David Meikle <david@logicalspark.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.omegat.core.machinetranslators;

import org.omegat.util.Language;

public abstract class BaseTranslate {
    
    protected abstract String getPreferenceName();
    
    protected abstract String translate(Language sLang, Language tLang, String text) throws Exception;
    
    protected String cleanSpacesAroundTags(String result, String text) {
        return null;
    }

    protected String getFromCache(Language sLang, Language tLang, String text) {
        return null;
    }

    protected String putToCache(Language sLang, Language tLang, String text, String result) {
        return null;
    }

}
