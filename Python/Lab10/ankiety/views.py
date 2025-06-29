from django.http import HttpResponse
def index(request):
    return HttpResponse("Jesteśmy w przykładowej aplikacji Django-ankiety!")