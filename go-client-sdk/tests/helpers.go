// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package tests

import (
	"regexp"
	"sort"
	"strings"
)

func sortSerializedMaps(input interface{}, regex string, delim string) interface{} {
	sortString := func(input string) string {
		r := regexp.MustCompile(regex)

		return replaceAllStringSubmatchFunc(r, input, func(matches []string) string {
			result := matches[0]

			for i := 1; i < len(matches); i++ {
				match := matches[i]

				pairs := []string{}
				if strings.Contains(match, "=") {
					pairs = strings.Split(match, delim)

					sort.Slice(pairs, func(i, j int) bool {
						return strings.Split(pairs[i], "=")[0] < strings.Split(pairs[j], "=")[0]
					})
				} else {
					values := strings.Split(match, delim)

					if len(values) == 1 {
						pairs = values
					} else {
						pairs = make([]string, len(values)/2)
						for i := 0; i < len(values); i += 2 {
							pairs[i/2] = values[i] + delim + values[i+1]
						}
					}

					sort.Slice(pairs, func(i, j int) bool {
						return strings.Split(pairs[i], delim)[0] < strings.Split(pairs[j], delim)[0]
					})
				}

				match = strings.Join(pairs, delim)

				result = strings.Replace(result, matches[i], match, 1)
			}

			return result
		})
	}

	switch input := input.(type) {
	case string:
		return sortString(input)
	case []string:
		for i, v := range input {
			input[i] = sortString(v)
		}
		return input
	case map[string]string:
		for k, v := range input {
			input[k] = sortString(v)
		}
		return input
	default:
		panic("unsupported type")
	}
}

func replaceAllStringSubmatchFunc(re *regexp.Regexp, str string, repl func([]string) string) string {
	result := ""
	lastIndex := 0

	for _, v := range re.FindAllSubmatchIndex([]byte(str), -1) {
		groups := []string{}
		for i := 0; i < len(v); i += 2 {
			if v[i] == -1 || v[i+1] == -1 {
				groups = append(groups, "")
			} else {
				groups = append(groups, str[v[i]:v[i+1]])
			}
		}

		result += str[lastIndex:v[0]] + repl(groups)
		lastIndex = v[1]
	}

	return result + str[lastIndex:]
}